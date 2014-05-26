USE [Cocoa]
GO

CREATE PROCEDURE sp_obtener_cantones
(
	@cod_provincia char(2)
)
AS
BEGIN
SELECT cod_canton, nombre_canton 
  FROM Canton 
  WHERE cod_provincia = @cod_provincia
END

GO


