<%-- 
    Document   : listado_productos
    Created on : 14/05/2014, 07:41:53 PM
    Author     : Mauro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

                <div id="login">
                    <div id="login-bot">
                        <div id="login-box">
                            <h2 class="login"><em>Usuario</em>Registro</h2>
                            <s:form action="iniciarSesion" method="post"> 
                                <div id="login-username">
                                    <div><label for="nombre">nombre</label>: <input type="text" name="username" value="" id="username" /></div>
                                    <div><label for="apellidos">apellidos</label>: <input type="text" name="username" value="" id="username" /></div>
                                    <div><label for="correo">correo</label>: <input type="text" name="username" value="" id="username" /></div>
                                    <div><label for="telefono">telefono</label>: <input type="text" name="username" value="" id="username" /></div>
                                    <div><label for="password">contraseña</label>: <input type="password" name="password" value="" id="password" /></div>
                                    <div><label for="contraseñaConfirmada">confirme contraseña</label>: <input type="password" name="password" value="" id="password" /></div>							
                                </div>
                                <div id="login-button">
                                    <input type="image" src="imagenes/btn_login.gif" name="l" value="h" id="l" />
                                </div>
                            </s:form>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
