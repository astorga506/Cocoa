USE Cocoa
GO
CREATE PROCEDURE sp_obtener_direccion
(
	@cod_direccion int
)
AS
BEGIN
	SELECT  direccion 
		  , cod_postal 
		  , telefono 
		  , cod_provincia 
		  , cod_distrito 
		  , cod_canton 
  FROM Direccion 
  WHERE cod_direccion = @cod_direccion
END
GO
