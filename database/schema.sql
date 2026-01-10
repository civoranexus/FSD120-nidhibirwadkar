-----DATABASE SCHEMA


CREATE Database Society360;
USE Society360;
CREATE TABLE roles (
    role_id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50)
);
CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    role_id INT
);

CREATE TABLE units (
    unit_id INT PRIMARY KEY AUTO_INCREMENT,
    unit_number VARCHAR(20),
    floor_number INT,
    owner_name VARCHAR(100)
);

CREATE TABLE visitors (
    visitor_id INT PRIMARY KEY AUTO_INCREMENT,
    visitor_name VARCHAR(100),
    phone VARCHAR(15),
    visit_date DATE,
    unit_id INT,
    FOREIGN KEY (unit_id) REFERENCES units(unit_id)
);

CREATE TABLE maintenance_requests (
    request_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    issue_description VARCHAR(255),
    status VARCHAR(50),
    request_date DATE,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
