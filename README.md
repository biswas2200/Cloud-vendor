
# Cloud Vendor Service

## Description
The Cloud Vendor

# Cloud Vendor Service

## Description
The Cloud Vendor Service is a RESTful API designed to manage cloud vendor operations. This project aims to streamline and optimize vendor-related processes in cloud environments, ensuring scalability and efficiency. The service handles various operations such as creating, retrieving, updating, and deleting vendor information.

## Features
- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on vendor data.
- **Vendor Management**: Efficiently manage vendor information including vendor details, services offered, and contact information.
- **Exception Handling**: Robust error handling mechanisms to ensure smooth operation and user-friendly error messages.
- **Data Transfer Objects (DTOs)**: Use of DTOs to encapsulate data and ensure clean API interfaces.

## Technologies Used
- **Java**: Core programming language used to develop the application.
- **Spring Boot**: Framework for building the RESTful API.
- **Spring Data JPA**: For database interactions and ORM.
- **H2 Database**: In-memory database for testing and development.
- **Maven**: Dependency management and build automation.
- **JUnit & Mockito**: Testing frameworks for unit and integration tests.

## Installation
1. **Clone the repository**:
   ```
   git clone https://github.com/biswas2200/Cloud-vendor.git
   ```
2. **Navigate to the project directory**:
   ```
   cd Cloud-vendor
   ```
3. **Build the project using Maven**:
   ```
   mvn clean install
   ```
4. **Run the application**:
   ```
   mvn spring-boot:run
   ```

## Usage
- **API Endpoints**:
  - `GET /vendors`: Retrieve a list of all vendors.
  - `GET /vendors/{id}`: Retrieve details of a specific vendor by ID.
  - `POST /vendors`: Create a new vendor.
  - `PUT /vendors/{id}`: Update an existing vendor by ID.
  - `DELETE /vendors/{id}`: Delete a vendor by ID.

## Contribution
Feel free to fork this repository and contribute by submitting pull requests. Any improvements or suggestions are highly appreciated.
