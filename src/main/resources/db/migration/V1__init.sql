DROP TABLE IF EXISTS test_db.todo;
CREATE TABLE test_db.todo (
    id SERIAL PRIMARY KEY, description VARCHAR(255), details VARCHAR(4096), done BOOLEAN
);
