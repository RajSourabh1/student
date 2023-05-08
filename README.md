# Student-Database
This is a Spring Boot application with around 5 APIs for performing the CRUD operations.

## Design of the Application
![design](https://user-images.githubusercontent.com/116934640/236814961-2dd93865-2665-429c-8376-caec858ac37d.PNG)

# Database Schema (EER Diagram)
![studentER](https://user-images.githubusercontent.com/116934640/236814998-608cdb07-46ba-47d4-b6b0-7c09ee957441.PNG)


# Description
This Student database application can do the following tasks :

* Student
   - Add a student on the application.
   - Get a student through id.
   - Update student's information by providing all the attributes with the help of id. (If he wants to change the value of some attributes then he will have to provide the update
  value of this attribute and if he does not want to update the attribut like name then provide the previous value.)
   - Delete a student through id.

Steps to perform operations
# Student :
## => Adding a student :
![addStudent](https://user-images.githubusercontent.com/116934640/236815026-886d3b4d-5ec8-4532-8a92-b2bed2962bce.PNG)


## => Deletion of a Student with the help of id:
![deleteAStudent](https://user-images.githubusercontent.com/116934640/236815075-5dde0d19-f637-4807-b795-a6ceb5945cd9.PNG)


## => Updating information of a Student with the help of id:
![updateStudent](https://user-images.githubusercontent.com/116934640/236815099-85feea7e-4566-4f5a-98c3-f2ffad1c8778.PNG)


## => Getting the information of a Student with the help of id:
![getStudent](https://user-images.githubusercontent.com/116934640/236816103-5994b033-2512-41fb-88ec-61e7f34ff66d.PNG)



# Tech Stack
This project uses some of the following tech stacks:

- Spring Boot
* Hibernate
+ MySQL

# How to run this application locally :
Clone the repo and open it through the application that supports maven and spring boot like IntellIJ. Before starting the server change the password on
application.properties with your mysql database password and create a database with the name of 'insurance' in mysql. 

# Conclusion :
This ONLINE-STUDENT-DATABASE-APPLCIATION provides a strong backend infrastructre to do CRUD operations and managing the database.
