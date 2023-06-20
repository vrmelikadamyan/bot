CREATE TABLE platform
(
    id_platform    uuid primary key not null,
    nm_name        varchar(100)     not null,
    nm_code        varchar(100)     not null,
    vl_description varchar(300)
);

comment on table platform is 'Платформа';
comment on column platform.id_platform is 'ИД платформы';
comment on column platform.nm_name is 'Название платформы';
comment on column platform.nm_code is 'Код платформы';
comment on column platform.vl_description is 'Описание платформы';

CREATE TABLE bot_config_param
(
    id_bot_config_param uuid primary key not null,
    nm_name             varchar(100)     not null,
    nm_code             varchar(100)     not null,
    vl_description      varchar(300),
    vl_value            varchar(300)     not null,
    id_platform         uuid             not null references platform (id_platform)
);

comment on table bot_config_param is 'Параметр конфигурации бота';
comment on column bot_config_param.id_bot_config_param is 'ИД параметра конфигурации бота';
comment on column bot_config_param.nm_name is 'Название параметра конфигурации бота';
comment on column bot_config_param.nm_code is 'Код параметра конфигурации бота';
comment on column bot_config_param.vl_description is 'Описание параметра конфигурации бота';
comment on column bot_config_param.vl_value is 'Значение параметра конфигурации бота';
comment on column bot_config_param.id_platform is 'ИД платформы';