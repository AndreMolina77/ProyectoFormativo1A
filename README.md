CREATE TABLE Pacientes(
id_paciente INT,
id_nombre_paciente INT,
id_apellido_paciente INT,
edad INT,
id_enfermedad INT,
num_habitacion INT,
num_cama INT,
id_medicamento_asignado INT,
id_fecha_nacimiento INT,
id_hora_aplicacion_mediacamento INT,

CONSTRAINT fk_Pacientes_nombre_paciente 
FOREIGN KEY(id_nombre_paciente)
REFERENCES Nombre_paciente(id_nombre_paciente),

CONSTRAINT fk_Pacientes_id_appellido_paciente
FOREIGN KEY(id_apellido_paciente)
REFERENCES Apellido_paciente(id_apellido_paciente),

CONSTRAINT fk_Pacientes_id_enfermedad
FOREIGN KEY(id_enfermedad)
REFERENCES Enfermedades(id_enfermedad),

CONSTRAINT fk_Pacientes_id_medicamento_asignado
FOREIGN KEY(id_medicamento_asignado)
REFERENCES Medicamentos_asignados(id_medicamento_asignado),

CONSTRAINT fk_Pacientes_id_fecha_nacimiento
FOREIGN KEY(id_fecha_nacimiento)
REFERENCES Fecha_nacimiento(id_fecha_nacimiento),

CONSTRAINT fk_Pacientes_id_hora_aplicacion_medicamento
FOREIGN KEY(id_hora_aplicacion_mediacamento)
REFERENCES Hora_aplicacion_medicamento(id_hora_aplicacion_mediacamento)
);

SELECT * FROM Pacientes

--Normalización de tablas--
CREATE TABLE Nombre_paciente(
id_nombre_paciente INT PRIMARY KEY,
nombre_paciente VARCHAR2(50)
);

CREATE TABLE Apellido_paciente(
id_apellido_paciente INT PRIMARY KEY,
apellido_paciente VARCHAR2(50)
);

CREATE TABLE Enfermedades(
id_enfermedad INT PRIMARY KEY,
nombre_enfermedad VARCHAR2(50)
);

CREATE TABLE Medicamentos_asignados(
id_medicamento_asignado INT PRIMARY KEY,
medicamento_asignado VARCHAR2(50)
);

CREATE TABLE Fecha_nacimiento(
id_fecha_nacimiento INT PRIMARY KEY,
fecha_nacimiento DATE
);

ALTER TABLE Fecha_nacimiento MODIFY (fecha_nacimiento VARCHAR2(20))

CREATE TABLE Hora_aplicacion_medicamento(
id_hora_aplicacion_mediacamento INT PRIMARY KEY,
hora_aplicacion VARCHAR2(5)
);
 DROP TABLE Nombre_paciente
 
