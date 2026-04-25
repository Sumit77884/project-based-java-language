# PBJL_23BCS11219_SUMIT
# 🎬 Online Movie Ticket Booking System (LLD)

![Java](https://img.shields.io/badge/Language-Java-blue)
![OOP](https://img.shields.io/badge/Concept-OOP-orange)
![Design Patterns](https://img.shields.io/badge/Patterns-Factory%20%7C%20Observer-green)
![SOLID](https://img.shields.io/badge/Principles-SOLID-red)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## 📌 Overview

This project demonstrates a **Low-Level Design (LLD)** of an Online Movie Ticket Booking System using:

* **SOLID Principles**
* **Design Patterns**

  * Factory Method Pattern (for Payment Handling)
  * Observer Pattern (for Seat Availability Notification)

The system simulates how users book tickets, make payments, and receive updates when a seat is booked.

---

## 🏗️ System Design

### 🔹 Key Components

* **Seat** → Manages seat availability
* **User** → Receives notifications
* **Booking** → Handles booking logic
* **Payment** → Handles payment operations
* **PaymentFactory** → Creates payment objects

---

## 🎯 Design Patterns Used

### 1. Observer Pattern

* `Seat` acts as **Subject**
* `User` acts as **Observer**
* When a seat is booked → all users are notified

---

### 2. Factory Method Pattern

* `PaymentFactory` creates objects like:

  * `UpiPayment`
  * `CreditCardPayment`
* Helps in **loose coupling**

---

## 🧱 SOLID Principles Applied

* **S (Single Responsibility)**
  Each class has one responsibility

* **O (Open/Closed)**
  New features can be added without modifying existing code

* **L (Liskov Substitution)**
  Subclasses can replace parent types

* **I (Interface Segregation)**
  Small, focused interfaces

* **D (Dependency Inversion)**
  High-level modules depend on abstractions

---

## ⚙️ How It Works

1. Create a seat
2. Users subscribe for seat updates
3. Select payment method using factory
4. Confirm booking:

   * Seat is booked
   * Users are notified
   * Payment is processed

---

## ▶️ How to Run

```bash
javac *.java
java Main
```

---

## 📂 Project Structure

```
├── Observer.java
├── User.java
├── Seat.java
├── Payment.java
├── CreditCardPayment.java
├── UpiPayment.java
├── PaymentFactory.java
├── Booking.java
└── Main.java
```

---

## 🖥️ Sample Output

```
Sumit received update: Seat 101 is now booked!
Rahul received update: Seat 101 is now booked!
Paid 250.0 using UPI
Booking Confirmed!
```

---

## 🚀 Future Improvements

* Add Movie, Show, Theatre modules
* Handle concurrency (multiple bookings)
* Add seat locking mechanism
* Integrate database
* Build REST APIs

---

## 👨‍💻 Author

**Sumit Kumar**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and share with others!
