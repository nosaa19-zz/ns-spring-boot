-- 
-- TABLE: employee 
--

CREATE TABLE employee(
    idemployee    	BINARY(16)    NOT NULL,
	name         	VARCHAR(30),
	email         	VARCHAR(50),
	phone          	VARCHAR(50),
	department      VARCHAR(50),
    PRIMARY KEY (idemployee)
)ENGINE=INNODB
;