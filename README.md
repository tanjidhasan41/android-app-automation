# Android App Automation: Calculator App
## Project Description
This project demonstrates the automation of a calculator app using test methods to perform a series of mathematical operations. The goal is to validate the correctness of the calculator's functionality by automating various calculation scenarios. The tests are written in Java and utilize a CSV file to input complex mathematical series for verification.

## Prerequisites
Before running the tests, ensure you have the following:

- Java Development Kit (JDK) (Version 8 or later)
- Android Studio (Latest version recommended)
- Appium for Android app automation
- A physical or virtual Android device with the calculator app installed
- Maven/Gradle for dependency management

## What I Have Done
**Automated Series Calculation:**

- Implemented a function to pass a series as a parameter and validate the result using assertions.
- Example series: ```100/10*5-10+60```
- The series is parsed and tested step-by-step in the calculator app.

**CSV-Based Testing:**

- Developed a function to read a series of mathematical expressions from a CSV file.
- Used assertions to verify the correctness of results.
- Example data (from ```data.csv```):

```50+40-30/2+20 // assert 95```
```10*2/2+10-20 // assert 0```
```4pi2^3 // assert 100.53```

**Validation:**

- Ensured accurate parsing of operations, including division, multiplication, and constants like π.
- Added test cases to cover edge cases and non-standard inputs.

## How to Run the Tests
- Clone the repository:
- Install dependencies (via Maven/Gradle):
- Prepare the environment:
  - Ensure the Android device (physical or virtual) is connected.
  - Start Appium server.
- Execute the tests:
  - Run the parameterized test using a series:
  - Run the CSV-based test:
- View results:
  - Test results will be available in the console or generated as a report (depending on the test framework).

## Allure Report

![image](https://github.com/user-attachments/assets/c8998ae1-09bf-46b4-bc68-9e1d5168d2aa)

![image](https://github.com/user-attachments/assets/92902d20-5791-4fe6-8c38-ad31483f1d6f)

## Project Sample Video

https://github.com/user-attachments/assets/3cb0e506-2cbb-455e-b6f4-75dadca11008




