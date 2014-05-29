USE Cocoa
GO
CREATE PROCEDURE sp_obtener_producto
(
	@cod_producto int
)
AS
BEGIN
SELECT cod_producto,
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
  FROM Producto
  WHERE cod_producto = @cod_producto
END
GO
