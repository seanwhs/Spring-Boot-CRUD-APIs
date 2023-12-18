
# Spring Boot CRUD API Project

This project is a Spring Boot-based CRUD API for managing customer information. It uses a PostgreSQL container for data persistence.

## Prerequisites

Make sure you have the following installed on your machine:

- Docker
- Java (if running the Spring Boot application locally)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/seanwhs/Spring-Boot-CRUD-APIs.git
cd Spring-Boot-CRUD-APIs
```

### 2. Start the PostgreSQL Container with Docker Compose

Ensure Docker is running on your machine, then execute the following command to start the PostgreSQL container:

```bash
docker-compose up -d
```

This command will start the PostgreSQL container in the background.

### 3. Create the Customer Database

The PostgreSQL container should automatically create the necessary database. However, if you encounter any issues, you can manually create the "customer" database using the following steps:

#### Access the PostgreSQL Container

```bash
docker exec -it postgres psql -U root
```

#### Create the Database

```sql
CREATE DATABASE customer;
```

#### Exit the PostgreSQL Shell

```sql
\q
```

Alternatively, run the following command to automate the process:

```bash
docker exec -it postgres psql -U root -c "CREATE DATABASE customer;"
```

### 4. Run the Spring Boot Application

Navigate to the root directory of your Spring Boot project and run the application:

```bash
./mvnw spring-boot:run
```

The application should now be accessible at `http://localhost:8080`. You can use tools like Postman or cURL to interact with the CRUD API.

## API Documentation

In progress 

## Cleanup

To stop the containers and remove them, execute the following command:

```bash
docker-compose down
```

This will stop and remove the PostgreSQL and Spring Boot containers.

## Troubleshooting

If you encounter any issues or have questions, please feel free to open an issue on the GitHub repository.
```

This includes a command to create the "customer" database directly within the PostgreSQL container, making it more convenient for users.
