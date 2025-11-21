# Taller de Arquitectura y Despliegue de Sistemas
**Curso:** Arquitectura de sofware
**Universidad de Antioquia**



## Descripción
Sistema gestor de tareas diseñado para demostrar principios de arquitectura cloud, incluyendo despliegue monolítico, serverless y estático distribuido.



## Arquitectura del Proyecto
El proyecto sigue una arquitectura de microservicios desacoplada:
- **Backend:** Java 17 con Spring Boot 3.
- **Frontend:** HTML5 + JS (Fetch API).




## Principios de Diseño Aplicados
1. **Separación de Responsabilidades (SoC):** Backend y Frontend están totalmente desacoplados.
2. **SOLID (Single Responsibility):** Se implementó una capa de servicio (`TareaService`) para separar la lógica de negocio del controlador REST.
3. **DRY (Don't Repeat Yourself):** Reutilización de configuración de conexión en el Frontend mediante constantes globales.



## Instrucciones de Ejecución Local
1. Backend: `mvnw spring-boot:run` (Puerto 8080)
2. Frontend: Abrir `index.html` en navegador.