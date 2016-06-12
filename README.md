# Prueba3-Progra2

Integrantes: Cristopher Reyes, Juan Cuyul

describe creadores;
+-----------------+-------------+------+-----+---------+----------------+
| Field           | Type        | Null | Key | Default | Extra          |
+-----------------+-------------+------+-----+---------+----------------+
| creador_id      | int(10)     | NO   | PRI | NULL    | auto_increment |
| nombre          | varchar(25) | YES  |     | NULL    |                |
| apepat          | varchar(25) | YES  |     | NULL    |                |
| apemat          | varchar(25) | YES  |     | NULL    |                |
| nacionalidad_id | int(10)     | YES  |     | NULL    |                |
| estado          | varchar(25) | YES  |     | NULL    |                |
+-----------------+-------------+------+-----+---------+----------------+
6 rows in set (0.02 sec)

describe lenguajes_programacion;
+----------------+-------------+------+-----+---------+----------------+
| Field          | Type        | Null | Key | Default | Extra          |
+----------------+-------------+------+-----+---------+----------------+
| lenguaje_id    | int(10)     | NO   | PRI | NULL    | auto_increment |
| nombre         | varchar(25) | YES  |     | NULL    |                |
| fecha_creacion | date        | YES  |     | NULL    |                |
| creador_id     | int(10)     | YES  |     | NULL    |                |
| usuario_id     | int(10)     | YES  |     | NULL    |                |
| estado         | varchar(25) | YES  |     | NULL    |                |
+----------------+-------------+------+-----+---------+----------------+
6 rows in set (0.04 sec)

describe nacionalidades;
+-----------------+-------------+------+-----+---------+----------------+
| Field           | Type        | Null | Key | Default | Extra          |
+-----------------+-------------+------+-----+---------+----------------+
| nacionalidad_id | int(10)     | NO   | PRI | NULL    | auto_increment |
| nombre          | varchar(25) | YES  |     | NULL    |                |
| estado          | varchar(25) | YES  |     | NULL    |                |
+-----------------+-------------+------+-----+---------+----------------+
3 rows in set (0.02 sec)

describe usuarios;
+------------------+-------------+------+-----+---------+----------------+
| Field            | Type        | Null | Key | Default | Extra          |
+------------------+-------------+------+-----+---------+----------------+
| usuario_id       | int(10)     | NO   | PRI | NULL    | auto_increment |
| usuario          | varchar(25) | YES  |     | NULL    |                |
| clave            | varchar(25) | YES  |     | NULL    |                |
| fecha_nacimiento | date        | YES  |     | NULL    |                |
| estado           | varchar(25) | YES  |     | NULL    |                |
+------------------+-------------+------+-----+---------+----------------+
5 rows in set (0.02 sec)
