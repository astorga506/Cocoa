USE  Cocoa 
GO

CREATE PROCEDURE sp_obtener_categorias
AS
BEGIN	
	SELECT  cod_categoria, nombre_categoria 
		FROM Categoria 
END
GO
