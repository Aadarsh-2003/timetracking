# Time Tracking & Project Management System

A Java-based web application designed to help organizations monitor project progress, manage tasks, and track the amount of time spent by developers on different tasks.

## Overview

The system organizes work into a hierarchy:

**Project → Module → Task → Daily Log**

Developers can view their assigned projects and tasks and submit daily work logs containing the hours spent and a description of their work. The system then calculates and updates the utilized hours at the task, module, and project levels.

Administrators can manage projects, modules, tasks, users, roles, technologies, and project statuses through the application.

## Key Features

* User signup and login
* Role-based access for Admin, Developer, and Project Manager
* BCrypt-based password encryption
* OTP-based password recovery
* Project, module, and task management
* Assignment of users to projects and tasks
* Daily work log submission
* Tracking of utilized hours
* Automatic aggregation of hours from Task → Module → Project
* Project status management
* User, role, and technology management
* Pagination and search for list views
* Email notifications for user registration and password recovery
* Admin dashboard with project statistics and charts

## Tech Stack

### Backend

* Java
* Spring Boot
* Spring MVC
* Hibernate / JPA

### Frontend

* JSP
* Bootstrap
* Hope UI

### Database

* MySQL

### Build Tool

* Maven

### Other

* Git & GitHub
* BCrypt
* SMTP-based email service

## Architecture

The application follows a layered MVC-based architecture.

```text
User
  ↓
JSP / UI
  ↓
Spring MVC Controllers
  ↓
Service Layer
  ↓
Repository Layer
  ↓
Hibernate / JPA
  ↓
MySQL
```

The controllers handle incoming requests and coordinate with repositories and services. Hibernate/JPA is used for database operations, while the service layer contains application-specific business logic.

## Time Tracking Flow

When a developer submits a daily log:

```text
Developer
   ↓
Select Project
   ↓
Select Module
   ↓
Select Task
   ↓
Submit Daily Log
   ↓
Store Utilized Hours
   ↓
Calculate Task Hours
   ↓
Calculate Module Hours
   ↓
Calculate Project Hours
```

The system stores individual daily logs and uses them to calculate the total utilized hours for the corresponding task, module, and project.

## Database Model

The major entities include:

* User
* Role
* Project
* Project Status
* Module
* Task
* Project User
* Task User
* Task Utilized Hours / Daily Log

The main relationship between work items is:

```text
Project
 ├── Module
 │    ├── Task
 │    │    └── Daily Logs
 │    └── ...
 └── ...
```

## Authentication & Security

The application includes:

* Password hashing using BCrypt
* Session-based authentication
* Role-based access
* OTP-based password recovery
* Password confirmation during signup and password reset
* Session timeout and logout functionality

Passwords are not stored as plain text; they are encoded using BCrypt before being stored in the database.

## Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com/arth/
│   │       ├── controller/
│   │       ├── entity/
│   │       ├── repository/
│   │       ├── service/
│   │       └── ...
│   │
│   └── resources/
│       ├── application.properties
│       └── ...
│
└── pom.xml
```

## Running the Project

### Prerequisites

Make sure you have:

* Java JDK installed
* Maven installed
* MySQL installed and running
* A configured MySQL database

### Steps

1. Clone the repository:

```bash
git clone <your-repository-url>
```

2. Create the required MySQL database.

3. Configure the database connection in:

```text
src/main/resources/application.properties
```

4. Build the project:

```bash
mvn clean install
```

5. Run the application:

```bash
mvn spring-boot:run
```

6. Open the application in your browser using the configured local server URL.

## Future Improvements

Some possible improvements include:

* Implementing centralized exception handling using `@ControllerAdvice`
* Adding stronger role-based authorization
* Using DTOs instead of exposing entities directly
* Replacing string-based dates with `LocalDate` / `LocalDateTime`
* Adding database indexes for frequently searched fields
* Improving pagination and search at the database level
* Moving email credentials to environment variables or a secret-management system
* Adding automated unit and integration tests
* Improving OTP security with expiration and attempt limits
* Migrating to REST APIs with a separate frontend if required

## Author

**Aadarsh Sharma**

Java Backend Developer | Spring Boot | Hibernate/JPA | MySQL
