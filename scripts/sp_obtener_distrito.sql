USE Cocoa
GO
CREATE PROCEDURE sp_obtener_distrito
(
	@cod_canton char(2),
	@cod_provincia char(2),
	@cod_distrito char(3)
)
AS
BEGIN
SELECT nombre_distrito
  FROM Distrito 
  WHERE cod_canton = @cod_canton AND cod_provincia = @cod_provincia AND cod_distrito = @cod_distrito
END
GO
