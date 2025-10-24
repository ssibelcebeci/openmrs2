<h1 align="center">OpenMRS.org Project - Test Automation</h1>

This project is a test automation suite for the [OpenMRS](https://o2.openmrs.org/) platform. Its purpose is to validate critical user stories and ensure system stability.

---

## 🎯 Test Scope (User Stories)

This framework tests the critical workflows for two primary user roles: Doctor and General User.

### 👤 User Scenarios
* Successful and failed **Login** attempts.
* Secure **Logout** process.
* New **Patient Registration**.
* Quick access to **Account Settings**.
* Verification of appointment errors for incorrect timezones.

### 🩺 Doctor Scenarios
* **Listing** all patients.
* **Searching** for a patient (by Name or ID).
* **Merging** two separate patient records.
* **Deleting** a patient record.

---

## 🛠️ Tech Stack & Tools

* **Language:** Java
* **Automation:** Selenium WebDriver
* **Test Framework:** TestNG (with parallel execution support)
* **Design Pattern:** Page Object Model (POM)
* **Build Tool:** Maven
* **Configuration:** Dynamic data management via `configuration.properties`

---

## 🚀 How to Run

```bash
# Clone the repository
git clone [(https://github.com/ssibelcebeci/openmrs2.git)]


# Install dependencies
mvn clean install
