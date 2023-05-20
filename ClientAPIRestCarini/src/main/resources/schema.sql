CREATE TABLE cliente (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  fecha_nacimiento DATE
);

CREATE TABLE clienteDTO (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  edad DATE
);
