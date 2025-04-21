# demo54 Java Application

# Project Overview

- This is a Java-based Spring Boot application which uses the code-first approach and connects to a PostgreSQL database to store,retrieve and manipulate data.  
- This application allows users to manage data by performing CRUD operations such as create, read, update, and delete. It is built using Spring Boot and PostgreSQL, and follows a code-first design. The application can be tested with Postman and API documentation is available via Swagger UI.

# Prerequisites
Before running this project, make sure you have:

- Java 17 or a higher version installed
- Maven installed (or use an IDE like IntelliJ IDEA with Maven support)
- Internet connection (to download dependencies)
- PostgreSQL installed and configured if you want to run the database connection (update application.properties according to your own DB credentials)

Note: All required dependencies will be automatically downloaded via Maven when you build the project.


## How It Works
- The application starts a local web server.
- Connects to a PostgreSQL database using code-first approach.
- Provides RESTful endpoints for data manipulation.
- You can test and view API endpoints using Postman or Swagger UI after running the application.
   - For Postman, select send an API request on the main page and then send HTTP requests with addresses (http://localhost:8080/employee/all  etc.).
   - For Swagger, go to http://localhost:8080/swagger-ui.html address.
  
# Technologies Used
- Java 17
- Spring Boot
- PostgreSQL
- JPA (Hibernate)
- IntelliJ IDEA (IDE)


# License
This project is licensed under the terms of the MIT License. See the [LICENSE](LICENSE) file for details.


