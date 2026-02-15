🛍 ShopSphere
Console-Based E-Commerce System | Java OOPS Project

📌 Overview

ShopSphere is a console-based E-Commerce Product Catalog System built using Java to demonstrate practical implementation of Object-Oriented Programming (OOPS) concepts.

The application simulates a real-world online shopping system with:

Product catalog

Shopping cart

Discount logic

GST calculation

Tax invoice generation

Shipping & order tracking

🎯 Key Highlights

🧠 Strong OOPS implementation

🛒 Fully functional cart system

🧾 Dynamic billing with tax & discount

📦 Shipping ID & delivery tracking

📅 Expected delivery date calculation

🏷 Category-based product hierarchy

🧠 OOPS Concepts Used
🔹 Abstraction

Product is an abstract class defining:

calculateDiscountedPrice()

displayDetails()

🔹 Inheritance

The following classes extend Product:

📚 Book

💻 Electronics

👕 Clothing

🧸 Toy

🛒 Grocery

🔹 Polymorphism

Each subclass overrides:

calculateDiscountedPrice()


Each product category has its own discount logic.

🔹 Encapsulation

Product data stored inside objects

Cart managed using ArrayList<CartItem>

Controlled access through constructors and methods

🛒 Features

✔ Multiple product categories
✔ Add to cart
✔ Update quantity
✔ Remove items
✔ Apply extra discount (%)
✔ GST (18%) auto-calculation
✔ Detailed invoice generation
✔ Shipping ID generation
✔ Order status tracking
✔ Expected delivery date

👤 Default Customer Details
Name    : Lokesh
Address : Kautilya Hostel, NIT Patna, Bihta

🧾 Billing System

The checkout process includes:

Subtotal calculation

Discount deduction

GST addition (18%)

Final total amount

Order date

Expected delivery date (5 days)

Shipping ID

Order status

🖥 Sample Output
================= INVOICE =================
Customer: Lokesh
Address : Kautilya Hostel, NIT Patna, Bihta
-------------------------------------------
1. Laptop | Qty: 1 | Unit: 46800 | Line: 46800
-------------------------------------------
Subtotal: 46800
Discount (5%): -2340
GST (18%): +8017.2
-------------------------------------------
TOTAL: 52477.2
-------------------------------------------
Order Date: 15-Feb-2026
Expected Delivery: 20-Feb-2026
Order Status: Shipped
Shipping ID: SHP10452
===========================================

📂 Project Structure
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

▶ How to Run
1️⃣ Compile All Files
javac *.java

2️⃣ Run the Application
java ShopSphereMain

🛠 Technologies Used

Java

OOPS Principles

Java Collections (ArrayList)

Java Time API

Console-based UI

📚 Learning Outcomes

This project helped in understanding:

Real-world OOPS application design

Class hierarchy modeling

Polymorphic behavior

Billing & tax logic implementation

Menu-driven console applications

Modular project structure

🚀 Future Improvements

🔐 User authentication system

💳 Payment gateway integration

🗄 Database connectivity (JDBC + MySQL)

🖥 GUI version using Swing or JavaFX

🛠 Admin dashboard

📦 Order history management

👨‍💻 Author

Lokesh
B.Tech CSE
NIT Patna
