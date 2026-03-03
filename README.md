# API REST - Gestión de Tareas con Seguridad JWT y Roles

Este proyecto es una API REST desarrollada con Spring Boot como parte de mi formación en backend con Java.

Incluye CRUD completo de tareas, autenticación con JWT propio y autorización basada en roles (ADMIN / USER).

El objetivo fue aplicar conceptos reales de arquitectura en capas, persistencia con JPA y seguridad stateless.

---

## 🚀 Funcionalidades

✔️ CRUD completo de tareas  
✔️ Persistencia con JPA e Hibernate  
✔️ Autenticación mediante JWT  
✔️ Generación y validación de tokens  
✔️ Autorización basada en roles  
✔️ Protección de endpoints  
✔️ Arquitectura en capas  

---

## 🔐 Seguridad implementada

El proyecto utiliza Spring Security con autenticación basada en JSON Web Tokens (JWT).

Flujo de autenticación:

1. El usuario envía credenciales.
2. El servidor valida los datos.
3. Se genera un JWT firmado.
4. El cliente envía el token en cada request.
5. Un filtro valida el token antes de acceder a los endpoints protegidos.

Características:

- Seguridad stateless (sin sesiones)
- Filtro personalizado para validación de JWT
- Roles ADMIN y USER
- Restricción de acceso según permisos

Ejemplo de permisos:

- USER → puede consultar, crear y modificar tareas.
- ADMIN → puede crear, modificar y eliminar usuarios.

---

## 🛠 Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Spring Security
- JWT (implementación propia)
- MySQL
- Maven

---

## 🏗 Arquitectura

Organizado en arquitectura en capas:

- Controller → Manejo de requests HTTP
- Service → Lógica de negocio
- Repository → Acceso a datos
- Entity → Modelo persistente
- Security → Configuración, filtros JWT y control de roles

---

## ⚙️ Cómo ejecutar el proyecto

1. Clonar el repositorio:

git clone https://github.com/TUUSUARIO/NOMBRE-REPO.git

2. Configurar la base de datos en `application.properties`:

spring.datasource.url=jdbc:mysql://localhost:3306/tu_base
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
spring.jpa.hibernate.ddl-auto=update

3. Ejecutar:

mvn spring-boot:run

Servidor por defecto:
http://localhost:8080

---

## 📬 Endpoints principales

| Método | Endpoint        | Acceso |
|--------|-----------------|--------|
| POST   | /login          | Público |
| GET    | /todos          | USER / ADMIN |
| GET    | /todos/{id}     | USER / ADMIN |
| POST   | /todos          | ADMIN |
| PUT    | /todos/{id}     | ADMIN |
| DELETE | /todos/{id}     | ADMIN |

---

## 📚 Contexto

Proyecto desarrollado como parte de un curso completo de Spring Boot, donde implementé desde una API básica hasta un sistema con seguridad JWT, roles y control de acceso.

Actualmente continúo profundizando en testing, buenas prácticas y despliegue en la nube.
