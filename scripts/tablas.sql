USE Cocoa
GO
/****** Object:  Table Canton    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Canton(
	cod_provincia varchar(2) NOT NULL,
	cod_canton varchar(2) NOT NULL,
	nombre_canton varchar(25) NOT NULL,
 CONSTRAINT PK_Canton PRIMARY KEY CLUSTERED 
(
	cod_provincia ASC,
	cod_canton ASC
)
) 
GO
/****** Object:  Table Categoria    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Categoria(
	cod_categoria int NOT NULL,
	nombre_categoria varchar(30) NOT NULL,
 CONSTRAINT PK_Categoria PRIMARY KEY CLUSTERED 
(
	cod_categoria ASC
)
) 
GO

/****** Object:  Table Cliente    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Cliente(
	id_cliente int NOT NULL,
	correo varchar(70) NOT NULL UNIQUE,
	nombre_cliente varchar(30) NOT NULL,
	apellidos_cliente varchar(50) NOT NULL,
	cod_direccion int NULL,
	contrasena varbinary(50) NOT NULL,
 CONSTRAINT PK_Cliente PRIMARY KEY CLUSTERED 
(
	id_cliente ASC
)
)

GO
/****** Object:  Table Datos_Empresa    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Datos_Empresa(
	nombre_empresa varchar(30) NULL,
	ced_judirica int NULL,
	correo_contacto varchar(50) NULL,
	cod_direccion int NULL
)

GO

/****** Object:  Table Direccion    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Direccion(
	cod_direccion int NOT NULL,
	direccion varchar(150) NOT NULL,
	cod_postal int NOT NULL,
	telefono int NOT NULL,
	cod_provincia varchar(1) NOT NULL,
	cod_distrito varchar(2) NOT NULL,
	cod_canton varchar(2) NOT NULL,
 CONSTRAINT PK_Direccion PRIMARY KEY CLUSTERED 
(
	cod_direccion ASC
)
)

GO
/****** Object:  Table Distrito    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Distrito(
	cod_distrito varchar(2) NOT NULL,
	cod_canton varchar(2) NOT NULL,
	cod_provincia varchar(1) NOT NULL,
	nombre_distrito varchar(30) NOT NULL,
 CONSTRAINT PK_Distrito PRIMARY KEY CLUSTERED 
(
	cod_distrito ASC,
	cod_canton ASC,
	cod_provincia ASC
)
)

GO

/****** Object:  Table Item    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Item(
	cod_item int NOT NULL,
	cant_disponible int NOT NULL,
	precio_regular money NULL,
	descuento int NULL,
	disponible bit NOT NULL,
	notas varchar(50) NULL,
	cod_proveedor int NOT NULL,
	cod_producto int NOT NULL,
 CONSTRAINT PK_Item PRIMARY KEY CLUSTERED 
(
	cod_item ASC
)
) 
GO

/****** Object:  Table Item_Orden    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Item_Orden(
	id_orden int NOT NULL,
	cod_item int NOT NULL,
	cantidad int NOT NULL,
	precio_und money NOT NULL,
 CONSTRAINT PK_Item_Orden PRIMARY KEY CLUSTERED 
(
	id_orden ASC,
	cod_item ASC
)
) 

GO
/****** Object:  Table Orden    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Orden(
	id_orden int NOT NULL,
	fecha_orden date NOT NULL,
	estado_envio varchar(25) NOT NULL,
	courier varchar(30) NULL,
	monto_total money NOT NULL,
	enviar_a_nombre varchar(30) NOT NULL,
	enviar_a_apellidos varchar(50) NOT NULL,
	num_tarjeta varbinary(50) NOT NULL,
	fecha_expiracion date NOT NULL,
	tipo_tarjeta varchar(10) NOT NULL,
	canton varchar(15) NOT NULL,
	distrito varchar(20) NOT NULL,
	provincia varchar(15) NOT NULL,
	direccion varchar(120) NOT NULL,
	cod_postal int NOT NULL,
	id_cliente int NULL,
 CONSTRAINT PK_ORden PRIMARY KEY CLUSTERED 
(
	id_orden ASC
)
)

GO

/****** Object:  Table Producto    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Producto(
	cod_producto int NOT NULL,
	nombre_producto varchar(30) NOT NULL,
	descripcion_producto varchar(150) NOT NULL,
	imagen image NOT NULL,
	fabricante varchar(30) NOT NULL,
	num_parte varchar(30) NOT NULL,
	fecha_lanzamiento date NOT NULL,
	cod_categoria int NOT NULL,
 CONSTRAINT PK_Producto PRIMARY KEY CLUSTERED 
(
	cod_producto ASC
)
)

GO

/****** Object:  Table Proveedor    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Proveedor(
	cod_proveedor int NOT NULL,
	nombre_proveedor varchar(50) NOT NULL,
	cod_direccion int NULL,
 CONSTRAINT PK_Proveedor PRIMARY KEY CLUSTERED 
(
	cod_proveedor ASC
)
)

GO

/****** Object:  Table Provincia    Script Date: 05/05/14 11:59:25 PM ******/

