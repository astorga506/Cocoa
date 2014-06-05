<%-- 
    Document   : listado_productos
    Created on : 14/05/2014, 07:41:53 PM
    Author     : Mauro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css" charset="utf-8" />	
    </head>
    <body>
        <div id="outer">
            <div id="wrapper">
                <div id="nav">
                    <div id="nav-left">
                        <div id="nav-right">
                            <ul>    			  
                                <li><a href="index.html">INICIO</a></li>
                                <li><a href="lista_productos.jsp">PRODUCTOS</a></li>    			  
                            </ul>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div id="footer">
                    <div id="footloose">
                        <span class="logo">
                            <span class="top">
                                <s:text name="global.nombre.top"/>
                            </span><span class="gadgets">
                                <s:text name="global.nombre.gadgets"/>
                            </span>
                        </span>
                    </div>
                    <p><a href="http://www.freewebsitetemplates.com"><s:text name="global.mensaje.privacidad"/></a> 
                        <strong>&nbsp;:&nbsp;</strong> 
                        <a href="http://www.freewebsitetemplates.com"><s:text name="global.mensaje.terminos"/></a> <br />
                        &copy; <s:text name="global.mensaje.copyright"/></p>
                </div>	
            </div>
        </div>
    </body>
</html>
