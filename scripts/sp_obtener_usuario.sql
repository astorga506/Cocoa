USE Cocoa
GO
CREATE PROCEDURE sp_obtener_usuario
(
	 @correo varchar(50)
)
AS
BEGIN
	SELECT  id_cliente,
		 correo, 
		 nombre_cliente, 
		 apellidos_cliente, 
		 cod_direccion
  FROM Cliente 
  WHERE correo = @correo
END
