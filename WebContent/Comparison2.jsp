<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>SkinSkule - Comparison</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Date Picker Javascript -->
<!-- https://jqueryui.com/datepicker/ -->
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>


<style>
   fieldset {
     border: 0;
   }
   label {
     display: block;
     margin: 30px 0 0 0;
   }
   .overflow {
     height: 200px;
   }
 </style>

<link rel="stylesheet" type="text/css" href="css/mystyle.css">

</head>
<body>

	<%@ include file="navbar.jsp"%>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-1 sidenav">
				<!-- You can put left sidebar links here if you want to. -->
			</div>
			<div class="col-sm-10 text-left">
					<h1>Compare Products - Next 2</h1>
					<table align="center" style="width:100%">
					
						<tr>
						    <td align="center"><b>Product Name</b></th>
						    <c:forEach items="${products}" var="product">
								<td align="center"> <b> <c:out
											value="${product.getProductName()}" /></b></th>
							</c:forEach>
  						</tr>
  						
  						<tr>
						    <td align="center">Product Picture</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"> <img src = '<c:out
											value='${product.getProductImage()}' />' width="230" height="230"> </td>
							</c:forEach>
  						</tr>
 						
  						<tr>
							<td align="center">Product Descriptions:</td>
    						<c:forEach items="${products}" var="product">
    							
								<td align="center"><c:out
											value="${product.getProductDescription()}"  /></td>
							</c:forEach>
						</tr>
  						
  						<tr>
						    <td align="center">Brand</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getBrandID()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Skin Type</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getSkinType()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Purpose</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getPurpose()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Usage</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getUsage()}" /></td>
							</c:forEach>
  						</tr>
						<tr>
						    <td align="center">Ratings</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getRating()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Active Ingredients</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getActiveIngredient()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Cruelty-Free</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getCrueltyFree()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Price</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"> <c:out
											value="${product.getPrice()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Size</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getSize()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Price Per Ml</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getPricePerMl()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Available in Sephora</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getSephora()}" /></td>
							</c:forEach>
  						</tr>
  						<tr>
						    <td align="center">Available in Shopper's <br> Drug Mart</td>
						    <c:forEach items="${products}" var="product">
								<td align="center"><c:out
											value="${product.getShoppers()}" /></td>
							</c:forEach>
  						</tr>
  						
					</table>
					<br>
				
				
			</div>
			
			<div class="col-sm-1 sidenav">
				<!-- You can put right sidebar links here if you want to. -->
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>


</body>
</html>