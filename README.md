# Spring Boot MVC Validation Demo

A simple Spring Boot MVC application demonstrating user registration and server-side form validation using Jakarta Bean Validation and Thymeleaf.

## Features

- User registration form with a user-friendly interface
- Server-side form validation
- Field-specific validation error messages
- Email format validation
- Mobile number validation (10 digits)
- Gender selection validation
- Date of birth validation
- Success page after valid form submission

## Tech Stack

- Java 21
- Spring Boot
- Spring MVC
- Thymeleaf
- Jakarta Bean Validation
- Maven
- Lombok

## Project Structure

```text
sb-mvc-validation-demo/
├── src/
│   ├── main/
│   │   ├── java/in/ashokit/
│   │   │   ├── SbMvcValidationDemoApplication.java
│   │   │   ├── controller/
│   │   │   │   └── UserController.java
│   │   │   └── model/
│   │   │       └── User.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── messages.properties
│   │       └── templates/
│   │           ├── user-form.html
│   │           └── welcome.html
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Validation Rules

| Field | Validation |
|---|---|
| Full Name | Required |
| Email | Required and valid email format |
| Mobile Number | Exactly 10 digits |
| Gender | Selection required |
| Date of Birth | Required and must be in the past |

Validation is implemented using annotations such as `@NotBlank`, `@Email`, `@Pattern`, `@NotEmpty`, `@NotNull`, and `@Past`.

Custom validation messages are configured in `messages.properties`.

## Getting Started

### Prerequisites

- JDK 21
- Git (optional)
- IDE such as Eclipse, IntelliJ IDEA, or VS Code

### Clone the Repository

```bash
git clone <YOUR_REPOSITORY_URL>
cd sb-mvc-validation-demo
```

Replace `<YOUR_REPOSITORY_URL>` with your GitHub repository URL.

### Run the Application

**Windows:**

```bash
.\mvnw.cmd spring-boot:run
```

**macOS/Linux:**

```bash
./mvnw spring-boot:run
```

Alternatively, if Maven is installed:

```bash
mvn spring-boot:run
```

### Access the Application

Open your browser and visit:

http://localhost:8080

Fill in the registration form and submit it to see the validation results.

## Learning Outcomes

- Understanding Spring MVC architecture
- Binding form data using Thymeleaf
- Implementing Jakarta Bean Validation
- Handling validation results using `BindingResult`
- Displaying field-level error messages
- Separating controller and model responsibilities

## Future Enhancements

- Store user details in a database
- Add automated tests
- Prevent duplicate email addresses and mobile numbers
- Move CSS into separate static files

## Author

**Shayan Arshi**

Java Full Stack Developer | Java, Spring Boot, SQL & React.js
