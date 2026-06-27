# Spring Batch Final — Calificaciones de Estudiantes

Proyecto final del curso. Procesa calificaciones de estudiantes usando Spring Batch, expone una API REST y tiene pruebas unitarias.

## ¿Qué hace?

1. Lee un CSV con estudiantes y sus tres notas
2. Calcula el promedio y guarda los resultados en MySQL
3. Determina si cada estudiante está aprobado (promedio ≥ 70) o reprobado y guarda el reporte en MongoDB
4. Expone una API REST para consultar y manipular los datos

## Tecnologías

- Java 17
- Spring Boot 3.2.2
- Spring Batch
- Spring MVC (API REST)
- Spring Data JPA + MySQL
- Spring Data MongoDB
- Docker
- JUnit 5 + Mockito
- Maven

## Requisitos

- Java 17
- Maven
- Docker con los contenedores `mysql-academia` y `mongo-academia`

## Cómo ejecutar

```bash
# 1. Iniciar contenedores
docker start mysql-academia mongo-academia

# 2. Correr la aplicación
mvn spring-boot:run
```

La app corre el batch al iniciar y queda como servidor en `http://localhost:8080`.

## Pruebas unitarias

```bash
mvn test
```

## API REST

| Método | Endpoint | Descripción |
|---|---|---|
| GET | `/api/estudiantes` | Lista todos los estudiantes |
| GET | `/api/estudiantes/{id}` | Obtiene un estudiante |
| POST | `/api/estudiantes` | Crea un estudiante |
| PUT | `/api/estudiantes/{id}` | Actualiza un estudiante |
| PATCH | `/api/estudiantes/{id}` | Cambia el grupo |
| DELETE | `/api/estudiantes/{id}` | Elimina un estudiante |
| GET | `/api/reportes` | Lista todos los reportes |
| GET | `/api/reportes/estado/{estado}` | Filtra por aprobado o reprobado |

## Screenshots

Ver carpeta `/Screenshots` en el repositorio.
