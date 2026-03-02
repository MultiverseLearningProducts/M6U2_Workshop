# JSE Module 6 – Lab 2: Building APIs with Spring Boot

Self-contained lab for **Workshop 2 – Building APIs with Spring Boot**. Complete a RESTful CRUD API for a **User** resource (JSONPlaceholder-style) using Spring Boot and H2.

## Contents

- **Starter code:** Spring Boot project with User entity, repository, service, and controller stubs (TODOs).
- **Skillable instructions:** `skillable-lab-w2-building-apis-spring-boot.md` (upload as lab Instructions in Skillable).

## Prerequisites

- Java 17+
- Maven 3.6+ (or use `./mvnw`)

## Quick start

```bash
./mvnw spring-boot:run
```

Implement the endpoint logic in `UserController.java`, then test with **Hoppscotch** (Browser Extension for localhost) or Postman. Endpoints: GET /api/users, GET /api/users/{id}, POST /api/users, DELETE /api/users/{id}.

## Pushing to Git

```bash
cd output/jse/module-06/lab-02-spring-boot-api
git init
git add .
git commit -m "Initial commit: Lab 2 Spring Boot User API starter and Skillable instructions"
git remote add origin <your-repo-url>
git push -u origin main
```

## Lab alignment

- **Module:** JSE Module 6 – Building APIs in Java  
- **Workshop:** 2 – Building APIs with Spring Boot  
- **Learning objectives:** RESTful CRUD endpoints, @PathVariable/@RequestBody, ResponseEntity and status codes (200, 201, 204).
