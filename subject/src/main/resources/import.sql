insert into schedule (id, initial_schedule, final_schedule) values (1, '8:15', '9:35');
insert into schedule (id, initial_schedule, final_schedule) values (2, '9:50', '11:10');
insert into schedule (id, initial_schedule, final_schedule) values (3, '11:25', '12:45');
insert into schedule (id, initial_schedule, final_schedule) values (4, '13:45', '15:05');
insert into schedule (id, initial_schedule, final_schedule) values (5, '15:20', '16:40');
insert into schedule (id, initial_schedule, final_schedule) values (6, '16:55', '18:15');
insert into schedule (id, initial_schedule, final_schedule) values (7, '18:45', '20:05');
insert into schedule (id, initial_schedule, final_schedule) values (8, '20:05', '21:25');
insert into schedule (id, initial_schedule, final_schedule) values (9, '21:25', '22:45');

insert into subject (id, name, level, quota) values ('10101', 'CÁLCULO I PARA INGENIERÍA', 1, 35);
insert into subject (id, name, level, quota) values ('10102', 'ÁLGEBRA I PARA INGENIERÍA', 1, 35);
insert into subject (id, name, level, quota) values ('10103', 'FÍSICA I PARA INGENIERÍA', 1, 35);
insert into subject (id, name, level, quota) values ('10104', 'TALLER DE DESARROLLO PERSONAL E INTEGRAL', 1, 35);
insert into subject (id, name, level, quota) values ('10125', 'INTRODUCCION A LA INGENIERIA', 1, 35);
insert into subject (id, name, level, quota) values ('10126', 'METODOS DE ESTUDIO', 1, 35);
insert into subject (id, name, level, quota) values ('10107', 'CALCULO II PARA INGENIERÍA', 2, 35);
insert into subject (id, name, level, quota) values ('10108', 'ALGEBRA II PARA INGENIERÍA', 2, 35);
insert into subject (id, name, level, quota) values ('10109', 'FÍSICA II PARA INGENIERÍA', 2, 35);
insert into subject (id, name, level, quota) values ('10110', 'FUNDAMENTOS DE COMPUTACIÓN Y PROGRAMACIÓN', 2, 35);
insert into subject (id, name, level, quota) values ('10111', 'QUIMICA GENERAL', 2, 35);
insert into subject (id, name, level, quota) values ('13287', 'INTRODUCCIÓN A INGENIERÍA INFORMÁTICA', 2, 35);
insert into subject (id, name, level, quota) values ('10115', 'ANÁLISIS ESTADÍSTICO PARA INGENIERÍA', 3, 35);
insert into subject (id, name, level, quota) values ('10123', 'ECUACIONES DIFERENCIALES Y METODOS NUMERICOS PARA INGENIERIA', 3, 35);
insert into subject (id, name, level, quota) values ('10127', 'ELECTRICIDAD Y MAGNETISMO PARA INGENIERIA', 3, 35);
insert into subject (id, name, level, quota) values ('10128', 'COMUNICACION EFECTIVA', 3, 35);
insert into subject (id, name, level, quota) values ('10130', 'INGLÉS I', 3, 35);
insert into subject (id, name, level, quota) values ('13201', 'MÉTODOS DE PROGRAMACIÓN', 3, 35);
insert into subject (id, name, level, quota) values ('10116', 'FUNDAMENTOS DE ECONOMÍA', 4, 35);
insert into subject (id, name, level, quota) values ('10131', 'INGLÉS II', 4, 35);
insert into subject (id, name, level, quota) values ('13204', 'PARADIGMAS DE PROGRAMACIÓN', 4, 35);
insert into subject (id, name, level, quota) values ('13205', 'ANÁLISIS DE ALGORITMOS Y ESTRUCTURA DE DATOS', 4, 35);
insert into subject (id, name, level, quota) values ('13252', 'INGENIERÍA DE SISTEMAS', 4, 35);
insert into subject (id, name, level, quota) values ('13273', 'ESTRUCTURA DE COMPUTADORES', 4, 35);
insert into subject (id, name, level, quota) values ('10132', 'INGLÉS III', 5, 35);
insert into subject (id, name, level, quota) values ('13209', 'FUNDAMENTOS DE INGENIERÍA DE SOFTWARE', 5, 35);
insert into subject (id, name, level, quota) values ('13260', 'FUNDAMENTOS DE INGENIERÍA DE SOFTWARE', 5, 35);
insert into subject (id, name, level, quota) values ('13261', 'SISTEMAS DE INFORMACIÓN', 5, 35);
insert into subject (id, name, level, quota) values ('13274', 'DISEÑO DE BASE DE DATOS', 5, 35);
insert into subject (id, name, level, quota) values ('13275', 'ORGANIZACIÓN DE COMPUTADORES', 5, 35);
insert into subject (id, name, level, quota) values ('13288', 'EVALUACIÓN DE PROYECTOS INFORMÁTICOS', 5, 35);
insert into subject (id, name, level, quota) values ('10133', 'INGLÉS IV', 6, 35);
insert into subject (id, name, level, quota) values ('13212', 'SISTEMAS OPERATIVOS', 6, 35);
insert into subject (id, name, level, quota) values ('13215', 'TALLER DE BASES DE DATOS', 6, 35);
insert into subject (id, name, level, quota) values ('13265', 'TÉCNICAS DE INGENIERÍA DE SOFTWARE', 6, 35);
insert into subject (id, name, level, quota) values ('13266', 'REDES COMPUTACIONALES', 6, 35);
insert into subject (id, name, level, quota) values ('13289', 'ADMINISTRACIÓN DE PROYECTOS INFORMÁTICOS', 6, 35);
insert into subject (id, name, level, quota) values ('13267', 'PROYECTO DE INGENIERÍA DE SOFTWARE', 7, 35);
insert into subject (id, name, level, quota) values ('13268', 'TÓPICOS DE ESPECIALIDAD I', 7, 35);
insert into subject (id, name, level, quota) values ('13269', 'TÓPICOS DE ESPECIALIDAD II', 7, 35);
insert into subject (id, name, level, quota) values ('13270', 'TÓPICOS DE ESPECIALIDAD III', 7, 35);
insert into subject (id, name, level, quota) values ('13276', 'SEMINARIO DE COMPUTACIÓN E INFORMÁTICA', 7, 35);
insert into subject (id, name, level, quota) values ('13277', 'TRABAJO DE TITULACIÓN', 8, 35);

