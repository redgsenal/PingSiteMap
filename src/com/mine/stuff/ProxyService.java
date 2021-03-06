package com.mine.stuff;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.X;

/**
 * Servlet implementation class ProxyService
 */
public class ProxyService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String FB_URL = "https://graph.facebook.com";
	private static final String STARHUB_PAGE = "http://publish-green.ddbstaging.com/personal/promotions/mobile/blackberry-z30.html";
	private static final String PROXY_IP = "10.0.0.1";
	private static final int PROXY_PORT_NO = 8080;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProxyService() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter w = response.getWriter();
		javax.net.ssl.HttpsURLConnection con = null;

		try {
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_IP, PROXY_PORT_NO));
			URL urlfb = new URL(FB_URL);
			con = (javax.net.ssl.HttpsURLConnection) urlfb.openConnection(proxy);
			String urlParameters = "id=" + (URLEncoder.encode(STARHUB_PAGE))
					+ "&scrape=true";

			w.println(FB_URL);
			w.println(urlParameters);

			// send post request
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestProperty("charset", "utf-8");
			con.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			con.setRequestProperty("Content-Length", ""
					+ (new java.lang.String(urlParameters)).getBytes().length);
			con.setUseCaches(false);
			con.setRequestMethod("POST");

			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters.toString());
			wr.flush();
			wr.close();
			Map<String, List<String>> h = con.getHeaderFields();
			Object[] t = h.entrySet().toArray();
			for (int i = 0; i < t.length; i++) {
				w.println(t[i]);
			}
			w.println("connection success");
		} catch (IOException ioe) {
			w.println("connection error: io error");
			ioe.printStackTrace();
		} catch (Exception e) {
			w.println("connection error: general error");
			w.println("error message: " + e.getMessage());
			w.println("error localize message: " + e.getLocalizedMessage());
			e.printStackTrace();
		} finally {
		}
	}
}
