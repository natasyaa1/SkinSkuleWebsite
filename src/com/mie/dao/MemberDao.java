package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.mie.util.DbUtil;
import com.mie.model.*;
import com.mie.controller.*;
import com.mie.util.*;


public class MemberDao {

	/**
	 * This class handles the Member objects and the login component of the web
	 * app.
	 */
	static Connection currentCon = null;
	static ResultSet rs = null;

	public static Member login(Member member) {

		/**
		 * This method attempts to find the member that is trying to log in by
		 * first retrieving the username and password entered by the user.
		 */
		Statement stmt = null;

		String email = member.getEmail();
		String password = member.getPassword();

		/**
		 * Prepare a query that searches the members table in the database
		 * with the given username and password.
		 */
		String searchQuery = "select * from Users where Email_Address='"
				+ email + "' AND Password='" + password + "'";

		try {
			// connect to DB
			currentCon = DbUtil.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			/**
			 * If there are no results from the query, set the member to false.
			 * The person attempting to log in will be redirected to the home
			 * page when isValid is false.
			 */
			
			if (!more) {
				member.setValid(false);
			}

			/**
			 * If the query results in an database entry that matches the
			 * username and password, assign the appropriate information to
			 * the Member object.
			 */
			else if (more) {
				String Name = rs.getString("Name");

				member.setName(Name);
				member.setValid(true);
			}
		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! "
					+ ex);
		}
		/**
		 * Return the Member object.
		 */
		return member;

	}
	
	public static boolean checkemail(Member member) {

		/**
		 * This method attempts to find the member that is trying to log in by
		 * first retrieving the username and password entered by the user.
		 */
		Statement stmt = null;

		String email = member.getEmail();

		/**
		 * Prepare a query that searches the members table in the database
		 * with the given username and password.
		 */
		String searchQuery = "select * from members where email='"
				+ email + "'";

		try {
			// connect to DB
			currentCon = DbUtil.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();

			/**
			 * If there are no results from the query, set the boolean to true.
			 * 
			 * 
			 */
			
			if (!more) {
				
				return true;
				//member.setValid(false);
			}

			/**
			 * If the query results in an database entry that matches an
			 * email in the database, set the boolean to false
			 * ask the user to login instead
			 */
			else if (more) {
//				String firstName = rs.getString("FirstName");
//				String lastName = rs.getString("LastName");
//
//				member.setFirstName(firstName);
//				member.setLastName(lastName);
//				member.setValid(true);
				return false;
			}
		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! "
					+ ex);
		}
		/**
		 * Return the Member object.
		 */
		//return member;
		return false;


	}
	public static void adduser(Member member) {
		Statement stmt = null;
		//Integer user_id = member.getUser_ID();
		String name = member.getName();
		String email = member.getEmail();
		String password = member.getPassword();
		String skintype_id = member.getSkinType_ID();
		Date date = new Date();

		/**
		 * Prepare a query that searches the members table in the database
		 * with the given username and password.
		 */
		String insertQuery = "insert into users(Name, Email_Address, Password, SkinType_ID) "
				+ "VALUES (" + name + ", " +
          email + ", " + password + ", " + skintype_id + ")";
		try{
			currentCon = DbUtil.getConnection();
			PreparedStatement preparedStatement = currentCon.prepareStatement(insertQuery);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
