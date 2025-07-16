@echo off
echo 🚀 Construyendo y ejecutando TrendScope...

echo 🔍 Verificando Docker...
docker info > nul 2>&1
if %errorlevel% neq 0 (
    echo ❌ Docker Desktop no está ejecutándose
    echo 💡 Por favor, inicia Docker Desktop y espera a que esté listo
    echo    Luego ejecuta este script nuevamente
    pause
    exit /b 1
)

echo ✅ Docker está funcionando correctamente

echo 🧹 Limpiando contenedores anteriores...
docker-compose down -v

echo 📦 Construyendo imágenes...
docker-compose build

if %errorlevel% neq 0 (
    echo ❌ Error al construir las imágenes
    echo 📋 Revisando logs...
    docker-compose logs
    pause
    exit /b 1
)

echo 🏃 Iniciando servicios...
docker-compose up -d

if %errorlevel% neq 0 (
    echo ❌ Error al iniciar servicios
    echo 📋 Revisando logs...
    docker-compose logs
    pause
    exit /b 1
)

echo ⏳ Esperando servicios...
timeout /t 30

echo ✅ Servicios iniciados:
echo   - MySQL: http://localhost:3306
echo   - Redis: http://localhost:6379  
echo   - Microservice: http://localhost:8080
echo   - Dummy Service: http://localhost:8081
echo   - Gateway: http://localhost:8090

echo 📋 Estado de contenedores:
docker-compose ps

echo 💡 Comandos útiles:
echo   - Ver logs: docker-compose logs -f
echo   - Detener: docker-compose down
echo   - Reiniciar: docker-compose restart

pause