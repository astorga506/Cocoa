<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Ejemplo vista principal Cliente</title>
        <link rel="stylesheet" href="css/style.css" type="text/css" charset="utf-8" />	
    </head>
    <body>
        <div id="outer">
            <div id="wrapper">
                <div id="nav">
                    <div id="nav-left">
                        <div id="nav-right">
                            <ul>
                                <li><a href="lista_productos.jsp">PRODUCTOS</a></li>
                                <li><a>CARRITO</a></li>
                                <li><a href="Registro.jsp">REGISTRARSE</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div id="head">
                    <div id="head-left"></div>
                    <div id="head-right"></div>
                    <div id="head-1"></div>
                    <h1><span class="logo"><span class="top">top</span><span class="gadgets">gadgets</span></span></h1>
                    <div id="navb">
                        <ul>
                            <li><a href="http://www.freewebsitetemplates.com">iNICIO</a></li>
                        </ul>
                    </div>
                </div>
                <div id="head-2"></div>
                <div id="login">
                    <div id="login-bot">
                        <div id="login-box">
                            <h2 class="login"><em>Usuario</em>login</h2>
                            <form action="">
                                <div id="login-username">
                                    <div><s:textfield name="usuario" label="Usuario"/></div>
                                    <div><s:password name="contrasena" label="Contraseña" id="pass"/></div>
                                </div>
                                <div id="login-button">
                                    <s:submit type="image" src="imagenes/btn_login.gif"/>                                    
                                </div>
                                <div class="clear">
                                    <div class="reg">
                                        Sin cuenta? <a href="Registro.jsp">Registrese gratis</a>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div id="login-welcome">
                            <div>
                                <h2>Bienvenido</h2>

                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
                <div id="body">
                    <div id="body-bot">
                        <h2><span><strong>Lanzamientos</strong></span></h2>
                        <div id="items">
                            <div class="item">
                                <img src="imagenes/pic_1.jpg" width="91" height="105" alt="laptop" class="left" />
                                <h3><a href="http://www.justwebtemplates.com">PC y Laptops</a></h3>
                                <p>Even more websites all about website templates on <a href="http://www.justwebtemplates.com">Just Web Templates</a>.</p>
                                <div><a href="http://www.freewebsitetemplates.com" class="details">ver</a></div>
                                <div class="divider"></div>
                            </div>
                            <div class="item">
                                <img src="imagenes/pic_3.jpg" width="91" height="105" alt="phone" class="left" />
                                <h3><a href="http://www.templatebeauty.com">Smartphones y Tablets</a></h3>
                                <p>If you're looking for beautiful and professionally made templates you can find them at <a href="http://www.templatebeauty.com">Template Beauty</a>.</p>
                                <div><a href="http://www.freewebsitetemplates.com" class="details">ver</a></div>
                                <div class="divider"></div>
                            </div>
                            <div class="item">
                                <img src="imagenes/pic_2.jpg" width="91" height="105" alt="tv" class="left" />
                                <h3>TVs</h3>
                                <p>This is a template designed by free website templates for you for free you can replace all the text by your own   			text. </p>
                                <div><a href="http://www.freewebsitetemplates.com" class="details">ver</a></div>
                                <div class="divider"></div>
                            </div>
                            <div class="item">
                                <img src="imagenes/pic_4.jpg" width="91" height="105" alt="consola" class="left" />
                                <h3><a href="http://www.freewebsitetemplates.com/forum/">Consolas</a></h3>
                                <p>If you're having problems editing the template please don't hesitate to ask for help on the <a href="http://www.freewebsitetemplates.com/forum/">forum</a>.</p>
                                <div><a href="http://www.freewebsitetemplates.com" class="details">ver</a></div>
                                <div class="divider"></div>
                            </div>
                            <div class="clear"></div>
                        </div>

                        <div id="footer">
                            <div id="footloose"><span class="logo"><span class="top">top</span><span class="gadgets">gadgets</span></span></div>
                            <p><a href="http://www.freewebsitetemplates.com">Privacy Policy</a> <strong>&nbsp;:&nbsp;</strong> <a href="http://www.freewebsitetemplates.com">Terms &amp; Conditions</a> <br />
                                &copy; Copyright 2007. All rights reserved.</p>
                        </div>					
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
