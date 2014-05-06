<%-- 
    Document   : prototipo_login
    Created on : May 5, 2014, 12:31:01 PM
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="iniciarSesion" method="get">
            <s:textfield name="usuario" label="Usuario"/>
            <s:password name="contrasena" label="Contraseña"/>
            <s:submit label="Iniciar Sesión"/>
        </s:form>
    </body>
</html>
