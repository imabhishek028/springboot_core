create table category
(
    id   tinyint auto_increment
        primary key,
    name varchar(255) not null
);

create table products
(
    id          BIGINT auto_increment
        primary key,
    name        varchar(255)   not null,
    price       decimal(10, 2) null,
    category_id tinyint        not null,
    constraint products_category_id_fk
        foreign key (category_id) references category (id)
);