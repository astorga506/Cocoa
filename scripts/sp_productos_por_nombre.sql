USE Cocoa
GO
CREATE PROCEDURE sp_productos_por_nombre
(
	@nombre_producto varchar(50)
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
  WHERE nombre_producto LIKE '%'+ @nombre_producto +'%'
END
GO
