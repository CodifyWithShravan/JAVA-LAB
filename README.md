# Java Lab Programs

This repository contains comprehensive Java programs for 6 weeks of lab exercises, covering fundamental to advanced Java concepts.

## Project Structure

```
JAVA(LAB)/
├── Week1/
│   ├── StaticDemo.java                    # Static blocks, variables, and methods
│   ├── ArrayMinMax.java                   # Array operations - find min/max
│   └── StringCharacterCounter.java        # Character counting in strings
├── Week2/
│   └── BankAccountDemo.java              # Bank account with constructors and 'this'
├── Week3/
│   ├── InnerClassDemo.java               # Inner classes and nested classes
│   └── NameSorter.java                   # Sorting names in ascending order
├── Week4/
│   ├── InheritanceDemo.java              # Single and multi-level inheritance
│   └── AbstractShapeDemo.java            # Abstract classes and methods
├── Week5/
│   ├── SuperFinalDemo.java               # super and final keywords
│   └── MultipleInheritanceDemo.java      # Multiple inheritance using interfaces
├── Week6/
│   ├── MultipleExceptionDemo.java        # Multiple exception handling
│   └── CustomExceptionDemo.java          # Custom exception implementation
└── README.md                             # This file
```

## Week-wise Program Descriptions

### Week 1: Java Fundamentals

#### 1a) Static Demonstration (`StaticDemo.java`)
- **Features:** Static blocks, static variables, static methods
- **Demonstrates:** 
  - Static block execution order
  - Static variable initialization and sharing
  - Static vs instance method access
  - Memory management concepts

#### 1b) Array Min/Max Finder (`ArrayMinMax.java`)
- **Features:** Array operations, user input handling
- **Demonstrates:** 
  - Array creation and manipulation
  - Finding minimum and maximum values
  - User input validation
  - Array traversal techniques

#### 1c) String Character Counter (`StringCharacterCounter.java`)
- **Features:** String analysis and character categorization
- **Demonstrates:** 
  - Character classification (vowels, consonants, digits, special chars)
  - String manipulation methods
  - Loop constructs and conditional logic
  - Detailed character breakdown

### Week 2: Object-Oriented Programming Basics

#### Bank Account System (`BankAccountDemo.java`)
- **Features:** Complete banking system simulation
- **Demonstrates:** 
  - No-argument and parameterized constructors
  - `this` keyword usage for parameter disambiguation
  - Encapsulation with private fields
  - Method implementation (deposit, withdraw, display)
  - Interactive menu system

### Week 3: Advanced OOP Concepts

#### 3a) Inner Classes Demo (`InnerClassDemo.java`)
- **Features:** All types of inner classes
- **Demonstrates:** 
  - Member inner class creation and usage
  - Static nested class implementation
  - Local inner class examples
  - Access modifiers and scope rules
  - Outer class interaction

#### 3b) Name Sorter (`NameSorter.java`)
- **Features:** Multiple sorting algorithms
- **Demonstrates:** 
  - Bubble sort implementation
  - Selection sort implementation
  - Built-in Arrays.sort() usage
  - Performance comparison
  - Case-insensitive sorting

### Week 4: Inheritance

#### 4a) Inheritance Demo (`InheritanceDemo.java`)
- **Features:** Complete inheritance hierarchy
- **Demonstrates:** 
  - Single inheritance (Animal -> Mammal, Animal -> Bird)
  - Multi-level inheritance (Animal -> Mammal -> Dog, Animal -> Bird -> Eagle)
  - Method overriding and polymorphism
  - Constructor chaining
  - Access modifier inheritance

#### 4b) Abstract Shape System (`AbstractShapeDemo.java`)
- **Features:** Abstract class implementation with geometric shapes
- **Demonstrates:** 
  - Abstract class definition
  - Abstract method implementation
  - Concrete method inheritance
  - Polymorphism with abstract references
  - Shape area calculations (Rectangle, Triangle, Circle, Square)

### Week 5: Advanced Inheritance Concepts

#### 5a) Super and Final Demo (`SuperFinalDemo.java`)
- **Features:** Comprehensive super and final keyword usage
- **Demonstrates:** 
  - `super()` constructor chaining
  - `super.method()` and `super.variable` access
  - Final variables (immutable after initialization)
  - Final methods (cannot be overridden)
  - Final classes (cannot be extended)
  - Static final constants

#### 5b) Multiple Inheritance with Interfaces (`MultipleInheritanceDemo.java`)
- **Features:** Multiple interface implementation
- **Demonstrates:** 
  - Interface definition and implementation
  - Multiple interface inheritance
  - Default and static methods in interfaces (Java 8+)
  - Polymorphism with interface references
  - Real-world Vehicle, Car, and Bike simulation

### Week 6: Exception Handling

#### 6a) Multiple Exception Handling (`MultipleExceptionDemo.java`)
- **Features:** Comprehensive exception handling
- **Demonstrates:** 
  - Multiple catch blocks
  - Nested try-catch structures
  - Exception propagation
  - Finally block usage
  - Common exceptions (ArithmeticException, ArrayIndexOutOfBoundsException, etc.)

#### 6b) Custom Exception (`CustomExceptionDemo.java`)
- **Features:** Custom exception implementation
- **Demonstrates:** 
  - Custom exception class creation
  - Exception constructors and methods
  - Exception chaining
  - Multiple custom exceptions
  - User registration system with validation

## How to Run the Programs

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command line

### Running Individual Programs

1. **Using Command Line:**
   ```bash
   # Navigate to the specific week folder
   cd Week1
   
   # Compile the Java file
   javac StaticDemo.java
   
   # Run the compiled program
   java StaticDemo
   ```

2. **Using VS Code:**
   - Open the specific `.java` file
   - Click the "Run" button that appears above the `main` method
   - Or use `Ctrl+F5` to run without debugging

### Running All Programs

Each program is designed to be self-contained and can be run independently. They include:
- Interactive user input where appropriate
- Comprehensive demonstrations of concepts
- Detailed output explanations
- Error handling and validation

## Program Features

### Interactive Elements
- User input handling with validation
- Menu-driven interfaces
- Error recovery and retry mechanisms
- Real-time demonstrations

### Educational Features
- Comprehensive comments explaining concepts
- Step-by-step execution traces
- Multiple examples for each concept
- Best practices demonstrations

### Advanced Features
- Exception handling throughout
- Performance comparisons
- Memory usage demonstrations
- Polymorphism examples

## Learning Outcomes

After running these programs, you will understand:

1. **Java Fundamentals**: Static concepts, arrays, strings
2. **OOP Basics**: Classes, objects, constructors, encapsulation
3. **Advanced OOP**: Inheritance, polymorphism, abstract classes
4. **Exception Handling**: Built-in and custom exceptions
5. **Interface Programming**: Multiple inheritance simulation
6. **Best Practices**: Code organization, error handling, user interaction

## Notes

- All programs include extensive comments for learning
- Input validation is implemented where user input is required
- Programs demonstrate both theoretical concepts and practical applications
- Each program can be extended with additional features for further learning

## Troubleshooting

If you encounter compilation errors about package declarations, you can:
1. Remove the package-related error messages (they're lint warnings)
2. Or organize the files in proper package structure if needed
3. The programs will run correctly regardless of these warnings

## Author

These programs are designed for Java learning and lab practice, covering essential Java programming concepts from basics to advanced topics.
