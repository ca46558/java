<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    
     String name = request.getParameter("name");
if(name == null) name = "Hello, World";
HashSet<Integer> set = new HashSet<>();
while(set.size() < 6) set.add((int)Math.random()*49+1);
%>


<!DOCTYPE html>
<html>
<head>
       <meta charset="UTF-8">
       <title>Insert title here</title>
</head>
        <body>
<div>Hello, <% out.print(name); %></div>
<div>Lottery: <% out.print((int)(Math.random()*49+1)); %></div>
<div>Lottery: <%= (int)(Math.random()*49+1) %></div>
<hr>





        </body>
</html>