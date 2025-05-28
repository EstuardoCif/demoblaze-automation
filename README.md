# Demoblaze QA Automation

Este proyecto contiene la automatización funcional de la página [https://www.demoblaze.com](https://www.demoblaze.com) utilizando Java, Maven, Selenium WebDriver y JUnit 5.

## Tecnologías utilizadas

- Java 17+
- Maven
- Selenium WebDriver
- JUnit 5
- WebDriverManager
- Allure Report
- IntelliJ IDEA

## 📂 Estructura del proyecto
src/
├── main/
│ └── java/
├── test/
│ └── java/
│ ├── base/ # Clase BaseTest (setup general)
│ ├── pages/ # Page Objects
│ └── tests/ # Casos de prueba funcionales


## Cómo ejecutar
### Creación de un PROFILE en powershell:
#### ABRIR POWERSHELL y EJECUTAR:
```bash
Test-Path $PROFILE

New-Item -Path $PROFILE -ItemType File -Force
```

#### ABRIR PROFILE:
```bash
notepad $PROFILE
```

#### COPIAR ESTE CODIGO EN PROFILE Y GUARDAR:

```bash
function runTest {
    param([string]$pattern)

    if (-not $pattern) {
        Write-Host "Ingresar el nombre del test. Ej: runTest T01*"
        return
    }

    Write-Host "Ejecutando tests con patrón: $pattern`n"

    mvn clean "-Dtest=$pattern" test

    # Mostrar resultados Allure aunque haya errores
    allure serve target/allure-results
}
```

### Ejecución de los tests:

#### TEST INDIVIDUAL
```bash
runTest T01*
```
#### EJECUCIÓN DE TODOS LOS TEST
```bash
runTest T*
```



