USE Cocoa
GO
CREATE PROCEDURE sp_obtener_productos
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
END
GO
