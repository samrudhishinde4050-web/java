# 📘 JDBC DAO Pattern, Transactions & Batch Processing

This folder contains Java JDBC examples demonstrating the **DAO Pattern, database transactions, and batch processing** using MySQL.

## 📂 Folder Structure

```text
31-JDBC-DAO-Transactions/
│
├── README.md
├── Student.java
├── DBConnection.java
├── StudentDAO.java
├── StudentDAOExample.java
├── TransactionExample.java
├── BatchInsertExample.java
├── CommitRollbackExample.java
├── InterviewQuestions.md
└── PracticePrograms.md
```

## 📚 Topics Covered

- JDBC DAO Pattern
- Model Classes
- Database Connection Management
- PreparedStatement
- CRUD Operations
- JDBC Transactions
- Commit and Rollback
- Batch Processing
- Exception Handling
- Try-with-resources

## 🔹 What is the DAO Pattern?

**DAO (Data Access Object)** is a design pattern that separates database access logic from the application's business logic.

It makes code easier to maintain, reuse, test, and organize.

### DAO Architecture

```text
Application
     ↓
  StudentDAO
     ↓
 PreparedStatement
     ↓
     JDBC
     ↓
  MySQL Database
```

## 🔹 What is a Model Class?

A model class represents the data handled by an application.

Example: `Student.java`

```java
public class Student {
    private int id;
    private String name;
    private int age;
    private String city;
}
```

## 🔹 What is a Database Connection Class?

`DBConnection.java` provides a reusable method to connect to MySQL.

```java
Connection connection = DBConnection.getConnection();
```

This avoids repeating the connection configuration throughout the application.

## 🔹 What is a Transaction?

A transaction groups multiple database operations into one logical unit of work.

A transaction should follow the **ACID principles**:

- **Atomicity:** All operations succeed together, or none do.
- **Consistency:** Data remains valid according to database rules.
- **Isolation:** Concurrent transactions are controlled according to the isolation level.
- **Durability:** Committed changes persist according to database guarantees.

### Important Transaction Methods

| Method | Purpose |
|---|---|
| `setAutoCommit(false)` | Disable automatic commits |
| `commit()` | Save transaction changes |
| `rollback()` | Undo uncommitted changes |

### Transaction Flow

```text
Start Transaction
       ↓
Execute SQL Operations
       ↓
 All Successful?
    ↙       ↘
  Yes        No
   ↓          ↓
 commit()  rollback()
```

## 🔹 What is Batch Processing?

Batch processing lets you group multiple SQL operations and execute them together.

It can reduce database communication overhead when inserting or updating many records.

### Important Methods

| Method | Purpose |
|---|---|
| `addBatch()` | Add an operation to the batch |
| `executeBatch()` | Execute queued operations |
| `clearBatch()` | Clear queued operations |

## 📁 Java Files

| File | Description |
|---|---|
| `Student.java` | Represents student data |
| `DBConnection.java` | Creates a reusable JDBC connection |
| `StudentDAO.java` | Contains student database operations |
| `StudentDAOExample.java` | Demonstrates DAO usage |
| `TransactionExample.java` | Demonstrates a transaction |
| `BatchInsertExample.java` | Inserts multiple records using batch processing |
| `CommitRollbackExample.java` | Demonstrates commit and rollback |
| `InterviewQuestions.md` | JDBC interview questions |
| `PracticePrograms.md` | Additional exercises |

## 🔹 Try-with-resources

Java's try-with-resources statement automatically closes supported resources, including JDBC connections, statements, and result sets.

Example:

```java
try (Connection connection = DBConnection.getConnection()) {
    System.out.println("Database connected successfully!");
}
```

## 🗄️ MySQL Database Setup

Create the database and table:

```sql
CREATE DATABASE IF NOT EXISTS studentdb;

USE studentdb;

CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    city VARCHAR(50)
);
```

Configure the correct MySQL username, password, and JDBC driver in your project.

## ▶️ Compile and Run

Compile all Java files:

```bash
javac *.java
```

Run the DAO example:

```bash
java StudentDAOExample
```

Run the transaction example:

```bash
java TransactionExample
```

Run the batch example:

```bash
java BatchInsertExample
```

Ensure that the MySQL JDBC driver is available on your classpath.

## 🎯 Learning Outcomes

After completing this folder, you will understand:

- How to organize JDBC code using the DAO Pattern
- How to separate model and database-access responsibilities
- How transactions work
- How to commit and roll back changes
- How to execute batch operations
- How to close JDBC resources safely
- How to build a more maintainable Java database application

