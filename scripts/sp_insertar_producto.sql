USE Cocoa
GO

CREATE PROCEDURE sp_insertar_producto
(
	@cod_producto int OUTPUT, 
	@nombre_producto varchar(30),
	@descripcion_producto varchar(150),
	@imagen image,
	@fabricante varchar(30),
	@cod_categoria int,
	@cant_disponible int,
	@precio_regular money,
	@descuento int,
	@cod_proveedor int
)
AS
BEGIN
INSERT INTO Producto
	(
		nombre_producto,
		descripcion_producto,
		imagen,
		fabricante,
		fecha_agregado,
		cod_categoria,
		cant_disponible,
		precio_regular,
		descuento,
		cod_proveedor
	)
VALUES
	(
		@nombre_producto,
		@descripcion_producto,
		@imagen,
		@fabricante,
		GETDATE(),
		@cod_categoria,
		@cant_disponible,
		@precio_regular,
		@descuento,
		@cod_proveedor
	)
SELECT @cod_producto = @@IDENTITY;
END
GO
