# Sistema del Departamento de Obras Públicas - Pruebas JUnit

Este documento explica cómo compilar y ejecutar los casos de prueba automatizados del sistema directamente desde la consola de comandos (o la terminal integrada de Visual Studio Code).

## Requisitos Previos
1. Tener instaladas las librerías de JUnit 4 y Hamcrest en la carpeta `lib/` del proyecto.
2. Abrir la terminal y asegurarse de estar posicionado **exactamente en la carpeta raíz del proyecto** (la carpeta `parcial2`).

---

## Paso 1: Compilar el código fuente
Antes de ejecutar los tests, es necesario compilar todos los archivos `.java`. Ejecuta el siguiente comando:

```powershell
javac -cp "lib/*" -d bin src/*.java
```
---

## Paso 2: Ejecutar los casos de prueba

### Ejecutar `CiudadanoTest`
Esta clase ejecuta las pruebas unitarias básicas: validación de credenciales fallidas, cambio de contraseña, simulación de retardo (timeout) y comparación de instancias.
```powershell
java -cp "bin;lib/*" org.junit.runner.JUnitCore CiudadanoTest
```

### Ejecutar `ParameterCIUTest`
Esta clase ejecuta una prueba parametrizada (Parameterized Test) que evalúa el validador de correos electrónicos pasando múltiples escenarios posibles desde una matriz de datos.
```powershell
java -cp "bin;lib/*" org.junit.runner.JUnitCore ParameterCIUTest
```