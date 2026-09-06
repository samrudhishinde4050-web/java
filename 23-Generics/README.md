# Java Generics

This folder contains examples and practice programs related to **Generics in Java**.

## 📚 Topics Covered

- Generic Classes
- Generic Methods
- Generic ArrayList
- Generic Pair
- Bounded Generics
- Generic Maximum Value
- Type Safety
- Reusable Code using Generics

## 📂 Files

| File | Description |
|------|-------------|
| `GenericClassExample.java` | Create a generic class |
| `GenericMethodExample.java` | Create a generic method |
| `GenericArrayListExample.java` | Use Generics with ArrayList |
| `GenericPairExample.java` | Store two different data types |
| `GenericMaximum.java` | Find maximum using bounded Generics |
| `InterviewQuestions.md` | Generics interview questions |
| `PracticePrograms.md` | Generics practice programs |

## 🔹 What are Generics?

Generics allow us to write **type-safe and reusable code**.

Example:

```java
class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}
