# Student Management System – Spring Boot Backend

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/Database-MySQL-blue.svg)](https://www.mysql.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A clean, production-ready **RESTful backend API** for managing student records using **Spring Boot**.  
This project demonstrates modern Spring Boot best practices including layered architecture, proper exception handling, input validation, DTO pattern, and automatic API documentation.

## ✨ Features

- **Complete CRUD operations** for student management
- RESTful API design with proper **HTTP methods** and **status codes**
- Layered architecture: **Controller → Service → Repository**
- **MySQL** integration via **Spring Data JPA** + **Hibernate** (with automatic schema generation)
- **DTO layer** to decouple API contracts from entity models (improves security & maintainability)
- Global exception handling using **`@RestControllerAdvice`** for consistent error responses
- Request validation using **Bean Validation** (`@NotBlank`, `@Email`, `@Min`, etc.)
- Automatic API documentation & interactive testing with **Swagger OpenAPI**
- Tested thoroughly using **Postman** and **Swagger UI**
- Version control with **Git** & hosted on **GitHub**

## 🛠️ Technologies Used

- **Java 17+**
- **Spring Boot** (latest stable)
- **Spring Web** – REST APIs
- **Spring Data JPA** + **Hibernate**
- **MySQL** (or compatible relational DB)
- **Lombok** (optional – reduces boilerplate)
- **Bean Validation** (Jakarta Validation)
- **Springdoc OpenAPI / Swagger UI** (modern replacement for old springfox)
- **Maven** (build tool)
- **Git** + **GitHub**

## 📋 API Endpoints (Examples)

| Method | Endpoint                  | Description                      | Status Codes (success) |
|--------|---------------------------|----------------------------------|------------------------|
| GET    | `/api/students`           | Get all students                 | 200                    |
| GET    | `/api/students/{id}`      | Get student by ID                | 200                    |
| POST   | `/api/students`           | Create new student               | 201                    |
| PUT    | `/api/students/{id}`      | Update existing student          | 200                    |
| DELETE | `/api/students/{id}`      | Delete student                   | 204                    |

Full interactive documentation available at:  
**`http://localhost:8080/swagger-ui.html`** (after running the app)

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 8+ (or you can use H2 for quick testing)

### Installation & Running Locally

1. **Clone the repository**

   ```bash
   git clone https://github.com/<your-username>/student-management-system-springboot.git
   cd student-management-system-springboot
   ```
2. **Configure database (MySQL)**
   Create a database (example: student_db)
   Update src/main/resources/application.properties:

   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=your_password

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true

   # Optional - better logging
   logging.level.org.hibernate.SQL=DEBUG
   logging.level.org.hibernate.orm.jdbc.bind=TRACE

3. Build the project
   ```bash
   mvn clean install

4. Run the application
   ```bash
   mvn spring-boot:run
OR run directly from your IDE (main class usually StudentManagementSystemApplication.java)

5. Access the API
   - Base URL: http://localhost:8080/api/students
   - Swagger UI: http://localhost:8080/swagger-ui.html
   - OpenAPI JSON: http://localhost:8080/v3/api-docs

## 🧪 Testing
- Manual testing: Use Postman or Swagger UI
- Unit & Integration tests: (if you add them later) located in src/test/java

Example Postman requests:

- POST http://localhost:8080/api/students
  ```json
  {
  "firstName": "Dipanwita",
  "lastName": "Paul",
  "email": "dipanwita@example.com",
  "age": 22,
  "grade": "A"
  }

## 🛡️ Security Note
  This is a backend learning/demo project.
  No authentication/authorization is implemented yet (e.g., JWT, OAuth2, Spring Security).
  Add proper security before deploying to production.

## 📄 License
This project is open-sourced under the MIT License.
See the LICENSE file for details.

## 👨‍💻 Author
Dipanwita
GitHub: @dipanwitapaul578
Built with ❤️ in Kolkata, India


   
   
    
   
   
