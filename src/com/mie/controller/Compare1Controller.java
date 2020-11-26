package com.mie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mie.dao.ProductListDao;

public class Compare1Controller extends HttpServlet {
	/**
	 * This class only handles the SEARCH feature of the web app.
	 * 
	 * These are variables that lead to the appropriate JSP pages.
	 * 
	 * SEARCH_USER leads to the search results page.
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String SEARCH_PRODUCT4 = "/Comparison2.jsp";
	private ProductListDao dao;

	/**
	 * Constructor for this class. 
	 */
	public Compare1Controller() {
		super();
		dao = new ProductListDao();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/**
		 * This method handles the retrieval of the search keyword entered by
		 * the user.
		 */
		String product1 = request.getParameter("product1");
		String product2 = request.getParameter("product2");
		String product3 = request.getParameter("product3");
		String product4 = request.getParameter("product4");
		
		
		
		RequestDispatcher view = request.getRequestDispatcher(SEARCH_PRODUCT4);
		request.setAttribute("product1", product1);
		request.setAttribute("product2", product2);
		request.setAttribute("product3", product3);
		request.setAttribute("product4", product4);
		request.setAttribute("products", dao.getProductByName(product1,product2,product3,product4));

		
		/**
		 * Redirect to the search results page after the list of students
		 * matching the keywords has been retrieved.
		 */

		view.forward(request, response);
	}
}	
