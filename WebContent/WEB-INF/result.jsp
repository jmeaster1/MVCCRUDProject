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
		<div class="jsp-river-info">

			

			<p class="rivername">${river.name}</p>
			<p>${river.county}</p>
			
			<br>

		</div>
		<c:choose>
			<c:when test="${! empty river}">

				<div class="jsp-river-info">


					<p class="rivername">${river.name}</p>
					<p>${river.county}</p>
					<br>

				</div>


			</c:when>
			<c:otherwise>
				<p>No river found</p>
			</c:otherwise>
		</c:choose>
</body>
</html>