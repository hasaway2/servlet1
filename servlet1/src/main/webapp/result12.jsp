<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.high {
		color: red;
	}
	.low {
		color: green;
	}
</style>
</head>
<body>
	${result }
	<hr>
	<ul>
		<li>이름 : ${product.name }</li>
		<c:choose>
			<c:when test="${product.price>=3000 }">
				<li>가격 : <span class="high">${product.price }</span></li>
			</c:when>
			<c:otherwise>
				<li>가격 : <span class="low">${product.price }</span></li>
			</c:otherwise>
		</c:choose>
	</ul>
</body>
</html>