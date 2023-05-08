# student
This is a Spring Boot application with around 5 APIs for performing the CRUD operations.

## Design of the Application
![Insurance](https://user-images.githubusercontent.com/116934640/229424169-a74ea9fa-de38-41a3-885e-3d070bc40859.png)


# Database Schema (EER Diagram)
![Insurance-ER](https://user-images.githubusercontent.com/116934640/229427959-8dd40704-2102-4e0b-acbf-9b530f7b8a38.png)


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
image![addClient](https://user-images.githubusercontent.com/116934640/229422187-159ca297-20e7-43dc-b9d1-b62d9302a08b.png)


## => Deletion of a Student with the help of id:
image![deleteAClient](https://user-images.githubusercontent.com/116934640/229422329-17a94330-0a0a-436c-bf18-8ade1ac0340c.png)


## => Updating information of a Student with the help of id:
image![updateClient](https://user-images.githubusercontent.com/116934640/229422577-78810c1a-cb42-4911-8d60-8ac1f5b418a6.png)


## => Getting the information of a Student with the help of id:
image![getAClient](https://user-images.githubusercontent.com/116934640/229422633-03c55e69-229b-472c-b7c7-125deb5b5995.png)

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
