DROP TABLE IF EXISTS test_db.user;
CREATE TABLE test_db.user (
    id SERIAL PRIMARY KEY, provider VARCHAR(20), providerKey VARCHAR(4096), name varchar(30)
);
