USE Cocoa
GO
CREATE PROCEDURE sp_obtener_usuario
(
	 @correo int
)
AS
BEGIN
	SELECT  id_cliente,
		 correo, 
		 nombre_cliente, 
		 apellidos_cliente, 
		 cod_direccion, 
		 contrasena 
  FROM Cliente 
  WHERE correo = @correo
END
