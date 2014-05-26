USE [Cocoa]
GO

CREATE PROCEDURE sp_obtener_distritos
(
	@cod_canton char(2),
	@cod_provincia char(2)
)
AS
BEGIN
SELECT cod_distrito, nombre_distrito
  FROM Distrito 
  WHERE cod_canton = @cod_canton AND cod_provincia = @cod_provincia
END

GO