CREATE TABLE Provincia(
	cod_provincia varchar(1) NOT NULL,
	nombre_provincia varchar(15) NOT NULL,
 CONSTRAINT PK_Provincia PRIMARY KEY CLUSTERED 
(
	cod_provincia ASC
)
)

GO

GO
ALTER TABLE Canton ADD  CONSTRAINT FK_Canton_Provincia FOREIGN KEY(cod_provincia)
REFERENCES Provincia (cod_provincia)
GO
ALTER TABLE Cliente ADD  CONSTRAINT FK_Cliente_Direccion FOREIGN KEY(cod_direccion)
REFERENCES Direccion (cod_direccion)
GO
ALTER TABLE Datos_Empresa ADD  CONSTRAINT FK_Datos_Empresa_Direccion FOREIGN KEY(cod_direccion)
REFERENCES Direccion (cod_direccion)
GO
ALTER TABLE Direccion ADD  CONSTRAINT FK_Direccion_Distrito FOREIGN KEY(cod_distrito, cod_canton, cod_provincia)
REFERENCES Distrito (cod_distrito, cod_canton, cod_provincia)
GO
ALTER TABLE Distrito ADD  CONSTRAINT FK_Distrito_Canton FOREIGN KEY(cod_provincia, cod_canton)
REFERENCES Canton (cod_provincia, cod_canton)
GO
ALTER TABLE Item ADD  CONSTRAINT FK_Item_Producto FOREIGN KEY(cod_producto)
REFERENCES Producto (cod_producto)
GO
ALTER TABLE Item ADD  CONSTRAINT FK_Item_Proveedor FOREIGN KEY(cod_proveedor)
REFERENCES Proveedor (cod_proveedor)
GO
ALTER TABLE Item_Orden ADD  CONSTRAINT FK_Item_Orden_Item FOREIGN KEY(cod_item)
REFERENCES Item (cod_item)
GO
ALTER TABLE Item_Orden ADD  CONSTRAINT FK_Item_Orden_Orden FOREIGN KEY(id_orden)
REFERENCES Orden (id_orden)
GO
ALTER TABLE Orden ADD  CONSTRAINT FK_Orden_Cliente FOREIGN KEY(id_cliente)
REFERENCES Cliente (id_cliente)
GO
ALTER TABLE Producto ADD  CONSTRAINT FK_Producto_Categoria1 FOREIGN KEY(cod_categoria)
REFERENCES Categoria (cod_categoria)
GO
ALTER TABLE Proveedor ADD  CONSTRAINT FK_Proveedor_Direccion FOREIGN KEY(cod_direccion)
REFERENCES Direccion (cod_direccion)
