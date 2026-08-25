# Java Multithreading

Multithreading allows a Java program to execute multiple tasks concurrently.

## Topics

- Thread
- Runnable
- Thread creation
- Thread name
- Thread priority
- sleep()
- join()
- Thread methods
- Synchronization

## Ways to Create a Thread

### 1. Extending Thread

```java
class MyThread extends Thread
```

### 2. Implementing Runnable

```java
class MyThread implements Runnable
```

## Important Methods

| Method | Purpose |
|---|---|
| `start()` | Starts a thread |
| `run()` | Contains thread task |
| `sleep()` | Pauses thread |
| `join()` | Waits for another thread |
| `getName()` | Gets thread name |
| `setName()` | Sets thread name |
| `getPriority()` | Gets priority |
| `setPriority()` | Sets priority |
