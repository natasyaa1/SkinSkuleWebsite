<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>MIE350 Sample Web App - Comparison Next 1</title>
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

<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>

	<%@ include file="navbar.jsp"%>



	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<!-- You can put left sidebar links here if you want to. -->
			</div>
			<div class="col-sm-8 text-left">
				<h1>Compare Products - Next 1</h1>

				Select the "<b><font
					color=red><%=request.getAttribute("keyword")%>s</font></b>" that you want to compare:<br> <br>
				
					Select <b><%=request.getAttribute("keyword")%></b> 1:<br>
					<form method="POST" action='Compare1Controller' name="frmAddUser">
						<select name = "product1" id = "p1">
							<option value = "defaultProductType"> Choose the Product Type </option>
							<c:forEach items="${products}" var="product">
									<option > <c:out
											value="${product.getProductName()}" /> </option>
								
							</c:forEach>
							
						</select>
						<br>
      
					
					Select <b><%=request.getAttribute("keyword")%></b> 2:<br>
						<select name = "product2" id = "p2">
							<option value = "defaultProductType"> Choose the Product Type </option>
							<c:forEach items="${products}" var="product">
									<option > <c:out
											value="${product.getProductName()}" /> </option>
								
							</c:forEach>
							
						</select>
						
						<br>
      
					Select <b><%=request.getAttribute("keyword")%></b> 3:<br>
						<select name = "product3" id = "p3">
							<option value = "defaultProductType"> Choose the Product Type </option>
							<c:forEach items="${products}" var="product">
									<option > <c:out
											value="${product.getProductName()}" /> </option>
								
							</c:forEach>
							
						</select>
						<br>
      
					
					Select <b><%=request.getAttribute("keyword")%></b> 4:<br>
						<select name = "product4" id = "p4">
							<option value = "defaultProductType"> Choose the Product Type </option>
							<c:forEach items="${products}" var="product">
									<option > <c:out
											value="${product.getProductName()}" /> </option>
								
							</c:forEach>
							
						</select>
						<br>
						<br>
					<button type = "reset" onclick="window.location='Comparison4.jsp'"> Reset </button>
					
					<input type="submit" class="btn btn-info" value="Compare" style="float: right;"/>
      
					</form>
				


			</div>
			<div class="col-sm-2 sidenav">
				<!-- You can put right sidebar links here if you want to. -->
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>


</body>
</html>


