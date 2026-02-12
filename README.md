# 🏥 Hospital Appointment Booking System

## 👩‍💻 Team Members
- Hima Joy
- Elsa Elizabeth Issac

---

## 📌 Problem Statement
Hospitals face difficulty in managing patient appointments manually. 
This project provides a simple digital solution to book and store hospital appointments using Java and MySQL.

---

## 🎯 Objective
To develop a GUI-based Hospital Appointment Booking System that:
- Allows patients to book appointments
- Stores patient details in MySQL database
- Provides a simple and user-friendly interface

---

## ✨ Features
- Book new appointments
- Store patient details securely
- Connect to MySQL database
- Simple Java Swing GUI
- Easy to use interface

---

## 💻 Technologies Used
- Java (JDK)
- Java Swing
- MySQL Database
- XAMPP
- MySQL Connector JAR
- VS Code
- Git & GitHub

---

## ⚙ Steps to Run the Program

1. Install JDK.
2. Install XAMPP and start MySQL.
3. Create database in MySQL:

   CREATE DATABASE hospital;

4. Create table:

   CREATE TABLE appointments (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(100),
       age INT,
       gender VARCHAR(10),
       doctor VARCHAR(100),
       date VARCHAR(50)
   );

5. Add MySQL connector JAR file inside lib folder.
6. Compile:

   javac -cp ".;lib/mysql-connector-j-9.6.0.jar" HOSPITALAPPOINTMENTSYS.java

7. Run:

   java -cp ".;lib/mysql-connector-j-9.6.0.jar" HOSPITALAPPOINTMENTSYS

---

## 🖼 Screenshots

### Home Interface
"C:\Users\hp\OneDrive\Pictures\Screenshots\Screenshot 2026-02-12 123945.png"
### Appointment Booking Interface
"C:\Users\hp\OneDrive\Pictures\Screenshots\Screenshot 2026-02-12 124057.png"
### Database Table
"C:\Users\hp\OneDrive\Pictures\Screenshots\Screenshot 2026-02-12 124134.png"

---

## 🧪 Sample Input

PatientName: Hima 
Age: 18 
SelectDoctor: Dermatologist 
Date: 22/02/2026  

---

## 📤 Sample Output
Appointment booked successfully and stored in database.

---

## 📌 Conclusion
This project demonstrates the integration of Java GUI and MySQL database for real-world hospital management systems.

---

⭐ Developed for academic purpose.
