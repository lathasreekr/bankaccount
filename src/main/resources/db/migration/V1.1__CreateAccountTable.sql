CREATE TABLE ACCOUNT(
    ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    NAME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL UNIQUE,
    PASSWORD VARCHAR(255) NOT NULL,
    BALANCE NUMERIC(8,2) NOT NULL,
    PRIMARY KEY (ID)
)