create sequence bookmark_id_sequence start with 1 increment by 50;

create table bookmark
(
    id         bigint default nextval('bookmark_id_sequence') not null,
    title      varchar(255)                        not null,
    url        varchar(255)                        not null,
    created_at timestamp,
    primary key (id)
);