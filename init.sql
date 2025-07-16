-- Crear base de datos
CREATE DATABASE IF NOT EXISTS trendscope_db;
USE trendscope_db;

-- Tabla de usuarios
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    role ENUM('TREND_ANALYST', 'MARKETING_MANAGER', 'DESIGNER') NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Tabla de tendencias
CREATE TABLE IF NOT EXISTS trend_data (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    keyword VARCHAR(100) NOT NULL,
    score DECIMAL(5,2) NOT NULL,
    category VARCHAR(50) NOT NULL,
    region VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- Datos de ejemplo
INSERT INTO users (username, password, email, role) VALUES 
('admin', '$2a$10$CwTycUXWue0Th/fR6xYAHu7jfgAiInDrKPBrjdOCVvgNWrVTLzOzi', 'admin@trendscope.com', 'TREND_ANALYST'),
('designer', '$2a$10$CwTycUXWue0Th/fR6xYAHu7jfgAiInDrKPBrjdOCVvgNWrVTLzOzi', 'designer@trendscope.com', 'DESIGNER');

INSERT INTO trend_data (keyword, score, category, region) VALUES 
('Vestido Floral', 89.5, 'Vestidos', 'Europa'),
('Sneakers Vintage', 76.2, 'Calzado', 'Norte América'),
('Blazer Oversized', 82.1, 'Outerwear', 'Asia');