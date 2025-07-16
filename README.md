# TrendScope - Microservices Platform

## Descripción
Plataforma SaaS para análisis de tendencias de moda con microservicios en Java Spring Boot.

## Arquitectura
- **Microservice** (Puerto 8080): Servicio principal con autenticación JWT
- **Dummy Service** (Puerto 8081): Servicio de datos ficticios 
- **Gateway** (Puerto 8090): API Gateway para enrutamiento
- **MySQL** (Puerto 3306): Base de datos principal
- **Redis** (Puerto 6379): Cache

## Ejecución
```bash
# Construir y ejecutar
./build-and-run.bat

# Limpiar contenedores
./cleanup.bat

# Probar APIs
./test-api.bat