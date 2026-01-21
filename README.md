# SauceDemo TestNG Selenium Automation

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-blue)
![Maven](https://img.shields.io/badge/Maven-Build%20Tool-brightgreen)
![Allure](https://img.shields.io/badge/Allure-Reporting-red)

This project is to automate the login functionality of the SauceDemo web application using multiple test accounts and generates rich test reports with screenshots on failure. Using Java, Selenium WebDriver, TestNG, Data-Driven Testing, Page Object Model (POM), and Allure Reports.

---

## 🔧 Tech Stack

* **Language:** Java 8+
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Test Data:** TestNG DataProvider
* **Reporting:** Allure Report
* **Browser:** Google Chrome

---

## 🌐 Test Application

* **URL:** [https://www.saucedemo.com/](https://www.saucedemo.com/)

---

## ✅ Test Coverage

* Login with valid credentials
* Login with invalid credentials
* Locked-out user validation
* Data-driven testing for multiple user types
* Screenshot capture on test failure

---

## 📊 Reporting (Allure)

This framework integrates Allure Report to provide:

* Pass / Fail status per test
* Step-by-step execution details
* Test severity, epic, and feature tags
* Automatic screenshot attachment on failure

### 📸 Sample Allure Screenshots

> Allure Overview Report.

![Allure-Overview-Report](https://github.com/user-attachments/assets/b28f6eb6-ff0b-4b3e-9611-d0220634f117)

> Project Suites

![Project Suites](https://github.com/user-attachments/assets/48d2bf3d-e4ad-49f5-8589-f1f29d556893)

---


## ▶ How to Run the Tests

### 1️⃣ Prerequisites

* Java 8 or higher installed
* Maven installed
* Google Chrome installed
* Allure Commandline installed

---

### 2️⃣ Execute Tests

```bash
mvn clean test
```

---

### 3️⃣ Generate and View Allure Report

```bash
allure serve allure-results
```

> This will open the Allure report in your default browser.

---

## 🎥 Test Execution Recording (Video)

> Full Video of Test Execution

[saucedemo-testng-selenium-automation.mp4 - Google Drive](https://drive.google.com/file/d/1C4Hb-vW3oic-hc9KYMsQVeYOwHvEWqjC/view?usp=sharing)

