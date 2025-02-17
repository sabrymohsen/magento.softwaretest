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

