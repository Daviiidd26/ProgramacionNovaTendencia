


create table Peluqueria (
trabajo_realizado int not null auto_increment primary key,
productos varchar(20),
dinero Float(6)
);

create table Pedido (
fechaPedido datetime not null primary key,
fechaEntrega datetime,
procesoTrabajo varchar(40)
);

create table Servicio (
nombre varchar(20) not null primary key,
productosUsados varchar(50),
precio Float(6)
);

create table GastoProducto (
producto varchar(20) not null primary key,
cantidad Float(15)

);

create table Producto (
nDeSerie int(22) not null primary key,
marca varchar(20),
nombre varchar(20),
descripción varchar(50),
precio Float(6),
tinte enum,
tipoCabello enum,
ph Float (8),
tipo
