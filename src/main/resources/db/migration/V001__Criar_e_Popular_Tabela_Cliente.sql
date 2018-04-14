CREATE TABLE item(
	id INTEGER AUTO_INCREMENT,
	etiqueta VARCHAR(255),
	descricao VARCHAR(255),
	PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET =utf8;

INSERT INTO item (etiqueta, descricao) VALUES ("Angelo Luz", "teste");
INSERT INTO item (etiqueta, descricao) VALUES ("Angelo Luz2", "teste2");
INSERT INTO item (etiqueta, descricao) VALUES ("Angelo Luz3", "teste3");
