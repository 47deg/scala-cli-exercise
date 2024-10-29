-- init.sql
CREATE TABLE country (
    code character(3) NOT NULL,
    name text NOT NULL,
    population integer NOT NULL,
    gnp numeric(10, 2)
);

INSERT INTO
    country (code, name, population, gnp)
VALUES
    ('DEU', 'Germany', 82164700, 2133367.00),
    ('ESP', 'Spain', 39441700, NULL),
    ('FRA', 'France', 59225700, 1424285.00),
    ('GBR', 'United Kingdom', 59623400, 1378330.00),
    (
        'USA',
        'United States of America',
        278357000,
        8510700.00
    );