# my-selenium-project
This repository contains a Selenium WebDriver-based Java project which tests the Google search page.

## Prerequisites
Before running the tests, ensure you have the following installed:
 
>- Java (JDK 8 or higher)  <br>
>- Maven (usually comes with python)  <br>
>- IDE - (e.g. Eclipse) <br>
>- ChromeDriver <br>

## Setup

1. **Clone the Repository** <br>
First, clone the repository to your local machine: <br> 
    ```
    git clone https://github.com/sefaliadhikari11/my-selenium-project.git
    git checkout master
  
    ```

2. **Navigate to project directory** <br>
    ```
    cd my-selenium-project
  
    ```

3. **Install Dependencies** <br>
The project uses Maven to manage dependencies. The necessary dependencies for Selenium and WebDriverManager are included in the pom.xml file.
Run the following Maven command to download all the dependencies:
    ```
    mvn clean install
  
    ```

## Running the Project

1. **Open the Project in IDE** <br>
Open the project in Java IDE (e.g. Eclipse) <br>


2. **Run the Test** <br>

  The test files are located in the src/test/java directory. To run the tests:
  In Eclipse, right-click on the test class and select Run As-> Maven Test.

  Alternatively, you can run the tests using Maven from the command line:
  


    ```
    mvn test
    
    ```

## Project Structure
- `src/test/java`: Contains your test code.
- `pom.xml`: Contains project dependencies and configuration for Maven.
- `README.md`: This file, providing instructions for setup and usage.









