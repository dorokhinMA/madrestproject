DROP TABLE IF EXISTS phones;
DROP TABLE IF EXISTS persons;
DROP TABLE IF EXISTS address;

CREATE DATABASE IF NOT EXISTS `db_address` DEFAULT CHARACTER SET utf8;

USE `db_address`;

create table address
(
	id int auto_increment
		primary key,
	address varchar(45) not null,
	constraint id_UNIQUE
		unique (id)
)
;

create table persons
(
	id int auto_increment
		primary key,
	fio varchar(45) not null,
	address_id int not null,
	constraint id_UNIQUE
		unique (id),
	constraint persons_fio_uindex
		unique (fio),
	constraint fk_address
		foreign key (address_id) references address_book.address (id)
)
;

create index fk_address_idx
	on persons (address_id)
;

create table phones
(
	id int auto_increment
		primary key,
	number varchar(45) not null,
	person_id int not null,
	constraint phones_id_uindex
		unique (id),
	constraint number_UNIQUE
		unique (number),
	constraint fk_person
		foreign key (person_id) references address_book.persons (id)
)
;

create index fk_person_idx
	on phones (person_id)
;



