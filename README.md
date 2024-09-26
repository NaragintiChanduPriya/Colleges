# College Management System

This project is a College Management System built using Spring Boot for the backend and React for the frontend. It allows users to view and update college details.

## Table of Contents

- Features
- Technologies Used
- Getting Started
- Backend Setup
- Frontend Setup
- Usage
- API Endpoints
- Contributing
- License

## Features

- View a list of colleges
- View details of a specific college


## Technologies Used

- **Backend**: Spring Boot, Spring Data JPA, MySQL
- **Frontend**: React, React Router

## Getting Started

### Prerequisites

- Java 11 or higher
- Node.js and npm
- MySQL

### Backend Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/Colleges.git
    cd Colleges
    ```

2. Navigate to the backend directory:

    ```bash
    cd backend
    ```

3. Update the `application.properties` file with your MySQL database configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    ```

4. Build and run the Spring Boot application:

    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend Setup

1. Navigate to the frontend directory:

    ```bash
    cd frontend
    ```

2. Install the dependencies:

    ```bash
    npm install
    ```

3. Start the React application:

    ```bash
    npm start
    ```

## Usage

- Open your browser and navigate to `http://localhost:5173` to access the frontend.
- The backend API will be running at `http://localhost:8080`.

## API Endpoints

- `GET /`: Retrieve details of a colleges.
- `GET /colleges/{id}`:  Retrieve details of a specific college by ID.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License.
