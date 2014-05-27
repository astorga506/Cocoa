USE Cocoa
GO
CREATE PROCEDURE sp_editar_cliente
(
	@id_cliente int,
	@correo varchar(70),
	@nombre_cliente varchar(30), 
	@apellidos_cliente varchar(50), 
	@cod_direccion int, 
	@contrasena varchar(50) 
)
AS
BEGIN
DECLARE @temp varbinary(50);
SET @temp= EncryptByPassPhrase('patito',@contrasena);
UPDATE Cliente
   SET correo = correo,
       nombre_cliente = @nombre_cliente,
       apellidos_cliente = @apellidos_cliente,
       cod_direccion = @cod_direccion, 
       contrasena = @temp
 WHERE id_cliente = @id_cliente
END
GO
