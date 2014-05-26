USE [Cocoa]
GO

CREATE PROCEDURE sp_obtener_provincias
AS
BEGIN
SELECT  cod_provincia, nombre_provincia 
  FROM Provincia
END

GO


