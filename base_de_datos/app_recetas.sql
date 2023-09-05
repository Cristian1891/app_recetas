CREATE SCHEMA IF NOT EXISTS app_recetas CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE app_recetas;

CREATE TABLE if not exists usuario(
id_usuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
usuario VARCHAR(50) NOT NULL,
clave VARCHAR(50) NOT NULL
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE if not exists categoria(
id_categoria INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre_categoria VARCHAR(50) NOT NULL
)CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE if not exists receta(
id_receta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
id_usuario INT NOT NULL,
id_categoria INT NOT NULL,
FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
FOREIGN KEY(id_categoria) REFERENCES categoria(id_categoria)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


CREATE TABLE if not exists detalle_receta(
id_detalle INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_receta INT NOT NULL,
titulo VARCHAR(50) NOT NULL,
descripcion TEXT NOT NULL,
tiempo_preparacion VARCHAR(50) NOT NULL,
FOREIGN KEY(id_receta) REFERENCES receta(id_receta)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE if not exists foto(
id_foto INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_receta INT NOT NULL,
id_detalle INT NOT NULL,
ruta_imagen VARCHAR(255) NOT NULL,
FOREIGN KEY(id_receta) REFERENCES receta(id_receta),
FOREIGN KEY(id_detalle) REFERENCES detalle_receta(id_detalle)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE if not exists paso(
id_paso INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_detalle INT NOT NULL,
descripcion_paso TEXT NOT NULL,
FOREIGN KEY(id_detalle) REFERENCES detalle_receta(id_detalle)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


CREATE TABLE if not exists ingrediente(
id_ingrediente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
descripcion_ingrediente VARCHAR(100) NOT NULL,
id_detalle INT NOT NULL,
FOREIGN KEY(id_detalle) REFERENCES detalle_receta(id_detalle)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE if not exists seguimiento(
id_seguimiento INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_usuario INT NOT NULL,
id_usuario_seguido INT NOT NULL,
FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
FOREIGN KEY(id_usuario_seguido) REFERENCES usuario(id_usuario)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


CREATE TABLE if not exists favorita(
id_favorita INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_usuario INT NOT NULL,
id_receta INT NOT NULL,
FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
FOREIGN KEY(id_receta) REFERENCES receta(id_receta)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;