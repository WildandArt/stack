# Stack Project
<!-- 
## Overview

This project implements a generic Stack data structure in Java. It includes basic stack operations such as push, pop, peek, and search, along with unit tests to ensure correctness.

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
     git clone https://github.com/your-username/stack-project.git
     ```
   - Navigate to the project directory:
     ```bash
     cd stack-project
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
mvn test -->
