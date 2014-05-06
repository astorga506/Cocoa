USE Cocoa
GO
CREATE PROCEDURE sp_validar_usuario
(	
	@val bit OUTPUT,
	@correo varchar(50),
	@contrasena varchar(20)

)
AS
BEGIN
	SET @val =  dbo.fn_es_correcto(@correo, @contrasena);
	SELECT @val;
END

GO

CREATE FUNCTION fn_es_correcto
(
	@correo varchar(50),
	@contrasena varchar(20)
)
RETURNS bit 
BEGIN
	DECLARE @correoTemp varchar(50)
	DECLARE @contrasenaTemp varbinary(50)
	DECLARE @existe bit
	DECLARE cursor_validar CURSOR 
		FOR SELECT correo, contrasena
		FROM Cliente
		WHERE correo = @correo AND DECRYPTBYPASSPHRASE('patito', Contrasena) = @contrasena
	OPEN cursor_validar
	FETCH NEXT FROM cursor_validar
	INTO @correoTemp, @contrasenaTemp
	IF @@FETCH_STATUS = 0
		SET @existe = 1
	ELSE
		SET @existe = 0
	RETURN @existe
END