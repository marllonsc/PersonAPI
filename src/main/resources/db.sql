CREATE DATABASE IF NOT EXISTS my_db;
USE my_db;

CREATE TABLE person (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  document VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL
);

-- Insert sample data into the table
INSERT INTO person (name, document, email)
VALUES ('John Doe', '123456789', 'johndoe@example.com'),
       ('Jane Smith', '987654321', 'janesmith@example.com');
