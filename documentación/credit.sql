CREATE SCHEMA IF NOT EXISTS credit;
USE credit;

CREATE TABLE IF NOT EXISTS cliente(
    cui VARCHAR(13) NOT NULL,
    nit VARCHAR(13) NOT NULL,
    nombres VARCHAR(45) NOT NULL,
    apellidos VARCHAR(45) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    genero VARCHAR(10) NOT NULL,
    estado_civil VARCHAR(45) NOT NULL,
    profesion VARCHAR(45),
    actividad_economica VARCHAR(45),
    telefono VARCHAR(8),
    celular VARCHAR(8) NOT NULL,
    direccion VARCHAR(45) NOT NULL,
    email VARCHAR(45),
    fecha_actualizacion DATE NOT NULL,
    estado VARCHAR(45) NOT NULL,
    tipo_vivienda VARCHAR(20) NOT NULL,
    ingresos DOUBLE NOT NULL,
    egresos DOUBLE NOT NULL,
    PRIMARY KEY(cui)
);

CREATE TABLE IF NOT EXISTS referencias_cliente(
    id INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(45) NOT NULL,
    apellidos VARCHAR(45) NOT NULL,
    telefono VARCHAR(8) NOT NULL,
    cliente VARCHAR(13) NOT NULL,
    tipo VARCHAR(10) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(cliente) REFERENCES cliente(cui)
);

CREATE TABLE IF NOT EXISTS solicitud(
    id INT NOT NULL AUTO_INCREMENT,
    tipo_credito VARCHAR(45) NOT NULL,
    destino VARCHAR(45) NOT NULL,
    garantia VARCHAR(45) NOT NULL,
    fecha DATE NOT NULL,
    monto_solicitado DOUBLE NOT NULL,
    saldo_anterior DOUBLE NOT NULL,
    plazo INT NOT NULL,
    dia_pago VARCHAR(10) NOT NULL,
    tasa_interes DOUBLE NOT NULL,
    estado VARCHAR(45) NOT NULL,
    cliente VARCHAR(13) NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(cliente) REFERENCES cliente(cui)
);

CREATE TABLE IF NOT EXISTS resolucion(
    id_solicitud INT NOT NULL,
    couta_capital DOUBLE NOT NULL,
    interes DOUBLE NOT NULL,
    fecha_resolucion DATE NOT NULL,
    modalidad_cuotas VARCHAR(45) NOT NULL,
    cantidad_desembolso INT NOT NULL,
    acta VARCHAR(45) NOT NULL,
    monto_letras VARCHAR(100) NOT NULL,
    garantias VARCHAR(200) NOT NULL,
    comentarios VARCHAR(200) NOT NULL,
    PRIMARY KEY(id_solicitud),
    FOREIGN KEY(id_solicitud) REFERENCES solicitud(id)
);
