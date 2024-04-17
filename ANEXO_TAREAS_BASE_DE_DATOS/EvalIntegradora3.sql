/*
* EVALUACION INTEGRADORA MODULO 3
* FELIPE TORO G
* Datos Anexos al final
*/

-- Creamos la base de datos Alke_Wallet
CREATE DATABASE IF NOT EXISTS Alke_Wallet;

-- Usamos la base de datos Alke_Wallet
USE Alke_Wallet;

-- Creamos la Tabla Usuario
CREATE TABLE IF NOT EXISTS Usuario (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo_electronico VARCHAR(100) NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    saldo DECIMAL(10, 2)
);

-- Creamos la Tabla Moneda
CREATE TABLE IF NOT EXISTS Moneda (
    currency_id INT AUTO_INCREMENT PRIMARY KEY,
    currency_name VARCHAR(50) NOT NULL,
    currency_symbol VARCHAR(5) NOT NULL
);

-- Creamos la Tabla Transacción
CREATE TABLE IF NOT EXISTS Transaccion (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    sender_user_id INT,
    receiver_user_id INT,
    importe DECIMAL(10, 2) NOT NULL,
    transaction_date DATE,
    currency_id INT,
    FOREIGN KEY (sender_user_id) REFERENCES Usuario(user_id),
    FOREIGN KEY (receiver_user_id) REFERENCES Usuario(user_id),
    FOREIGN KEY (currency_id) REFERENCES Moneda(currency_id)
);


--  5 registros de usuario 
INSERT INTO Usuario (nombre, correo_electronico, contrasena, saldo) VALUES
('Juan Perez', 'juan@example.com', 'contraseña123', 1000000.00),
('Maria Garcia', 'maria@example.com', 'clave456', 150000.50),
('Pedro Sanchez', 'pedro@example.com', 'password789', 200000.25),
('Laura Martinez', 'laura@example.com', 'secreto987', 3000000.75),
('Ana Lopez', 'ana@example.com', 'qwerty123', 500000.00);

--  4 registros de moneda
INSERT INTO Moneda (currency_name, currency_symbol) VALUES
('Peso Chileno', 'CLP'),
('Dólar', 'USD'),
('Euro', 'EUR'),
('Yen', 'JPY');

-- registros de transaccion
INSERT INTO Transaccion (sender_user_id, receiver_user_id, importe, transaction_date, currency_id) VALUES
(1, 2, 1000.00, CURDATE(), 1),
(2, 3, 500.50, CURDATE(), 2),
(3, 4, 50.25, CURDATE(), 3),
(4, 5, 200.75, CURDATE(), 4),
(5, 1, 300.00, CURDATE(), 1),
(5, 4, 200.75, CURDATE(), 4),
(4, 2, 200.75, CURDATE(), 4),
(4, 3, 200.75, CURDATE(), 4);

-- EJEMPLO DE COMO SE PODRIA REALIZAR UNA FUNCION QUE VERIFIQUE QUE EL SALDO SEA POSITIVO.

/* DELIMITER //

CREATE PROCEDURE RealizarTransaccion(
    IN sender_id INT,
    IN receiver_id INT,
    IN monto DECIMAL(10, 2),
    IN currency_id INT
)
BEGIN
    DECLARE saldo_envio DECIMAL(10, 2);
    
   -- seleccionamos el saldo desde el usuario
    SELECT saldo INTO saldo_envio FROM Usuario WHERE user_id = sender_id;
  -- Verificamos que el saldo actual sea mayor o igual que el monto que queremos transferir    
    IF saldo_envio >= monto THEN
        START TRANSACTION;
        INSERT INTO Transaccion (sender_user_id, receiver_user_id, importe, transaction_date, currency_id)
        VALUES (sender_id, receiver_id, monto, CURDATE(), currency_id);
        UPDATE Usuario SET saldo = saldo - monto WHERE user_id = sender_id;
        UPDATE Usuario SET saldo = saldo + monto WHERE user_id = receiver_id;
        COMMIT;
        SELECT 'Transacción realizada exitosamente.' AS Message;
    ELSE
        SELECT 'El saldo del emisor es insuficiente para realizar la transacción.' AS Message;
    END IF;
END //

DELIMITER ;
*/


--  CONSULTAS!

-- Buscamos el tipo de moneda del usuario id 5, el cual deberia ser Peso Chileno
SELECT m.currency_name AS tipo_de_moneda, u.nombre AS nombre_usuario
FROM Usuario u INNER JOIN Cuenta c ON u.user_id = c.user_id
INNER JOIN Moneda m ON c.currency_id = m.currency_id
WHERE u.user_id = 5;

-- Buscamos las transacciones de recepcion y envio de importes del usuario con id 4
SELECT sender_user_id AS Usuario_depositador, receiver_user_id AS Usuario_receptor,
importe, transaction_date AS Fecha_de_Traspaso
FROM Transaccion 
WHERE sender_user_id = (SELECT user_id FROM Usuario WHERE user_id = 4)
   OR receiver_user_id = (SELECT user_id FROM Usuario WHERE user_id= 4);

-- Seleccion de todos los usuarios registrados
SELECT * FROM Usuario;
-- Seleccion de todas las monedas registradas
SELECT * FROM Moneda;
-- Seleccion de todas las transacciones
SELECT * FROM Transaccion;

-- Seleccion de todas las transacciones realizadas por el usuario 4
SELECT importe AS Dinero_Transferido, transaction_date AS Fecha_de_Traspaso
FROM Transaccion 
WHERE sender_user_id = (SELECT user_id FROM Usuario WHERE user_id = 4);
   
-- Seleccion de todas las transacciones recibidas por el usuario 4
SELECT  importe AS Dinero_Recibido, transaction_date AS Fecha_de_Traspaso
FROM Transaccion 
WHERE receiver_user_id = (SELECT user_id FROM Usuario WHERE user_id= 4);   

-- sentencia DML para cambiar el correo del usuario 1
UPDATE Usuario SET correo_electronico = 'correonuevo@gmail.com'
WHERE id_user = 1;


-- Sentencia para borrar completa una fila de Transacciones
DELETE FROM Transaccion
WHERE transaction_id = 'ID_de_la_Transacción';



-- Sentencia DLL para cambiar el nombre de la tabla de correo
ALTER TABLE Usuario
CHANGE  correo_electronico email VARCHAR(100);

/* Modelo conceptual
Entidades y Atributos:

Usuario:
user_id (clave primaria)
nombre
correo electrónico
contraseña
saldo

Transacción:
transaction_id (Primary Key)
sender_user_id (Foreign Key referenciando a User)
receiver_user_id (Foreign Key referenciando a User)
importe
transaction_date

Moneda:
currency_id (Primary Key)
currency_name
currency_symbol
*/

/* A CONSIDERAR
La relación entre las entidades Usuario y Transacción es de uno a muchos en 
ambas direcciones. Esto significa que un usuario puede tener múltiples 
transacciones como emisor y como receptor.
Para asegurarnos de que cada transacción está asociada al usuario emisor y receptor 
correctos, utilizaremos las claves externas sender_user_id y receiver_user_id en la 
tabla Transacción que hacen referencia al user_id en la tabla Usuario.
La relación entre la entidad Transacción y la entidad Moneda se establece a 
través de la clave externa currency_id en la tabla Transacción, 
que hace referencia al currency_id en la tabla Moneda. Esto garantiza que 
cada transacción esté asociada a una divisa concreta.
*/


