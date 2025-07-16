@echo off
echo 🧹 Limpiando TrendScope...

echo 🛑 Deteniendo contenedores...
docker-compose down -v

echo 🗑️ Eliminando imágenes...
docker rmi trendscope-microservice trendscope-dummy-service trendscope-gateway 2>nul

echo 🔄 Limpiando volúmenes...
docker volume prune -f

echo ✅ Limpieza completada!
pause