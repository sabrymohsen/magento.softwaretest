<<<<<<< HEAD
E-Commerce Web Application - Test Automation Project

Project Overview

This project automates the testing of an e-commerce web application using Katalon Studio. The test suite includes test cases to verify user registration, login, product selection, cart operations, and checkout functionality.

Technology Stack

Automation Tool: Katalon Studio

Programming Language: Groovy (Katalon Script)

Test Execution: Web-based UI Testing

Test Data: Dynamic test data generation for email registration

Testing Scenarios

Scenario 1 [P1] - User Registration & Login

Objective: Verify that a guest user can successfully register a new account and log in.

Test Steps:

Open the application home page.

Navigate to the Create an Account page.

Enter first name, last name, email (randomized), password, and confirm password.

Submit the registration form.

Verify successful account creation.

Log out and log in using the registered email and password.

Verify successful login.

Expected Result: The user should be able to register and log in without errors.

Scenario 2 [P1] - Add Product to Cart

Objective: Verify that a user can log in, browse the Men's Jackets category, and add a product to the cart.

Test Steps:

Log in with a registered account.

Navigate to Men’s Category > Jackets.

Select the second jacket in the list.

Add the item to the shopping cart.

Expected Result: The product should be successfully added to the cart.

Scenario 3 [P2] - Checkout Order

Objective: Verify that a user can navigate to their cart and complete the checkout process.

Test Steps:

Log in to the application.

Navigate to the shopping cart.

Proceed to checkout.

Enter shipping and payment details.

Confirm and place the order.

Expected Result: The order should be successfully placed, and a confirmation message should be displayed.

Scenario 4 [P3] - Search and Validate Products

Objective: Verify that searching for "Nike" returns valid results.

Test Steps:

Log in to the application.

Enter "Nike" in the search bar and submit.

Validate if search results contain relevant Nike products.

Expected Result: The search should return Nike-related products.

Execution Strategy

Priority-Based Execution: Tests are categorized by priority (P1 > P2 > P3).

Automation Run Frequency:

P1: Run in every build

P2: Run in regression cycles

P3: Run in full regression cycles

Failure Handling: Failed test cases will be logged but not re-run automatically.

How to Run the Tests

Clone the Repository

git clone https://github.com/your-repo.git
cd your-project-folder

Open in Katalon Studio

Run Individual Test Cases

Open a test case from Test Cases folder.

Click Run to execute.

Run the Test Suite

Open the Test Suites folder.

Run the test suite to execute all test cases.

=======
# E-Commerce Web Application - Test Automation Project

## Project Overview
This project automates the testing of an e-commerce web application using **Katalon Studio**. The test suite includes test cases to verify user registration, login, product selection, cart operations, and checkout functionality.

## Technology Stack
- **Automation Tool**: Katalon Studio
- **Programming Language**: Groovy (Katalon Script)
- **Test Execution**: Web-based UI Testing
- **Test Data**: Dynamic test data generation for email registration

---

## Testing Scenarios
### Scenario 1 [P1] - User Registration & Login
**Objective**: Verify that a guest user can successfully register a new account and log in.

**Test Steps:**
1. Open the application home page.
2. Navigate to the **Create an Account** page.
3. Enter first name, last name, email (randomized), password, and confirm password.
4. Submit the registration form.
5. Verify successful account creation.
6. Log out and log in using the registered email and password.
7. Verify successful login.

**Expected Result**: The user should be able to register and log in without errors.

---

### Scenario 2 [P1] - Add Product to Cart
**Objective**: Verify that a user can log in, browse the **Men's Jackets** category, and add a product to the cart.

**Test Steps:**
1. Log in with a registered account.
2. Navigate to **Men’s Category > Jackets**.
3. Select the **second** jacket in the list.
4. Add the item to the shopping cart.

**Expected Result**: The product should be successfully added to the cart.

---

### Scenario 3 [P2] - Checkout Order
**Objective**: Verify that a user can navigate to their cart and complete the checkout process.

**Test Steps:**
1. Log in to the application.
2. Navigate to the shopping cart.
3. Proceed to checkout.
4. Enter shipping and payment details.
5. Confirm and place the order.

**Expected Result**: The order should be successfully placed, and a confirmation message should be displayed.

---

### Scenario 4 [P3] - Search and Validate Products
**Objective**: Verify that searching for **"Nike"** returns valid results.

**Test Steps:**
1. Log in to the application.
2. Enter "Nike" in the search bar and submit.
3. Validate if search results contain relevant Nike products.

**Expected Result**: The search should return Nike-related products.

---

## Execution Strategy
- **Priority-Based Execution**: Tests are categorized by priority (P1 > P2 > P3).
- **Automation Run Frequency**: 
  - P1: Run in every build
  - P2: Run in regression cycles
  - P3: Run in full regression cycles
- **Failure Handling**: Failed test cases will be logged but not re-run automatically.

---

## How to Run the Tests
1. **Clone the Repository**
   ```sh
   git clone https://github.com/sabrymohsen/magento.softwaretest.git
   cd your-project-folder
   ```
2. **Open in Katalon Studio**
3. **Run Individual Test Cases**
   - Open a test case from **Test Cases** folder.
   - Click **Run** to execute.
4. **Run the Test Suite**
   - Open the **Test Suites** folder.
   - Run the test suite to execute all test cases.

---

## Reporting & Logging
- Test results and logs will be stored in the **Reports** section of Katalon Studio.
- Logs will capture failed test cases for debugging.
- Use Katalon’s **TestOps** for real-time reporting and analytics.

---
>>>>>>> 2132393 (Initial commit - Pushing full project)
