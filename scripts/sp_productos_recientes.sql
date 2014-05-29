USE Cocoa
GO
CREATE PROCEDURE sp_productos_recientes
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
  WHERE DATEDIFF(day, fecha_agregado, GETDATE()) < 30
END
GO
