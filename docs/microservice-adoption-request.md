## Microservicio de Solicitudes de Adopción
Este microservicio representa la administración de solicitudes de adopción dentro del sistema.

La entidad principal será AdoptionRequest, la cual almacena la información necesaria para registrar qué adoptante desea adoptar una mascota.

# Entidad: AdoptionRequest
La entidad AdoptionRequest representa una solicitud realizada por un adoptante para iniciar el proceso de adopción de una mascota.

- Este microservicio se comunica con:

    - Microservicio de mascotas.
    - Microservicio de adoptantes.
### Atributos sugeridos
- id
- adopterId
- petId
- emailAdopter
- namePet
- status
### Enum sugerido: AdoptionRequestStatus
El estado de la solicitud puede manejarse mediante un enum.

``` java
public enum AdoptionRequestStatus {
PENDING,
APPROVED,
REJECTED
}
```
### Implementación de Resilience4j
Al comunicarse con los microservicios **microservicepet y microserviceadopter** se implementa el patrón de diseño de **Circuit Breaker** en la implementación del Servicio (**ServiceImpl**).

### Se agrega el siguiente starter
- Resilience4j de spring cloud.

## Variables de ambiente usadas por el microservicio
- **PORT default(9093)**: Representa el puerto donde se ejecuta el microservicio.
- **DB_IP default(localhost)**:Representa la IP del servidor de MySQL.
- **DB_PORT default(3306)**: Representa el puerto del servidor de MySQL.
- **DB_NAME default(microserviceadoptionrequest)**: Nombre de la base de datos que se conectará el microservicio.
- **DB_USER default(root)**: Usuario de la base de datos que se conectará el microservicio.
- **DB_PASSWORD default(abc123)**: Contraseña de la base de datos que se conectará el microservicio.
- **EUREKA_IP default(localhost)**: IP del servidor de descubrimiento eureka.
- **EUREKA_PORT default(9999)**: Puerto de conexión al servidor de descubrimiento.
- **CONFIG_IP default(localhost)**: IP del servidor de configuración.
- **CONFIG_PORT default(7777)**: Puerto del servidor de configuración.