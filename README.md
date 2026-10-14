# Spring Core Assignment

A small command-line project built to learn the core ideas of the **Spring Framework**: Inversion of Control (IoC), Dependency Injection (DI), and bean wiring with annotations. No Spring Boot involved, the application context is created manually.

## What it does

When an order is placed, the app sends a notification through a pluggable `NotificationService`. The notification channel (Email or SMS) is injected by Spring, so `OrderService` never creates or hard-codes its dependency.

```
Order Placed
Email notification sent.
```

## Concepts covered

- `@Configuration` and `@ComponentScan` for Java-based configuration
- `@Component` for registering beans
- `@Bean` for registering a bean manually (`User`)
- Constructor injection
- `@Qualifier` to choose between multiple implementations of one interface
- Programming to an interface (`NotificationService`)
- `AnnotationConfigApplicationContext` and `getBean()`

## Project structure

```
src/main/java/in/riyansh/
├── AppConfig.java            # Configuration class, defines the User bean
├── Main.java                 # Entry point, creates the Spring context
├── OrderService.java         # Depends on NotificationService
├── User.java                 # Simple model class
└── notification/
    ├── NotificationService.java   # Interface
    ├── EmailService.java          # Email implementation
    └── SmsService.java            # SMS implementation
```

## How it works

1. `Main` creates an `AnnotationConfigApplicationContext` using `AppConfig`.
2. `@ComponentScan` finds all `@Component` classes and registers them as beans.
3. Spring builds `OrderService` and injects the `NotificationService` bean picked by `@Qualifier`.
4. `placeOrder()` prints the order message and calls `sendNotification()` on the injected service.

To switch the channel, change the qualifier in `OrderService`:

```java
public OrderService(@Qualifier("email") NotificationService ns)  // or "sms"
```

## Tech stack

- Java 25
- Spring Framework (spring-context)
- Maven

## How to run

```bash
git clone https://github.com/sharma-coder2008/Spring-Core-Assignment.git
cd Spring-Core-Assignment
```

Open the project in IntelliJ IDEA, let Maven import the dependencies, and run `Main`.

## Planned improvements

- Let the user choose Email or SMS at runtime by injecting a `Map<String, NotificationService>`
- Add more notification channels
- Move on to Spring Boot

## Author

Riyansh Sharma
GitHub: [sharma-coder2008](https://github.com/sharma-coder2008)
