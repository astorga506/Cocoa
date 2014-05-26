USE Cocoa
GO
CREATE PROCEDURE sp_obtener_canton
(
	@cod_canton char(2),
	@cod_provincia char(2)
)
AS
BEGIN
SELECT nombre_canton 
  FROM Canton 
  WHERE cod_canton = @cod_canton AND cod_provincia = @cod_provincia
END
GO
