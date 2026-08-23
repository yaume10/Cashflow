CREATE DATABASE proyecto_cashflow_v1;
USE proyecto_cashflow_v1;

CREATE TABLE categorias (
	id varchar(5) primary key,
    nombre varchar(50) not null,
    tipo varchar (20) not null
);

CREATE TABLE movimientos (
	id int unsigned auto_increment primary key,
    fecha date not null,
    importe decimal(10,2) not null,
    descripcion varchar (100),
    id_categoria varchar(5) not null,
    foreign key (id_categoria) references categorias(id)
);

INSERT INTO categorias (id, nombre, tipo) VALUES 
('ALQ', 'Alquiler', 'Gasto'),
('NOM', 'Nóminas', 'Gasto'),
('SOC', 'Seguridad Social', 'Gasto'),
('SUMIN', 'Suministros', 'Gasto'),
('VAR', 'Varios', 'Gasto'),
('BANC', 'Comisiones y gastos bancarios', 'Gasto'),
('IVA', 'IVA', 'Gasto'),
('IRPF', 'IRPF', 'Gasto'),
('APROV', 'Aprovisionamientos', 'Gasto'),
('PREST', 'Préstamos', 'Gasto'),
('COBR', 'Cobros clientes', 'Ingreso');

SELECT * from categorias;

INSERT INTO movimientos (fecha, importe, descripcion, id_categoria) VALUES 
('2026-08-01', -850.00, 'Pago alquiler oficina de agosto', 'ALQ'),
('2026-08-28', -2400.50, 'Nóminas plantilla agosto', 'NOM'),
('2026-08-30', -850.20, 'Cuota Seguridad Social', 'SOC'),
('2026-08-05', -145.30, 'Factura luz e internet', 'SUMIN'),
('2026-08-12', -45.00, 'Compra material papelería', 'VAR'),
('2026-08-15', -12.50, 'Comisión mantenimiento cuenta', 'BANC'),
('2026-07-20', -1250.00, 'Liquidación IVA Trimestre 2', 'IVA'),
('2026-07-20', -600.00, 'Retenciones IRPF Trimestre 2', 'IRPF'),
('2026-08-10', -1500.00, 'Compra de mercadería proveedor A', 'APROV'),
('2026-08-03', -350.00, 'Cuota mensual préstamo bancario', 'PREST'),
('2026-08-02', 4500.00, 'Cobro factura cliente XYZ', 'COBR');

SELECT * from movimientos;