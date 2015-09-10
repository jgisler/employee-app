--CREATE USER 'employees_app'@'localhost' IDENTIFIED BY 'employees_app';
GRANT SELECT, INSERT, UPDATE, DELETE ON employees.* TO 'employees_app'@'localhost';
FLUSH PRIVILEGES;