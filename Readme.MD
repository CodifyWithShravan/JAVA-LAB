Java Practical Assignments (Weeks 1-13)

This repository contains a collection of Java programs developed as part of a weekly practical curriculum. Each week focuses on different core concepts of the Java programming language, from basic syntax to advanced features.

Table of Contents

Week 1: Java Fundamentals

Week 2: Object-Oriented Programming (OOP) Basics

Week 3: Nested Classes and Sorting

Week 4: Inheritance and Abstraction

Week 5: Advanced OOP Concepts

Week 6: Exception Handling

Week 8: Packages, User Input, and String Processing

Week 9: File I/O and Serialization

Week 10: Java Collections Framework

Week 11: Multithreading and Concurrency

Week 12: Functional Programming with Lambdas

Week 13: Modern Java - Streams and Optionals

Week 1: Java Fundamentals

1a) StaticDemo.java: Demonstrates the use and execution order of static blocks, static variables, and static methods.

1b) ArrayMinMaxDemo.java: Reads 10 integers into an array from user input and finds the maximum and minimum values.

1c) StringCounterDemo.java: Takes a string input and counts the total number of vowels, consonants, digits, and special characters.

Week 2: Object-Oriented Programming (OOP) Basics

BankAccountDemo.java: Implements a BankAccount class with data members (name, number, balance), constructors (no-argument and parameterized), and methods (createAccount, deposit, withDraw, displayAccountDetails). Uses the this keyword for initialization.

Week 3: Nested Classes and Sorting

3a) InnerClassDemo.java: Defines a class containing both a member inner class and a static nested class, demonstrating how to instantiate and access members of each.

3b) SortingDemo.java: Sorts a given list of names in ascending (alphabetical) order using Collections.sort().

Week 4: Inheritance and Abstraction

4a) InheritanceDemo.java: Implements both single and multilevel inheritance to show how classes can inherit properties and methods.

4b) AbstractClassDemo.java: Uses an abstract class Shape with an abstract method printArea(). This method is implemented by concrete subclasses Rectangle, Triangle, and Circle.

Week 5: Advanced OOP Concepts

5a) SuperAndFinalDemo.java: Demonstrates the use of the super keyword (to access parent class members) and the final keyword (to create constants, prevent method overriding, and prevent inheritance).

5b) InterfaceDemo.java: Implements multiple inheritance using interfaces. A Vehicle interface is created and implemented by Car and Bike classes.

Week 6: Exception Handling

6a) MultipleExceptionDemo.java: A program that demonstrates how to handle multiple types of exceptions (like ArithmeticException and ArrayIndexOutOfBoundsException) using a single try block and multiple catch blocks.

6b) CustomExceptionDemo.java: Defines a custom exception class InvalidAgeException. The main program reads a user's age and throws this exception if the age is less than 18.

Week 8: Packages, User Input, and String Processing

8a) week8/p1/ and week8/p2/: Demonstrates creating and using user-defined packages (p1, p2) and shows the effect of various access modifiers (public, protected, private, default).

8b) week8/EmployeeScannerDemo.java: A simple program to read employee details (like ID, name, salary) from the console using the Scanner class.

8c) week8/StringTokenizerDemo.java: Shows how to use the StringTokenizer class to break a string into individual tokens based on a delimiter.

Week 9: File I/O and Serialization

9a) FileCopyDemo.java: Reads the content of a source file (source.txt) and copies it to a destination file (destination.txt) using FileInputStream and FileOutputStream (byte streams).

9b) SerializationDemo.java: Demonstrates object serialization (writing a Student object to a file) and deserialization (reading the object back from the file).

Week 10: Java Collections Framework

CollectionsDemo.java: A single program demonstrating the core operations for three major collections:

10a) ArrayList: Add, remove, update, and iterate over a list of student names.

10b) HashSet: Add, remove, and search for unique course names.

10c) HashMap: Store and manage student roll numbers (keys) and names (values).

Week 11: Multithreading and Concurrency

11a) BankAccountSimulation.java: Simulates a bank account system where multiple threads attempt to deposit money concurrently. Uses the synchronized keyword to prevent race conditions and ensure thread safety.

11b) ProducerConsumerDemo.java: Implements the classic Producer-Consumer problem using wait() and notify() for inter-thread communication, managing a shared buffer.

Week 12: Functional Programming with Lambdas

LambdaAndFunctionalInterfaceDemo.java: Introduces lambda expressions and demonstrates the use of built-in functional interfaces from java.util.function:

Predicate<T> (for testing conditions)

Function<T, R> (for transforming data)

Consumer<T> (for performing actions)

Supplier<T> (for producing data)

Week 13: Modern Java - Streams and Optionals

13a) StreamApiDemo.java: Demonstrates the functional style of programming using the Stream API. Covers operations like filter, map, reduce, collect, sorted, and forEach.

13b) OptionalAndMethodRefDemo.java: Shows how to use the Optional class to avoid NullPointerExceptions. Also demonstrates the four types of Method References as a shorthand for lambda expressions.