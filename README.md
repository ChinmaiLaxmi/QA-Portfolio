# QA Portfolio

This repository showcases my work as a **Quality Assurance Engineer**, covering manual testing, automation testing, and API testing.

## 📂 Project Structure
```
QA-Portfolio/
├── manual-testing/         → Test plans, test cases, and bug reports
├── automation-scripts/     → Selenium + TestNG automation scripts
├── api-testing/            → Postman API test collection
└── README.md               → Project overview
```

## 🔹 Manual Testing
- Test plan and test cases documented (`manual-testing/Test_Plan_and_Cases.docx`)
- Bug reports with detailed reproduction steps (`manual-testing/Bug_Reports.docx`)

## 🔹 Automation Testing (Selenium + TestNG)
- Scripts available under `automation-scripts/`
- Tech stack: **Java + Selenium + TestNG + Maven**
- Example: `LoginTest.java` – Automated login functionality validation

### ▶️ How to Run Automation Tests
1. Install **Java (JDK 11 or above)** and **Maven**.
2. Navigate to the project folder:
   ```sh
   cd automation-scripts
   mvn clean test
   ```
3. Reports will be generated under the `target/` folder.

## 🔹 API Testing (Postman)
- Postman Collection: `api-testing/Sample_API_Tests.postman_collection.json`
- Covers:
  - Login API (POST /login)
  - Get Users API (GET /users?page=2)
  - Create User API (POST /users)

### ▶️ How to Run API Tests
1. Open **Postman**.
2. Import the collection (`api-testing/Sample_API_Tests.postman_collection.json`).
3. Run using **Collection Runner**.

## 🛠️ Tools & Technologies
- **Manual Testing:** Test Plans, Test Cases, Bug Reports
- **Automation:** Java, Selenium, TestNG, Maven
- **API Testing:** Postman, JSON
