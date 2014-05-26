USE Cocoa
GO
CREATE PROCEDURE sp_insertar_direccion
(
	@cod_direccion int OUTPUT,
	@direccion varchar(150),
	@cod_postal char(7),
	@telefono int,
	@cod_provincia char(2),
	@cod_distrito char(10),
	@cod_canton char(3)
)
AS
BEGIN
	INSERT INTO Direccion
	(
		direccion,
		cod_postal,
		telefono,
		cod_provincia,
		cod_distrito,
		cod_canton
	)
	VALUES
	(
		@direccion,
		@cod_postal,
		@telefono,
		@cod_provincia,
		@cod_distrito,
		@cod_canton
	)
	SELECT @cod_direccion = @@IDENTITY;
END
GO
