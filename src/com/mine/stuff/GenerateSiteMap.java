package com.mine.stuff;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateSiteMap
 */
public class GenerateSiteMap extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String GENERATE_XML_URL = "http://localhost:4502/content/starhub/site-configuration/sitemap-generator/_jcr_content/par/sitemapgenerator.html";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateSiteMap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter w = response.getWriter();
		try{
			URL urlxml = new URL(GENERATE_XML_URL);
			w.println(GENERATE_XML_URL);
			HttpURLConnection  con = (HttpURLConnection) urlxml.openConnection();
			con.setRequestMethod("POST");
			
			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.flush();
			wr.close();

			w.println("response code: " + con.getResponseCode());
			Map<String, List<String>> h = con.getHeaderFields();
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
