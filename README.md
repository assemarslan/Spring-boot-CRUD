##  Spring-boot-CRUD
#### Spring Boot REST API for Student Management System
This project is an example implementation of a RESTful API using Spring Boot for managing student information. The API provides functionalities to perform CRUD (Create, Read, Update, Delete) operations on student data.

### Key Components:
* **StudentController**: This controller handles incoming HTTP requests and delegates them to corresponding methods to perform CRUD operations on students.

* **Student**: The Student class represents a student entity in the system. It contains basic attributes such as `rollNo`, `name`, `percentage`, and `branch` which store information about each student.

* **CrudService**: The `CrudService` service provides methods to perform CRUD operations on `Student` objects. It uses `StudentRepository` to access student data in the database.

* **StudentRequest**: The `StudentRequest` class is used for transferring data when creating or updating a student. It contains fields `name` and `percentage`.

### Main Features of the API:
* Get All Students:

  * Method: _GET_
  * Path: `/students`
  * Description: _Returns a list of all students._

* Get Student by ID:

  * Method: _GET_
  * Path: `/students/{id}`
  * Description: _Returns information about the student with the specified ID._

* Create a New Student:

  * Method: _POST_
  * Path: `/student/add`
  * Description: _Creates a new student and saves them to the database._

* Update Student Information:

  * Method: _PUT_
  * Path: `/student/update/{id}`
  * Description: _Updates the information of the student with the specified ID._

* Delete a Student:

  * Method: _DELETE_
  * Path: `/student/delete/{id}`
  * Description: _Deletes the student with the specified ID._

### Technologies and Tools:
* **Spring Boot:** Tool for quickly creating Spring-based applications.

* **Spring Data JPA:** Simplifies database access using ORM.

* **Lombok:** Reduces boilerplate code by automatically generating getters, setters, and other methods.

### Running the Project:
1. Make sure you have JDK and Maven installed.
2. Clone the repository: `git clone` https://github.com/yourusername/SpringBootRestAPIProject.git
3. Navigate to the project directory: `cd SpringBootRestAPIProject`
4. Run the project: mvn spring-boot:`run`
5. After running, the API will be available at: http://localhost:8080

_This project serves as a simple yet useful example of using Spring Boot to create a RESTful API. You can use it as a foundation for developing more complex data management systems or for educational purposes._





