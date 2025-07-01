# 🧪 Spring Boot Prototype Scope POC (with Hexagonal Architecture)

This project is a Proof of Concept (POC) demonstrating the use of the `prototype` bean scope in Spring Boot, following the principles of Hexagonal Architecture (Ports and Adapters).

---

## ✅ Objective

Demonstrate how to:

- Create a bean with `prototype` scope;
- Inject different instances of the bean on demand using `ObjectProvider`;
- Organize the application into layers using Hexagonal Architecture.

---

## 📦 Technologies Used

- Java 17+
- Spring Boot 3.x
- Maven or Gradle (configurable)
- Hexagonal Architecture (Ports & Adapters)

---

## 🧠 What is `prototype` scope?

In Spring, the default scope is `singleton`, where **only one instance of a bean is created** for the entire application. With the `prototype` scope, **a new instance is created each time the bean is requested**.

---

## 📁 Project Structure

```
src/main/java/com/example/prototypepoc
├── domain
│ └── port
│ └── in
│ └── BeanConsumerPort.java # Input port
├── application
│ └── service
│ └── BusinessService.java # Core business logic
└── infrastructure
└── primary
└── spring
├── PrototypeBean.java # Prototype-scoped bean
└── PrototypeConsumer.java # Adapter that injects PrototypeBean
```

---

## 🚀 How to Run

```bash
# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
