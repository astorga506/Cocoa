<%-- 
    Document   : bienvenida
    Created on : May 5, 2014, 9:26:59 PM
    Author     : Carlos
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <b>Session Time: </b><%= new Date(session.getLastAccessedTime())%>
        
    </body>
</html>
