<%-- 
    Document   : lista_productos
    Created on : 14/05/2014, 09:43:11 PM
    Author     : Mauro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css" charset="utf-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <div id="outer">
            <div id="wrapper">
                <div id="nav">
                    <div id="nav-left">
                        <div id="nav-right">
                            <ul>
                                <li><a href="Registro.jsp">REGISTRARSE</a></li>
                                <li><a href="index.html">INICIO</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div id="body">
                    <div id="body-bot">
                        <s:form action="listarProductos" method="post">
                            <h2>
                                <span>
                                    <strong>
                                        <div>
                                            <s:textfield name="nombreProducto" label="buscar articulo"/>
                                        </div>
                                    </strong>
                                </span>
                            </h2>     
                            <s:select name="codCategoria" list="categorias" listKey="codCategoria" listValue="nombreCategoria" label="Categoria"/>
                            <s:submit value="Buscar"/>
                        </s:form>
                        <div id="items">
                            <s:iterator value="productos" var="productoActual">
                                <div class="item">
                                    <img src="<s:url action="mostrarImagen">
                                             <s:param name="codProducto" value="#productoActual.codProducto"/>
                                         </s:url>" width="91" height="105" class="left" />  
                                    <h3><s:property value="#productoActual.nombreProducto"/></h3>
                                    <div><s:url action="verProducto" var="url">
                                            <s:param name="codProducto" value="#productoActual.codProducto"/>
                                        </s:url>
                                        <a href="<s:property value="#url"/>" class="details"><s:text name="global.mensaje.detalles"/></a>
                                        <br><br>
                                        <a href="http://www.freewebsitetemplates.com" class="details"><s:text name="global.mensaje.agregar_carrito"/></a>
                                    </div>
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
