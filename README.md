# CoffeeMachineApp-JavaDeveloper
☕ Coffee Machine App
📌 Project Description

This Java project simulates a coffee machine application where users can order different types of coffee such as Espresso and Latte. It demonstrates object-oriented programming (OOP) principles including inheritance, constructors, encapsulation, and polymorphism.

The app allows users to:

Select a coffee type from a menu.

Customize their coffee (e.g., roast level, number of shots, milk type, syrup flavor).

View details about their order.

Automatically calculate the caffeine level and total bill based on the order.

🛠️ Classes Overview

Coffee (Superclass)

Common attributes: name, roast, CafeinLevelInMg, price

Methods:

setCaffeineLevel() → Determines caffeine content based on roast type

grindBeans() and brewCoffee() → Simulate coffee preparation

printInfo() → Displays coffee details

Espersso (Subclass of Coffee)

Adds numberOfShots attribute

Method: printEspressoDetails() → Displays shot count, cost per shot, and total bill

Latte (Subclass of Coffee)

Adds attributes: milkType, syrupFlavor

Method: printLatteDetails() → Displays latte’s milk type, syrup flavor, roast, and cost

CoffeeMachine (Main Class)

Provides a menu-driven interface for users

Handles input, creates appropriate coffee objects, and calls their methods

Tracks and displays the running total price

🚀 Key Concepts Practiced

Inheritance & Polymorphism → Espersso and Latte extend Coffee

Constructors & super() → Passing shared attributes to the superclass

Encapsulation of behavior → Each class handles its own details

User interaction → Console-based menu using Scanner
