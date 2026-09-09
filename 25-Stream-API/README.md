# Java Stream API

This folder contains examples and practice programs related to the **Stream API in Java**.

## 📚 Topics Covered

- Stream API
- Creating Streams
- `filter()`
- `map()`
- `sorted()`
- `forEach()`
- `count()`
- `reduce()`
- `collect()`
- `distinct()`
- Method References
- Stream Processing

## 📂 Files

| File | Description |
|------|-------------|
| `StreamExample.java` | Demonstrates basic Stream API |
| `StreamFilter.java` | Filters elements using `filter()` |
| `StreamMap.java` | Transforms elements using `map()` |
| `StreamSorted.java` | Sorts elements using `sorted()` |
| `StreamForEach.java` | Iterates elements using `forEach()` |
| `StreamCount.java` | Counts elements using `count()` |
| `StreamReduce.java` | Combines elements using `reduce()` |
| `StreamCollect.java` | Collects stream results into a List |
| `StreamDistinct.java` | Removes duplicate elements |
| `InterviewQuestions.md` | Stream API interview questions |
| `PracticePrograms.md` | Stream API practice programs |

## 🔹 What is Stream API?

The **Stream API** was introduced in **Java 8**.

It is used to process collections of data in a simple and efficient way.

Example:

```java
List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

numbers.stream()
       .forEach(System.out::println);
