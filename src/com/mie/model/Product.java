package com.mie.model;

public class Product {
	
	/**
	 * This class contains all of the relevant information, and getter/setter
	 * methods for the Product object.
	 */
	
	
	private int productID;
	private String skinType;
	private int brandID;
	private String productType;
	private String purpose;
	private String productName;
	private int ratings;
	private String usage;
	private String activeIngredient;
	private double price;
	private int size;
	private double pricePerMl;
	private String crueltyFree;
	private String sephora;
	private String shoppers;
	private String productDescription;
	private String productImageURL;
	private String productWebsiteURL;

	
	public int setBrandID(int bID) {
		return this.brandID = bID;
	}

	public String setSkinType(String sT) {
		return this.skinType = sT;
	}
	
	public int setProductID( int pID) {
		return this.productID = pID;
	}

	public String setProductType(String pT) {
		return this.productType = pT;
	}
	
	public String setPurpose(String p) {
		return this.purpose = p;
	}

	public String setProductName(String pN) {
		return this.productName = pN;
	}
	
	public int setRating(int r) {
		return this.ratings = r;
	}
	
	public String setUsage(String u) {
		return this.usage = u;
	}
	
	public String setActiveIngredient(String aI) {
		return this.activeIngredient = aI;
	}
	
	public double setPrice(double pr) {
		return this.price = pr;
	}
	
	public int setSize(int s) {
		return this.size = s;
	}
	
	public double setPricePerMl(double pPM) {
		return this.pricePerMl;
	}
	
	public String setCrueltyFree(String cF) {
		return this.crueltyFree = cF;
	}
	
	public String setSephora(String sep) {
		return this.sephora = sep;
	}
	
	public String setShoppers(String shop) {
		return this.shoppers = shop;
	}
	
	public String setProductDescription(String pD) {
		return this.productDescription = pD;
	}
	
	public String setProductImage(String pI) {
		return this.productImageURL = pI;
	}
	
	public String setProductWebsite(String pW) {
		return this.productWebsiteURL = pW;
	}
	
	
	public int getBrandID() {
		return brandID;
	}

	public String getSkinType() {
		return skinType;
	}
	
	public int getProductID() {
		return productID;
	}

	public String getProductType() {
		return productType;
	}
	
	public String getPurpose() {
		return purpose;
	}

	public String getProductName() {
		return productName;
	}
	
	public int getRating() {
		return ratings;
	}
	
	public String getUsage() {
		return usage;
	}
	
	public String getActiveIngredient() {
		return activeIngredient;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getSize() {
		return size;
	}
	
	public double getPricePerMl() {
		return pricePerMl;
	}
	
	public String getCrueltyFree() {
		return crueltyFree;
	}
	
	public String getSephora() {
		return sephora;
	}
	
	public String getShoppers() {
		return shoppers;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public String getProductImage() {
		return productImageURL;
	}
	
	public String getProductWebsite() {
		return productWebsiteURL;
	}
	
	@Override
	public String toString() {
		return "Product [brandID=" + brandID + ", skinType=" + skinType
				+ ", productID=" + productID + ", productType=" + productType + ", purpose="
				+ purpose + ", productName=" + productName + ", ratings=" + ratings + ", usage=" 
				+ usage + ", activeIngredient=" + activeIngredient + ", price=" + price 
				+ ", size=" + size + ", pricePerMl=" + pricePerMl +  ", crueltyFree=" + crueltyFree 
				+ ", sephora=" + sephora + ", shoppers=" + shoppers + ", productDescription=" + productDescription 
				+ ", productImage=" + productImageURL + ", productWebsiteURL=" + productWebsiteURL +  "]";
	}
	
}
