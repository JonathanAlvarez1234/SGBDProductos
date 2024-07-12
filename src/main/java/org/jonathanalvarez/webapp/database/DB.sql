create database SGBDProductoIN5CV;

use SGBDProductoIN5CV;

create table Productos(
	productoId int not null auto_increment,
    nombreProducto varchar(40) not null,
    marcaProducto varchar(40),
    descripcionProducto text,
    precio decimal (10,2),
    primary key PK_productoId(productoId)
);

insert into Productos(nombreProducto, marcaProducto, descripcionProducto, precio, productoId)values 
	('Coca Zero', 'Coca-Cola', 'Cero calorías cero azúcar y baja en sodio,', 7.50, 1);
    
    
select * from Productos;