## 2. build-and-run.bat
```batch
@echo off
echo 🚀 Construyendo y ejecutando TrendScope...

echo 🧹 Limpiando contenedores anteriores...
docker-compose down -v

echo 📦 Construyendo imágenes...
docker-compose build

echo 🏃 Iniciando servicios...
docker-compose up -d

echo ⏳ Esperando servicios...
timeout /t 30

echo ✅ Servicios iniciados:
echo   - MySQL: http://localhost:3306
echo   - Redis: http://localhost:6379  
echo   - Microservice: http://localhost:8080
echo   - Dummy Service: http://localhost:8081
echo   - Gateway: http://localhost:8090

echo 📋 Ver logs:
echo   docker-compose logs -f

pause