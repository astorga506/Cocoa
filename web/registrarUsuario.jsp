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
                <div id="login">
                    <div id="login-bot">
                        <div id="login-box">
                            <h2 class="login"><em>Usuario</em>Registro</h2>
                            <s:form action="registrarUsuario" method="post"> 
                                <div id="login-username">
                                    <div><s:textfield name="correo" key="registro.formulario.correo"/></div>
                                    <div><s:textfield name="nombreCliente" label="Nombre"/></div>
                                    <div><s:textfield name="apellidosCliente" label="Apellidos"/></div>  
                                    <div><s:password name="contrasena" label="Contraseña"/></div>
                                    <div><s:password name="contrasenaConf" label="Confirmar Contraseña"/></div>							
                                </div>
                                <div id="login-button">
                                    <s:submit type="image" src="imagenes/btn_login.gif"/>
                                </div>
                            </s:form>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>  
                <div id="footer">
                    <div id="footloose"><span class="logo"><span class="top"><s:text name="global.nombre.top"/></span><span class="gadgets"><s:text name="global.nombre.gadgets"/></span></span></div>
                    <p><a href="http://www.freewebsitetemplates.com"><s:text name="global.mensaje.privacidad"/></a> <strong>&nbsp;:&nbsp;</strong> <a href="http://www.freewebsitetemplates.com"><s:text name="global.mensaje.terminos"/></a> <br />
                        &copy; <s:text name="global.mensaje.copyright"/></p>
                </div>	
            </div>
        </div>
    </body>
</html>
