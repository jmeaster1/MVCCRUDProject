<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rivers</title>
<link rel="stylesheet" href="mastercss.css">
</head>
<body class="bodyclass">
	<div class="jsp-container">
		<c:choose>
			<c:when test="${! empty river}">

				<div class="jsp-river-info">

					<img src="${river.imgurl}" class="riverIMG">
					<p class="rivername">${river.name}</p>
					<p><br></p>
					<p>${river.county}</p>
					<p>${river.fact}</p>
					<br>
				</div>
	</div>


	</c:when>
	<c:otherwise>
		<p>${river.name} has been deleted</p>
	</c:otherwise>
	</c:choose>
</body>
</html>