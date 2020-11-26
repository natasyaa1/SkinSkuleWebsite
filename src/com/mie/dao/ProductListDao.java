package com.mie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mie.model.Product;
import com.mie.util.DbUtil;

public class ProductListDao {

	/**
	 * This class handles all of the Product-related methods
	 * (get).
	 */

	private Connection connection;

	public ProductListDao() {
		/**
		 * Get the database connection.
		 */
		connection = DbUtil.getConnection();
	}
	
	public List<Product> getAllProduct() {
		/**
		 * This method returns the list of all products in the form of a List
		 * object.
		 */
		List<Product> products = new ArrayList<Product>();
		try {
			Statement statement = connection.createStatement();
			// System.out.println("getting products from table");
			ResultSet rs = statement.executeQuery("select * from Products");
			while (rs.next()) {
				Product prod = new Product();
				prod.setProductID(rs.getInt("Product_ID"));
				prod.setSkinType(rs.getString("SkinType_ID"));
				prod.setBrandID(rs.getInt("Brand_ID"));
				prod.setProductType(rs.getString("Product_Type"));
				prod.setPurpose(rs.getString("Product_Purpose"));
				prod.setProductName(rs.getString("Product_Name"));
				prod.setRating(rs.getInt("Stars"));
				prod.setUsage(rs.getString("Usage"));
				prod.setActiveIngredient(rs.getString("Ingredients"));
				prod.setPrice(rs.getDouble("Price"));
				prod.setSize(rs.getInt("Size"));
				prod.setPricePerMl(rs.getDouble("Price_Per_Unit"));
				prod.setCrueltyFree(rs.getString("Cruelty_Free"));
				prod.setShoppers(rs.getString("Shoppers"));
				prod.setSephora(rs.getString("Sephora"));
				prod.setProductDescription(rs.getString("Description"));
				prod.setProductImage(rs.getString("ImageURL"));
				prod.setProductWebsite(rs.getString("ProductURL"));
				products.add(prod);
			
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}
	
	public List<Product> getProductsByKeyword(String pT) {
		/**
		 * This method retrieves a list of products that matches the product type pT
		 * selected by the user in the drop down.
		 */
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from Products where Product_Type LIKE ?");

			preparedStatement.setString(1, "%" + pT + "%");
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setProductName(rs.getString("Product_Name"));
				products.add(prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}
	
	public List<Product> getProductByName(String pN1, String pN2,String pN3,String pN4) {
		/**
		 * This method retrieves a product that matches the product name
		 * selected by the user in the drop down.
		 */
		List<Product> products = new ArrayList<Product>();
		
		
		try {
			PreparedStatement preparedStatement = connection
							.prepareStatement("select * from Products where Product_Name LIKE ? ");

			preparedStatement.setString(1, "%" + pN1 + "%");
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setProductID(rs.getInt("Product_ID"));
				prod.setSkinType(rs.getString("SkinType_ID"));
				prod.setBrandID(rs.getInt("Brand_ID"));
				prod.setProductType(rs.getString("Product_Type"));
				prod.setPurpose(rs.getString("Product_Purpose"));
				prod.setProductName(rs.getString("Product_Name"));
				prod.setRating(rs.getInt("Stars"));
				prod.setUsage(rs.getString("Usage"));
				prod.setActiveIngredient(rs.getString("Ingredients"));
				prod.setPrice(rs.getDouble("Price"));
				prod.setSize(rs.getInt("Size"));
				prod.setPricePerMl(rs.getDouble("Price_Per_Unit"));
				prod.setCrueltyFree(rs.getString("Cruelty_Free"));
				prod.setShoppers(rs.getString("Shoppers"));
				prod.setSephora(rs.getString("Sephora"));
				prod.setProductDescription(rs.getString("Description"));
				prod.setProductImage(rs.getString("ImageURL"));
				prod.setProductWebsite(rs.getString("ProductURL"));
				products.add(prod);
				
			}
			preparedStatement = connection
					.prepareStatement("select * from Products where Product_Name LIKE ? ");

			preparedStatement.setString(1, "%" + pN2 + "%");
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setProductID(rs.getInt("Product_ID"));
				prod.setSkinType(rs.getString("SkinType_ID"));
				prod.setBrandID(rs.getInt("Brand_ID"));
				prod.setProductType(rs.getString("Product_Type"));
				prod.setPurpose(rs.getString("Product_Purpose"));
				prod.setProductName(rs.getString("Product_Name"));
				prod.setRating(rs.getInt("Stars"));
				prod.setUsage(rs.getString("Usage"));
				prod.setActiveIngredient(rs.getString("Ingredients"));
				prod.setPrice(rs.getDouble("Price"));
				prod.setSize(rs.getInt("Size"));
				prod.setPricePerMl(rs.getDouble("Price_Per_Unit"));
				prod.setCrueltyFree(rs.getString("Cruelty_Free"));
				prod.setShoppers(rs.getString("Shoppers"));
				prod.setSephora(rs.getString("Sephora"));
				prod.setProductDescription(rs.getString("Description"));
				prod.setProductImage(rs.getString("ImageURL"));
				prod.setProductWebsite(rs.getString("ProductURL"));
				products.add(prod);
			}
			
			preparedStatement = connection
					.prepareStatement("select * from Products where Product_Name LIKE ? ");

			preparedStatement.setString(1, "%" + pN3 + "%");
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setProductID(rs.getInt("Product_ID"));
				prod.setSkinType(rs.getString("SkinType_ID"));
				prod.setBrandID(rs.getInt("Brand_ID"));
				prod.setProductType(rs.getString("Product_Type"));
				prod.setPurpose(rs.getString("Product_Purpose"));
				prod.setProductName(rs.getString("Product_Name"));
				prod.setRating(rs.getInt("Stars"));
				prod.setUsage(rs.getString("Usage"));
				prod.setActiveIngredient(rs.getString("Ingredients"));
				prod.setPrice(rs.getDouble("Price"));
				prod.setSize(rs.getInt("Size"));
				prod.setPricePerMl(rs.getDouble("Price_Per_Unit"));
				prod.setCrueltyFree(rs.getString("Cruelty_Free"));
				prod.setShoppers(rs.getString("Shoppers"));
				prod.setSephora(rs.getString("Sephora"));
				prod.setProductDescription(rs.getString("Description"));
				prod.setProductImage(rs.getString("ImageURL"));
				prod.setProductWebsite(rs.getString("ProductURL"));
				products.add(prod);
			}
			
			preparedStatement = connection
					.prepareStatement("select * from Products where Product_Name LIKE ? ");

			preparedStatement.setString(1, "%" + pN4 + "%");
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product prod = new Product();
				prod.setProductID(rs.getInt("Product_ID"));
				prod.setSkinType(rs.getString("SkinType_ID"));
				prod.setBrandID(rs.getInt("Brand_ID"));
				prod.setProductType(rs.getString("Product_Type"));
				prod.setPurpose(rs.getString("Product_Purpose"));
				prod.setProductName(rs.getString("Product_Name"));
				prod.setRating(rs.getInt("Stars"));
				prod.setUsage(rs.getString("Usage"));
				prod.setActiveIngredient(rs.getString("Ingredients"));
				prod.setPrice(rs.getDouble("Price"));
				prod.setSize(rs.getInt("Size"));
				prod.setPricePerMl(rs.getDouble("Price_Per_Unit"));
				prod.setCrueltyFree(rs.getString("Cruelty_Free"));
				prod.setShoppers(rs.getString("Shoppers"));
				prod.setSephora(rs.getString("Sephora"));
				prod.setProductDescription(rs.getString("Description"));
				prod.setProductImage(rs.getString("ImageURL"));
				prod.setProductWebsite(rs.getString("ProductURL"));
				products.add(prod);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}


}
