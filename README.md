# README

## Project Title: Demo Spring Boot Application

### Description

This project is built with Spring Boot and MySQL and serves as a RESTful web service for managing products. It enables users to perform CRUD (Create, Read, Update, Delete) operations on product data.

### Table of Contents
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Getting Started](#getting-started)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

### Technologies Used
- **Java 23**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **MySQL**
- **Maven**

### Features
- RESTful API for product management
- CRUD operations for products
- Search functionality for products by name
- Automatic timestamping for product creation and updates

### Getting Started
To get a local copy up and running follow these simple steps.

### Installation
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/demo-spring-boot.git
   cd demo-spring-boot
   ```

2. **Set up MySQL Database**
   - Create a new database in MySQL.
   - Update the `application.properties` file with your database credentials.

3. **Build the project**
   ```bash
   ./mvnw clean install
   ```

### Usage
- Start the application using the command:
  ```bash
  ./mvnw spring-boot:run
  ```

### API Endpoints
| Method | Endpoint                | Description                          |
|--------|-------------------------|--------------------------------------|
| GET    | `/api/products`         | Retrieve all products                |
| GET    | `/api/products/{id}`    | Retrieve a product by ID             |
| POST   | `/api/products/add-product` | Add a new product                  |
| PUT    | `/api/products/{id}`    | Update an existing product           |
| DELETE | `/api/products/{id}`    | Delete a product by ID               |
| GET    | `/api/products/search`  | Search products by name              |

### Database Configuration
- Ensure that you have MySQL installed and running.
- Update the `src/main/resources/application.properties` file with your database connection details:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update
  ```

### Running the Application
- After setting up the database and updating the configuration, run the application using:
  ```bash
  ./mvnw spring-boot:run
  ```

### Testing
- The project includes basic tests located in `src/test/java/com/example/demo/DemoApplicationTests.java`.
- To run the tests, use the command:
  ```bash
  ./mvnw test
  ```
