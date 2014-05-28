USE Cocoa

GO

CREATE PROCEDURE sp_insertar_cliente
(
		@id_cliente int OUTPUT,
		@correo varchar(70),
		@nombre_cliente varchar(30),
		@apellidos_cliente varchar(50),
		@contrasena varchar(50)
)
AS
BEGIN
DECLARE @temp varbinary(50);
SET @temp= EncryptByPassPhrase('patito',@contrasena);
INSERT INTO Cliente
	(
		correo,
		nombre_cliente,
		apellidos_cliente,
		contrasena
	)
VALUES
	(
		@correo,
		@nombre_cliente,
		@apellidos_cliente,
		@temp
	)
SELECT @id_cliente = @@IDENTITY;
END
GO
