🛍 ShopSphere
A Console-Based E-Commerce Product Catalog System (Java OOPS Project)
📌 Project Description

ShopSphere is a menu-driven, console-based e-commerce application developed using Java to demonstrate core Object-Oriented Programming (OOPS) principles in a real-world scenario.

The system allows users to browse product categories, add items to a shopping cart, manage quantities, apply discounts, calculate GST, and generate a detailed tax invoice with shipping information.

This project simulates the working of a basic online shopping platform.

🎯 Objectives

To implement real-world OOPS concepts in Java

To design a modular and scalable application

To simulate cart management and billing logic

To demonstrate abstraction, inheritance, and polymorphism practically

🧠 OOPS Concepts Implemented
🔹 1. Abstraction

Product is an abstract class.

Defines common structure for all products.

Abstract methods:

calculateDiscountedPrice()

displayDetails()

🔹 2. Inheritance

Specialized product classes extend Product:

Book

Electronics

Clothing

Toy

Grocery

Each subclass has its own unique attribute and discount logic.

🔹 3. Polymorphism

Each subclass overrides:

calculateDiscountedPrice()


Example:

Books → 15% discount

Electronics → 10% discount

Clothing → 20% discount

Toys → 12% discount

Groceries → 5% discount

🔹 4. Encapsulation

Data stored within objects

Controlled via constructors and methods

Cart items stored using ArrayList<CartItem>

🛒 Features

✔ Multiple Product Categories
✔ Add to Cart
✔ Update Quantity
✔ Remove Items
✔ Apply Additional Discount (%)
✔ GST (18%) Calculation
✔ Shipping ID Generation
✔ Order Status Tracking
✔ Expected Delivery Date
✔ Detailed Tax Invoice
✔ Default Customer Details

🏬 Product Categories

📚 Books

💻 Electronics

👕 Clothing

🧸 Toys

🛒 Groceries

🧾 Billing System

The checkout system calculates:

Subtotal

Discount Amount

GST (18%)

Final Payable Amount

Shipping ID

Order Date

Expected Delivery (5 Days)

Order Status

👤 Default Customer Details
Name    : Lokesh
Address : Kautilya Hostel, NIT Patna, Bihta

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

🔄 Application Workflow

Display product categories

User selects category

Products displayed with details

User selects product & quantity

Item added to cart

User can:

View cart

Remove item

Update quantity

Checkout

Apply additional discount

Invoice generated

Order confirmed

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
-------------------------------------------
TOTAL: 950.608
-------------------------------------------
Order Date: 15-Feb-2026
Expected Delivery: 20-Feb-2026
Order Status: Shipped
Shipping ID: SHP10245
===========================================

🛠 Technologies Used

Java

OOPS Concepts

Java Collections Framework (ArrayList)

Java Time API

Console-based UI

▶ How to Run the Project
Step 1: Compile all files
javac *.java

Step 2: Run the main class
java ShopSphereMain

📈 Learning Outcomes

By completing this project, you gain:

Strong understanding of OOPS concepts

Experience building modular Java applications

Knowledge of cart and billing logic

Understanding of real-world product hierarchy

Practice with Java collections and time API

🚀 Future Enhancements

Database integration (MySQL / JDBC)

Login & Authentication system

Payment gateway simulation

GUI version using Swing or JavaFX

Admin panel for product management

Order history system

👨‍💻 Author

Lokesh
B.Tech CSE
