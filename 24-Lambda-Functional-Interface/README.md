# Java Lambda Expressions & Functional Interfaces

This folder contains examples and practice programs related to **Lambda Expressions** and **Functional Interfaces** in Java.

## 📚 Topics Covered

- Lambda Expressions
- Lambda Expressions with Parameters
- Lambda Expressions with Multiple Parameters
- Lambda Expressions with Return Values
- Runnable with Lambda
- Functional Interfaces
- Predicate
- Consumer
- Function
- Supplier

## 📂 Files

| File | Description |
|------|-------------|
| `LambdaExample.java` | Demonstrates a basic Lambda Expression |
| `LambdaWithParameters.java` | Lambda Expression with one parameter |
| `LambdaWithMultipleParameters.java` | Lambda Expression with multiple parameters |
| `LambdaWithReturnValue.java` | Lambda Expression with return value |
| `RunnableLambda.java` | Create a thread using Lambda |
| `PredicateExample.java` | Demonstrates Predicate |
| `ConsumerExample.java` | Demonstrates Consumer |
| `FunctionExample.java` | Demonstrates Function |
| `SupplierExample.java` | Demonstrates Supplier |
| `InterviewQuestions.md` | Lambda and Functional Interface interview questions |
| `PracticePrograms.md` | Lambda practice programs |

## 🔹 What is Lambda Expression?

A Lambda Expression is a short way to write the implementation of a functional interface.

### Traditional Approach

```java
interface Greeting {
    void sayHello();
}

Greeting greeting = new Greeting() {
    public void sayHello() {
        System.out.println("Hello Java");
    }
};