insert into dependence (id, id_subject_dependence, id_subject_source) values (1,'10101','10107');
insert into dependence (id, id_subject_dependence, id_subject_source) values (2,'10102','10108');
insert into dependence (id, id_subject_dependence, id_subject_source) values (3,'10103','10109');
insert into dependence (id, id_subject_dependence, id_subject_source) values (4,'10102','10110');
insert into dependence (id, id_subject_dependence, id_subject_source) values (5,'10125','13287');
insert into dependence (id, id_subject_dependence, id_subject_source) values (6,'10107','10115');
insert into dependence (id, id_subject_dependence, id_subject_source) values (7,'10110','10123');
insert into dependence (id, id_subject_dependence, id_subject_source) values (8,'10109','10127');
insert into dependence (id, id_subject_dependence, id_subject_source) values (9,'10104','10128');
insert into dependence (id, id_subject_dependence, id_subject_source) values (10,'10126','10130');
insert into dependence (id, id_subject_dependence, id_subject_source) values (11,'13287','13201');
insert into dependence (id, id_subject_dependence, id_subject_source) values (12,'10101','10116');
insert into dependence (id, id_subject_dependence, id_subject_source) values (13,'10130','10131');
insert into dependence (id, id_subject_dependence, id_subject_source) values (14,'13201','13204');
insert into dependence (id, id_subject_dependence, id_subject_source) values (15,'13201','13205');
insert into dependence (id, id_subject_dependence, id_subject_source) values (16,'10125','13252');
insert into dependence (id, id_subject_dependence, id_subject_source) values (17,'10108','13273');
insert into dependence (id, id_subject_dependence, id_subject_source) values (18,'10131','10132');
insert into dependence (id, id_subject_dependence, id_subject_source) values (19,'13204','13209');
insert into dependence (id, id_subject_dependence, id_subject_source) values (20,'10128','13260');
insert into dependence (id, id_subject_dependence, id_subject_source) values (21,'13252','13261');
insert into dependence (id, id_subject_dependence, id_subject_source) values (22,'13204','13274');
insert into dependence (id, id_subject_dependence, id_subject_source) values (23,'13273','13275');
insert into dependence (id, id_subject_dependence, id_subject_source) values (24,'10123','13288');
insert into dependence (id, id_subject_dependence, id_subject_source) values (25,'10132','10133');
insert into dependence (id, id_subject_dependence, id_subject_source) values (26,'13205','13212');
insert into dependence (id, id_subject_dependence, id_subject_source) values (27,'13274','13215');
insert into dependence (id, id_subject_dependence, id_subject_source) values (28,'13209','13265');
insert into dependence (id, id_subject_dependence, id_subject_source) values (29,'13275','13266');
insert into dependence (id, id_subject_dependence, id_subject_source) values (30,'13288','13289');
insert into dependence (id, id_subject_dependence, id_subject_source) values (31,'13215','13267');
insert into dependence (id, id_subject_dependence, id_subject_source) values (32,'13266','13268');
insert into dependence (id, id_subject_dependence, id_subject_source) values (33,'13266','13269');
insert into dependence (id, id_subject_dependence, id_subject_source) values (34,'13265','13270');
insert into dependence (id, id_subject_dependence, id_subject_source) values (35,'13260','13276');
insert into dependence (id, id_subject_dependence, id_subject_source) values (36,'13276','13277');