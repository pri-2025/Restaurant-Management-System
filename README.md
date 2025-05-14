# Restaurant-Management-System

This Java-based Restaurant Management System helps streamline the ordering and payment processes for both customers and restaurant staff. Features include a menu with different categories, customer order management, payment processing (Cash, Card, Online), and discount coupons.

## Features:
Manage menu items in different categories (Burgers, Fries, Sides, Drinks, Desserts).
Customers can place orders, view their cart, and apply discount coupons.
Support for various payment methods: Cash, Card, and Online payments.
Generates itemized receipts for orders and payments.
Simple coupon system offering discount percentages.

- **Menu Categories**: 
  - Veg & Non-Veg Burgers
  - Fries
  - Sides (Veg & Non-Veg)
  - Drinks
  - Desserts
  
- **Order Management**:
  - Customers can view and add items to their order.
  - Quantity management for items (updating quantities if the same item is added multiple times).
  - Option to remove or modify items in the cart.

- **Coupon System**:
  - Random coupon assignment for customers with discounts ranging from 10% to 20%.
  
- **Payment Methods**:
  - Cash Payment
  - Card Payment
  - Online Payment
  
- **Order Receipt**: 
  - Customers can view a detailed receipt after placing the order, including applied discounts and payment method.
  - 

## Classes and Their Roles

- **MenuItem**: Represents individual menu items with details like name, number, and price.
- **Order**: Manages the customer's order by allowing items to be added, removed, and modified in the cart.
- **OrderItem**: Represents an item in the order with its quantity and price.
- **Payment (Abstract Class)**: Parent class for different payment methods (Cash, Card, Online). Implements common functionality like applying discounts.
- **CashPayment, CardPayment, OnlinePayment**: Subclasses that handle the specific logic for each payment method.
- **Coupon**: Represents discount coupons with codes and discount percentages.
- **Customer**: Represents a customer with a name and discount percentage, including functionality for assigning random coupons.
- **Bill**: Handles the billing process, including applying discounts and processing payments.

## Technologies Used

- Java (Core)
- Object-Oriented Programming (OOP) Principles
- Collections (ArrayList)


## Acknowledgements

- Inspired by real-world restaurant ordering and payment systems.
- Thanks to all contributors for making this project possible!

---

**Note**: This project is a simulation and can be further improved with a database connection and a GUI for a better user experience.

