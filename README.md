🛍 ShopSphere – E-Commerce Product Catalog System

A console-based E-Commerce Product Catalog System built using Java (OOPS concepts).
This project demonstrates practical implementation of Abstraction, Inheritance, Polymorphism, and Encapsulation.

📌 Project Overview

ShopSphere is a menu-driven shopping application where users can:

Browse product categories

Add products to cart

Update or remove items

Apply discount percentage

Generate a tax invoice

View order status and delivery date

The system simulates a real-world e-commerce checkout process.

🚀 Features

✔ Product Categories (Books, Electronics, Clothing, Toys, Groceries)
✔ Object-Oriented Design
✔ Add to Cart
✔ Update Quantity
✔ Remove Items
✔ Discount Calculation
✔ GST (18%) Calculation
✔ Invoice Generation
✔ Shipping ID
✔ Order Status
✔ Expected Delivery Date
✔ Default Customer Details

🧠 OOPS Concepts Used
1️⃣ Abstraction

Product is an abstract class.

Defines abstract methods:

calculateDiscountedPrice()

displayDetails()

2️⃣ Inheritance

Subclasses extend Product:

Book

Electronics

Clothing

Toy

Grocery

3️⃣ Polymorphism

Each subclass overrides:

calculateDiscountedPrice()


to apply different discount rules.

4️⃣ Encapsulation

Data stored inside objects.

Controlled through constructors and methods.

🗂 Project Structure
ShopSphere/
│
├── Product.java
├── Book.java
├── Electronics.java
├── Clothing.java
├── Toy.java
├── Grocery.java
├── CartItem.java
├── ShopSphereMain.java
└── README.md

🛒 Workflow

User selects product category

Selects product

Enters quantity

Item added to cart

User can:

View cart

Remove item

Update quantity

Checkout

Apply additional discount

Invoice generated

🧾 Billing System Includes

Subtotal

Discount Amount

GST (18%)

Final Total

Order Date

Expected Delivery (5 Days from Order)

Order Status

Shipping ID

👤 Default Customer Details
Name: Lokesh
Address: Kautilya Hostel, NIT Patna, Bihta

🧮 Sample Invoice Output
================= INVOICE =================
Customer: Lokesh
Address : Kautilya Hostel, NIT Patna, Bihta
-------------------------------------------
1. Atomic Habits | Qty: 2 | Unit: 424 | Line: 848
-------------------------------------------
Subtotal: 848
Discount (5%): -42.4
GST (18%): +145.008
TOTAL: 950.608
-------------------------------------------
Order Date: 15-Feb-2026
Expected Delivery: 20-Feb-2026
Order Status: Shipped
===========================================

🛠 Technologies Used

Java

OOPS Principles

Java Collections (ArrayList)

Java Time API

▶ How to Run
Step 1: Compile all files
javac *.java

Step 2: Run main class
java ShopSphereMain

🎯 Learning Outcomes

By building this project, you understand:

Real-world OOPS implementation

Dynamic menu-driven programming

Object relationships

Billing and tax calculation logic

Java Collections

Modular file structure

📚 Future Improvements

Database integration (MySQL)

User login system

Payment gateway simulation

GUI version using Swing

Admin panel

👨‍💻 Author

Lokesh
B.Tech CSE
