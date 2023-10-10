# Bank_Application
Basic_bank_Application
The project described here is a simple console-based banking application that allows users to perform basic banking operations such as creating an account, depositing money, and withdrawing money. Below is a description of the key features and components of this project:

1. **Menu-Driven Interface**: The program presents a menu to the user with three main options:
    - Create an account: This option allows users to create a new bank account. Users are prompted to provide their name, phone number, age, and email address. The system generates a unique account number for the new account.
    - Deposit money: After creating an account, users can choose to deposit money into their account. They are prompted to enter the amount they want to deposit.
    - Withdraw money: Users can also choose to withdraw money from their account, provided they have a sufficient balance. They are prompted to enter the withdrawal amount.

2. **Account Creation**: When the user selects the "Create an account" option, the program collects user information, such as name, phone number, age, and email address. It generates a unique account number for each new account.

3. **Account Operations**: Users can deposit and withdraw money from their accounts. The program keeps track of the account balance and ensures that withdrawals do not exceed the available balance.

4. **Error Handling**: The program provides error handling to ensure that users cannot withdraw more money than they have in their account. It also checks if an account has been created before allowing deposit or withdrawal operations.

5. **Exit Option**: Users have the option to exit the program when they are done with their banking operations.

6. **Data Storage**: In this simplified version, the program does not persistently store account data. Account information is kept in memory only for the duration of the program's execution.

7. **Account Number Generation**: The program generates unique account numbers for each new account created. This can be further enhanced with a more sophisticated account number generation mechanism in a real-world application.

Please note that this is a basic console-based banking application designed for educational purposes. In real-world banking applications, security, data persistence, authentication, and many other features would need to be implemented to ensure the safety and functionality of the system.
