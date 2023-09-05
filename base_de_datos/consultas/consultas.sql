/*Consultas*/ 

-- Ingredientes de cada receta
SELECT titulo, descripcion_ingrediente
FROM detalle_receta dr
JOIN ingrediente i ON dr.id_detalle = i.id_detalle;

-- Pasos de cada receta
SELECT titulo, descripcion_paso
FROM detalle_receta dr
JOIN paso p ON dr.id_detalle = p.id_detalle;

-- Recetas creadas por usuarios y categorias de recetas
SELECT r.nombre as receta, concat_ws(" ", u.nombre, apellido) as usuario, nombre_categoria as categoria
FROM receta r
JOIN categoria c ON r.id_categoria = c.id_categoria
JOIN usuario u ON r.id_usuario = u.id_usuario;

-- Filtrar recetas por categoria de dificultad baja, junto con los usuarios que las crearon
SELECT r.nombre as receta, concat_ws(" ", u.nombre, apellido) as usuario, nombre_categoria as categoria
FROM receta r
JOIN categoria c ON r.id_categoria = c.id_categoria
JOIN usuario u ON r.id_usuario = u.id_usuario
where nombre_categoria = "Baja";

-- Recetas favoritas de los usuarios
SELECT concat_ws(" ", u.nombre, apellido) as usuario, r.nombre as receta_favorita
FROM favorita f
JOIN receta r ON f.id_receta = r.id_receta
JOIN usuario u ON f.id_usuario = u.id_usuario;

-- Seguidos por cada usuario
SELECT concat_ws(" ", u.nombre, u.apellido) as usuario, concat_ws(" ", us.nombre, us.apellido) as usuario_seguido
FROM seguimiento s
JOIN usuario u ON s.id_usuario = u.id_usuario
JOIN usuario us ON s.id_usuario_seguido = us.id_usuario;