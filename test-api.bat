@echo off
echo ?? Iniciando pruebas de API de TrendScope...

set BASE_URL=http://localhost:8090
set JWT_TOKEN=

echo ?? 1. Registrando usuario...
curl -s -X POST %BASE_URL%/api/auth/register -H "Content-Type: application/json" -d "{\"username\":\"testuser\",\"password\":\"password123\",\"role\":\"TREND_ANALYST\",\"email\":\"testuser@trendscope.com\"}"

echo ?? 2. Haciendo login...
curl -s -X POST %BASE_URL%/api/auth/login -H "Content-Type: application/json" -d "{\"username\":\"testuser\",\"password\":\"password123\"}"

echo ?? 3. Obteniendo todas las tendencias...
curl -s -X GET %BASE_URL%/api/trends -H "Authorization: Bearer YOUR_JWT_TOKEN"

echo ?? 4. Probando servicio dummy...
curl -s -X GET %BASE_URL%/api/external/trends

echo ? Pruebas completadas!

pause
