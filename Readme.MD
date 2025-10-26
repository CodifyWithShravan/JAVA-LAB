Java Practical Assignments (Weeks 1-13)

This repository contains a collection of Java programs developed as part of a weekly practical curriculum. Each week focuses on different core concepts of the Java programming language, from basic syntax to advanced features.

🚀 How to Run These Programs

Prerequisites

You must have a Java Development Kit (JDK) installed on your system (e.g., JDK 11 or newer).

General Instructions

Clone this repository to your local machine.

Navigate to the directory of the program you want to run.

Compile the .java file using javac:

javac FileName.java


Run the compiled .class file using java:

java FileName


(Note: Do not add .class to the run command)

Special Instructions

Week 8 (Packages): To run the package demo, you must be in the parent directory (e.g., the root of this project).

Compile both files from the root:

javac week8/p1/AccessDemo.java week8/p2/PackageTest.java


Run the main file using its fully qualified name (with a dot, not a slash):

java week8.p2.PackageTest


📚 Weekly Assignments

📅 Week 1: Java Fundamentals

StaticDemo.java: Demonstrates the use and execution order of static blocks, static variables, and static methods.

ArrayMinMaxDemo.java: Reads 10 integers into an array from user input and finds the maximum and minimum values.

StringCounterDemo.java: Takes a string input and counts the total number of vowels, consonants, digits, and special characters.

🏦 Week 2: Object-Oriented Programming (OOP) Basics

BankAccountDemo.java: Implements a BankAccount class with data members (name, number, balance), constructors (no-argument and parameterized), and methods (createAccount, deposit, withDraw, displayAccountDetails). Uses the this keyword for initialization.

🧩 Week 3: Nested Classes and Sorting

InnerClassDemo.java: Defines a class containing both a member inner class and a static nested class, demonstrating how to instantiate and access members of each.

SortingDemo.java: Sorts a given list of names in ascending (alphabetical) order using Collections.sort().

🏛️ Week 4: Inheritance and Abstraction

InheritanceDemo.java: Implements both single and multilevel inheritance to show how classes can inherit properties and methods.

AbstractClassDemo.java: Uses an abstract class Shape with an abstract method printArea(). This method is implemented by concrete subclasses Rectangle, Triangle, and Circle.

🔑 Week 5: Advanced OOP Concepts

SuperAndFinalDemo.java: Demonstrates the use of the super keyword (to access parent class members) and the final keyword (to create constants, prevent method overriding, and prevent inheritance).

InterfaceDemo.java: Implements multiple inheritance using interfaces. A Vehicle interface is created and implemented by Car and Bike classes.

⚠️ Week 6: Exception Handling

MultipleExceptionDemo.java: A program that demonstrates how to handle multiple types of exceptions (like ArithmeticException and ArrayIndexOutOfBoundsException) using a single try block and multiple catch blocks.

CustomExceptionDemo.java: Defines a custom exception class InvalidAgeException. The main program reads a user's age and throws this exception if the age is less than 18.

📦 Week 8: Packages, User Input, and String Processing

week8/p1/ and week8/p2/: Demonstrates creating and using user-defined packages (p1, p2) and shows the effect of various access modifiers (public, protected, private, default).

week8/EmployeeScannerDemo.java: A simple program to read employee details (like ID, name, salary) from the console using the Scanner class.

week8/StringTokenizerDemo.java: Shows how to use the StringTokenizer class to break a string into individual tokens based on a delimiter.

💾 Week 9: File I/O and Serialization

FileCopyDemo.java: Reads the content of a source file (source.txt) and copies it to a destination file (destination.txt) using FileInputStream and FileOutputStream (byte streams).

SerializationDemo.java: Demonstrates object serialization (writing a Student object to a file) and deserialization (reading the object back from the file).

🗂️ Week 10: Java Collections Framework

CollectionsDemo.java: A single program demonstrating the core operations for three major collections:

ArrayList: Add, remove, update, and iterate over a list of student names.

HashSet: Add, remove, and search for unique course names.

HashMap: Store and manage student roll numbers (keys) and names (values).

🧵 Week 11: Multithreading and Concurrency

BankAccountSimulation.java: Simulates a bank account system where multiple threads attempt to deposit money concurrently. Uses the synchronized keyword to prevent race conditions and ensure thread safety.

ProducerConsumerDemo.java: Implements the classic Producer-Consumer problem using wait() and notify() for inter-thread communication, managing a shared buffer.

lambda Week 12: Functional Programming with Lambdas

LambdaAndFunctionalInterfaceDemo.java: Introduces lambda expressions and demonstrates the use of built-in functional interfaces from java.util.function:

Predicate<T> (for testing conditions)

Function<T, R> (for transforming data)

Consumer<T> (for performing actions)

Supplier<T> (for producing data)

✨ Week 13: Modern Java - Streams and Optionals

StreamApiDemo.java: Demonstrates the functional style of programming using the Stream API. Covers operations like filter, map, reduce, collect, sorted, and forEach.

OptionalAndMethodRefDemo.java: Shows how to use the Optional class to avoid NullPointerExceptions. Also demonstrates the four types of Method References as a shorthand for lambda expressions.