USE Cocoa
GO
CREATE PROCEDURE sp_obtener_provincia
(
	@cod_provincia char(2)
)
AS
BEGIN
SELECT  nombre_provincia 
  FROM Provincia 
  WHERE cod_provincia = @cod_provincia
END
GO
