package com.mine.stuff;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CallSiteMap
 */
public class CallSiteMap extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SITE_MAP_URL = "http://www.starhub.com/sitemap.xml";
	private static final String GOOGLE_URL = "http://www.google.com/webmasters/tools/ping?sitemap=";
	//private static final String GOOGLE_URL = "http://www.google.com";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CallSiteMap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter w = response.getWriter();
		try{
			String urlEncoded = URLEncoder.encode(SITE_MAP_URL);
			String urlPing = GOOGLE_URL + urlEncoded;
			w.println(urlPing);
			URL urldemo = new URL(urlPing);
			URLConnection yc = urldemo.openConnection();
			Map<String, List<String>> h = yc.getHeaderFields();
			Object[] t = h.entrySet().toArray();
			for(Object o : t ){
				w.println(o.toString());
			}
			w.println("connection success");
		} catch(IOException ioe){
			w.println("connection error: io error");
		} catch (Exception e){
			w.println("connection error: general error");			
			w.println("error message: " + e.getMessage());
			w.println("error localize message: " + e.getLocalizedMessage());
		}
	}

}
