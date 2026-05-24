@echo off

:  ./gitpush.bat :

echo ==========================
echo ACTUALIZANDO REPOSITORIO
echo ==========================

cd /d "C:\Users\Ariel\Desktop\Bootcamp"

git add .

set /p mensaje="Ingrese commit:  "

git commit -m "%mensaje%"

git pull origin main --rebase

git push origin main

echo.
echo ==========================
echo REPOSITORIO ACTUALIZADO
echo ==========================

pause
