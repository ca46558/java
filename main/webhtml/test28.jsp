<%@page import="tw.test.apis.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Bike bike = new Bike();
    bike.upSpeed().upSpeed().upSpeed();
    request.setAttribute("bike", bike);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>