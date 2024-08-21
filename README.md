![Java](https://img.shields.io/badge/Java-22-007396?style=for-the-badge&logo=java)
![JUnit](https://img.shields.io/badge/JUnit-5.0-25A162?style=for-the-badge&logo=junit5)

#   Stack Data Structure

## Overview

This project implements a generic Stack data structure in Java. It includes basic stack operations such as push, pop, peek, and search, along with unit tests to ensure correctness.

### Interface Documentation

The `Stack<T>` interface defines the basic operations of a stack data structure, including methods for pushing, popping, peeking, checking if the stack is empty, and searching for elements.

 1. `boolean isEmpty()`

- **Brief:** Checks if the stack is empty.
- **Description:** This method determines whether the stack contains any elements.
- **Returns:** 
  - `true` if the stack is empty.
  - `false` if the stack contains one or more elements.

2. `T peek()`

- **Brief:** Returns the top element of the stack without removing it.
- **Description:** This method allows the caller to view the element at the top of the stack without modifying the stack.
- **Returns:** The top element of the stack.
- **Throws:** `RuntimeException` if the stack is empty.

3. `T pop()`

- **Brief:** Removes and returns the top element of the stack.
- **Description:** This method removes the top element from the stack and returns it.
- **Returns:** The top element of the stack.
- **Throws:** `RuntimeException` if the stack is empty.

4. `T push(T item)`

- **Brief:** Pushes an item onto the top of the stack.
- **Description:** This method adds an item to the top of the stack.
- **Parameters:** 
  - `item`: The item to be pushed onto the stack.
- **Returns:** The item argument that was pushed onto the stack.

5. `int search(T e)`

- **Brief:** Searches for an element in the stack.
- **Description:** This method searches the stack for a specific element and returns its 1-based position from the top of the stack. If the element is not found, the method returns `-1`.
- **Parameters:** 
  - `e`: The element to search for.
- **Returns:** 
  - The 1-based position of the element from the top of the stack.
  - `-1` if the element is not found.

6. `int size()`

- **Description:** Returns the current number of elements in the stack.
- **Returns:** The number of elements in the stack.

7. `int capacity()`

- **Description:** Returns the total capacity of the stack.
- **Returns:** The maximum number of elements the stack can hold.

8. `boolean isFull()`

- **Description:** Checks if the stack is full.
- **Returns:** `true` if the stack has reached its maximum capacity; `false` otherwise.



## Prerequisites

Before you begin, ensure you have the following software installed:

- **Java Development Kit (JDK)**: Version 8 or higher.
  - You can check if Java is installed by running:
    ```bash
    java -version
    ```
- **Maven**: Apache Maven is required to build and manage the project.

## Installing Maven

If Maven is not already installed, follow these steps to install it:

1. **Download Maven**:
   - Go to the [Apache Maven download page](https://maven.apache.org/download.cgi) and download the binary archive for your operating system.

2. **Extract the Archive**:
   - Extract the downloaded archive to a directory of your choice, e.g., `/opt/maven`.

3. **Set Up Environment Variables**:
   - Add Maven's `bin` directory to your `PATH` environment variable.
   - On Linux/MacOS, you can add the following lines to your `~/.bashrc` or `~/.zshrc` file:
     ```bash
     export M2_HOME=/path/to/maven
     export PATH=$M2_HOME/bin:$PATH
     ```
   - On Windows, you can add the `bin` directory to the `Path` environment variable through the System Properties dialog.

4. **Verify Installation**:
   - Run the following command to verify that Maven is installed correctly:
     ```bash
     mvn -version
     ```

## Project Setup

1. **Clone the Repository**:
   - Clone the project repository to your local machine:
     ```bash
     git clone https://github.com/WildandArt/stack.git
     ```
   - Navigate to the project directory:
     ```bash
     cd stack
     ```

2. **Build the Project**:
   - Run the following command to compile the project and download dependencies:
     ```bash
     mvn clean install
     ```

3. **Run the Project**:
   - To run the project, ensure that you have a `main` class or executable JAR file. Since this is a library, there may not be a `main` method by default.
   - If you have a main method, you can run the application as follows:
     ```bash
     mvn exec:java -Dexec.mainClass="com.stack.project.MainClass"
     ```
   - Replace `"com.stack.project.MainClass"` with the actual class containing the `main` method.

## Running Tests

Unit tests are included to verify the functionality of the stack implementation. To run the tests, use the following Maven command:

```bash
mvn test
```
