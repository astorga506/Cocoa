USE Cocoa
GO

CREATE PROCEDURE sp_obtener_proveedor
(
	@cod_proveedor int
)
AS
BEGIN
SELECT cod_proveedor
      ,nombre_proveedor
      ,cod_direccion
  FROM Proveedor
END
GO
