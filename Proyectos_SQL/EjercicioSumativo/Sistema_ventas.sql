-- =====================================
-- REPORTE SQL - CHALLENGER SISTEMA VENTAS
-- =====================================

-- 1. Mostrar todos los clientes registrados

select * from clientes c;


-- 2. Mostrar todos los productos disponibles

select * from productos p; 

-- 3. Mostrar todas las ventas realizadas

select * from ventas v;

-- 4. Mostrar solo nombre y email de clientes

select nombre, email from clientes;

-- 5. Mostrar solo nombre y precio de productos

select nombre, precio from productos;

-- 6. Productos con precio mayor a 50000

select nombre from productos where precio > '50000';

-- 7. Ventas realizadas el 2026-04-02

select * from ventas where fecha = '2026-04-02';

-- 8. Productos ordenados de mayor a menor precio

select nombre from productos p order by precio desc;

-- 9. Clientes ordenados por nombre
 
select nombre from clientes c order by nombre asc;

-- 10. Detalles de venta con cantidad >= 2

select cantidad from detalle_venta dv where cantidad >= 2;

-- 11. Total de clientes

select count(*) id_clientes from  clientes;

-- 12. Total de productos

select count(*) id_productos from productos;

-- 13. Total de ventas

select count(*) id_venta from ventas;

-- 14. Precio promedio de productos

select avg(precio) as promedio_precio from productos;

-- 15. Suma total de precios de productos

select sum(precio) from productos p ; 

-- 16. Mostrar venta + nombre del cliente + fecha
-- OJO: Al declarar una tabla con un alias, debes usarlo en todas las llamadas.
select v.id_venta, clientes.nombre, v.fecha from clientes
join ventas v on clientes.id_cliente = v.id_cliente
join detalle_venta on v.id_venta = detalle_venta.id_venta;

-- 17. Mostrar detalle de ventas con id_venta + nombre producto + cantidad


select ventas.id_venta, productos.nombre, dv.cantidad from ventas
join detalle_venta dv on ventas.id_venta = dv.id_venta 
join productos on dv.id_producto = productos.id_producto;


-- 18. Mostrar nombre del cliente + id de venta + fecha

select clientes.nombre, v.id_venta, v.fecha from clientes
join ventas v on clientes.id_cliente  = v.id_cliente;

-- 19. Mostrar nombre del producto + cantidad vendida + id de venta

select productos.nombre, detalle_venta.cantidad, detalle_venta.id_venta from detalle_venta
join productos on detalle_venta.id_producto = productos.id_producto;

-- 20. Mostrar cuántas ventas ha realizado cada cliente

select clientes.nombre, count(id_venta) as total_ventas from clientes
join ventas on clientes.id_cliente = ventas.id_cliente
group by nombre;

-- 21. Mostrar solo los clientes con más de una venta

select clientes.nombre, count(ventas.id_venta) as total_ventas from clientes 
join ventas on clientes.id_cliente = ventas.id_cliente 
group by clientes.nombre having count(ventas.id_venta) > 1;


-- 22. Mostrar cuántas veces aparece cada producto en detalle_venta

select productos.nombre, count(*) as veces_vendido from productos 
join detalle_venta on productos.id_producto = detalle_venta.id_producto 
group by productos.nombre;

-- 23. Mostrar solo los productos que aparecen más de una vez

select id_venta, count(*) as cantidad producto  from detalle_venta 
group by detalle_venta.id_venta 
having count(*) > 1; 

-- 24. Mostrar las ventas que tienen más de un producto asociado

select id_venta, count(id_producto) as cantidad_productos from detalle_venta
group by id_venta having count(id_producto) > 1;


-- 25. Mostrar clientes cuya suma total de unidades compradas sea mayor a 2

select clientes.nombre, sum(detalle_venta.cantidad) as total_unidades from clientes
join ventas on clientes.id_cliente = ventas.id_cliente
join detalle_venta on ventas.id_venta = detalle_venta.id_venta
group by clientes.nombre having sum(detalle_venta.cantidad) > 2;

-- 26. Consulta trampa que no devuelva resultados
-- Explicar por qué el resultado vacío es correcto

SELECT * FROM productos WHERE precio > 2000000;

-- No existe ningún precio con el valor de $2.000.000.

