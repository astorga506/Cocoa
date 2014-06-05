<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title><s:text name="global.titulo"/></title>
        <s:url action="registro.action" var="registrar"/>
        <s:url action="buscarProductos.action" var="productos"/>
        <s:url action="registro.action" var="carrito"/>
        <link rel="stylesheet" href="css/style.css" type="text/css" charset="utf-8" />	
    </head>
    <body>
        <div id="outer">
            <div id="wrapper">
                <div id="nav">
                    <div id="nav-left">
                        <div id="nav-right">
                            <ul>
                                <li><a href="<s:property value="#productos"/>"><s:text name="global.productos"/></a></li>
                                <li><a><s:text name="global.carrito"/></a></li>
                                <s:if test="%{#session.logined == false}"><li><a href="<s:property value="#registrar"/>"><s:text name="global.registro"/></a></li></s:if>
                                </ul>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div id="head">
                        <div id="head-left"></div>
                        <div id="head-right"></div>
                        <div id="head-1"></div>
                        <h1><span class="logo"><span class="top"><s:text name="global.nombre.top"/></span><span class="gadgets"><s:text name="global.nombre.gadgets"/></span></span></h1>
                    <div id="navb">
                        <ul>
                            <li><a href="http://www.freewebsitetemplates.com"><s:text name="global.inicio"/></a></li>
                        </ul>
                    </div>
                </div>
                <div id="head-2"></div>
                <div id="login">
                    <div id="login-bot">
                        <s:if test="%{#session.logined == false}">
                            <div id="login-box">
                                <h2 class="login"><em><s:text name="global.usuario"/> </em><s:text name="global.login"/></h2>
                                <s:form action="iniciarSesion" method="post">
                                    <div id="login-username">
                                        <div><s:textfield name="usuario" key="global.login.usuario"/></div>
                                        <div><s:password name="contrasena" key="global.login.contrasena"/></div>
                                    </div>
                                    <div id="login-button">
                                        <s:submit type="image" src="imagenes/btn_login.gif"/>                                    
                                    </div>
                                    <div class="clear">
                                        <div class="reg">
                                            <s:text name="global.sincuenta"/> <a href="<s:property value="#registrar"/>"><s:text name="global.registresegratis"/></a>
                                        </div>
                                    </div>
                                </s:form>
                            </div>
                        </s:if>
                        <s:else>
                            <div id="login-welcome">
                                <div>
                                    <h2><s:text name="global.mensaje.bienvenida"/> <s:property value="#session.user.nombreCliente"/></h2> 
                                    <s:form action="terminarSesion" method="post">
                                        <s:submit type="image" src="imagenes/btn_login.gif"/>
                                    </s:form>
                                </div>
                            </div>
                        </s:else>
                        <div class="clear"></div>
                    </div>
                </div>
                <div id="body">
                    <div id="body-bot">
                        <h2><span><strong><s:text name="global.mensaje.lanzamientos"/></strong></span></h2>
                        <div id="items">
                            <s:iterator value="productos" var="productoActual">
                                <div class="item">
                                    <<img src="<s:url action="mostrarImagen">
                                              <s:param name="codProducto" value="#productoActual.codProducto"/>
                                          </s:url>" width="91" height="105" class="left" />  
                                    <h3>Samsung Galaxy S3</h3>
                                    <div><a href="http://www.freewebsitetemplates.com" class="details">detalles</a><br><br><a href="http://www.freewebsitetemplates.com" class="details">agregar a carrito</a></div>
                                    <div class="divider"></div>
                                </div>
                            </s:iterator>
                            <div class="clear"></div>
                        </div>
                        <div id="footer">
                            <div id="footloose"><span class="logo"><span class="top"><s:text name="global.nombre.top"/></span><span class="gadgets"><s:text name="global.nombre.gadgets"/></span></span></div>
                            <p><a href="http://www.freewebsitetemplates.com"><s:text name="global.mensaje.privacidad"/></a> <strong>&nbsp;:&nbsp;</strong> <a href="http://www.freewebsitetemplates.com"><s:text name="global.mensaje.terminos"/></a> <br />
                                &copy; <s:text name="global.mensaje.copyright"/></p>
                        </div>					
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
