<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rivers</title>
</head>
<body>
  <c:choose>
    <c:when test="${! empty river}">
      <ul>
        <li>${river.county}</li>
        <li>${river.name}</li>
        <li>${river.streamType}</li>
      </ul>
    </c:when>
    <c:otherwise>
      <p>No river found</p>
    </c:otherwise>
  </c:choose>
</body>
</html>