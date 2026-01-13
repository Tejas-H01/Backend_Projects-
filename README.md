# Java Spring Boot – Calculator REST API Example Program

This repository contains a Java **Spring Boot** application that demonstrates how to build a simple **RESTful calculator service**.  
It is intended for beginners who are learning Spring Boot basics, REST controllers, dependency injection, and request handling.

---

## 📌 Program Overview

The program implements a **calculator REST API** that performs basic arithmetic operations using HTTP endpoints.  
A service class handles the business logic, while a controller class exposes endpoints for client interaction.

The application supports four operations:
- Addition
- Subtraction
- Multiplication
- Division

---

## 🧪 Code Functionality

- Uses **Spring Boot** to bootstrap the application.
- Defines a service class (`Arithmetic_Service`) to handle arithmetic logic.
- Uses dependency injection to inject the service into the controller.
- Exposes REST endpoints using `@RestController` and `@GetMapping`.
- Accepts input values using `@RequestParam`.
- Returns results as HTTP responses.
- Demonstrates separation of concerns between controller and service layers.

---

## 🖥️ Output

The application produces four different outputs based on the endpoint accessed:

### Output 1 – Addition
`/calc/add?a=10&b=5`  
![Addition Output](output_add.png)

### Output 2 – Subtraction
`/calc/sub?a=10&b=5`  
![Subtraction Output](output_sub.png)

### Output 3 – Multiplication
`/calc/mul?a=10&b=5`  
![Multiplication Output](output_mul.png)

### Output 4 – Division
`/calc/div?a=10&b=5`  
![Division Output](output_div.png)

---

## 📂 File Information

- `CalculatorApplication.java` — Spring Boot main class
- `Controller.java` — REST controller exposing calculator endpoints
- `Arithmetic_Service.java` — Service class containing business logic
- `output_add.png` — Screenshot of addition result
- `output_sub.png` — Screenshot of subtraction result
- `output_mul.png` — Screenshot of multiplication result
- `output_div.png` — Screenshot of division result
- `README.md` — Project documentation

---

## 👨‍💻 Author

**Tejas Halvankar**  
📧 Email: `tejashalvankar0@gmail.com`  
🌐 GitHub: [Tejas-H01](https://github.com/Tejas-H01)

