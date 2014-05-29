USE Cocoa
GO

CREATE PROCEDURE sp_obtener_categoria 
(
	@cod_categoria int
)
AS
BEGIN

SELECT cod_categoria
      ,nombre_categoria
  FROM Categoria
END
GO
