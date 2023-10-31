# Online Movie Ticket Web Application

</br>
<b>User account-</b> login: <b>user</b> password: <b>user</b> | <b>Admin account-</b> login: <b>admin</b> password: <b>admin</b>

## Contents
* [About](#about)
* [Changelog](#changelog)
* [Technologies](#technologies)
* [Functions](#functions)

## About
This project aimed to broaden the knowledge of programming and the use of my knowledge in practice. The main goal was to create a modern application that is functional and
fault-tolerant. This application is used to book seats in a cinema. Users can browse the repertoire, select a day and time, and then reserveSeatConfiguration seats. The seats are divided into
already reserved and unreserved. All data is stored in the database. Users can register and log into the system. Administrator is able to do CRUD operations on movies and
screening times. The app was tested on mobile devices.

## Changelog
- The entire project was upgraded to common correct programming practices based on commercial experience.
- The logic has been moved from the controller to the service.
- Added paths in the controller as Routes.
- Added logs with information in service methods via Lombok.
- Much more fixes, corrections, upgrades to clean code.

## Technologies
* Java
* Spring Boot
* Spring Security
* Hibernate
* H2
* Thymeleaf
* Bootstrap
  
#### Used tools:
* Maven
* Lombok


## Functions
- Everyone can browse the application without logging into the system.
- Additional menu with more options for admin who can add, edit and delete movies.
- Admin can add, edit and delete the day and time when a particular movie will be playing in the cinema.
- Non logged in users can register and login to the application.
- Logged in users can reserveSeatConfiguration seats.
- Seats validation: user cannot reserveSeatConfiguration the entire cinema hall or leave a seat empty.
- User registration validation: each field must be entered correctly.
- User must confirm his registration to the e-mail adress he provided.
- Seats are divided into reserved(green) and unreserved(red).

 

### Responsiveness on mobile devices:

![172990822_260064565770636_2167538867048692561_n](https://user-images.githubusercontent.com/46786100/114551398-a0e52800-9c63-11eb-81bd-307eb7d15f11.jpg)

User can swipe through the application.
