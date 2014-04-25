package com.mine.stuff;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import utils.X;

/**
 * Servlet implementation class ProxyService
 */
public class JsonDataService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonDataService() {
        super();
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
		//lets read the parameters passed
		PrintWriter w = response.getWriter();
		String param1 = request.getParameter("param1");
		response.setContentType("application/json");
		JSONObject jsonObj = new JSONObject();	
		jsonObj.put("result", "awesome");
		jsonObj.put("datetime", Calendar.getInstance().getTime().toString());
		w.print(jsonObj.toJSONString());
		X.log(param1);
		X.log(jsonObj.toJSONString());
	}
}
