# Java Date & Time API

This folder contains examples and practice programs related to the **Date and Time API in Java**.

## 📚 Topics Covered

- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `ZonedDateTime`
- `DateTimeFormatter`
- Date Formatting
- Date Parsing
- Date Difference
- Adding and Subtracting Dates
- `Period`
- `Duration`

## 📂 Files

| File | Description |
|------|-------------|
| `LocalDateExample.java` | Demonstrates date using `LocalDate` |
| `LocalTimeExample.java` | Demonstrates time using `LocalTime` |
| `LocalDateTimeExample.java` | Demonstrates date and time together |
| `DateFormatting.java` | Formats date using `DateTimeFormatter` |
| `DateParsing.java` | Converts String into `LocalDate` |
| `DateDifference.java` | Finds difference between two dates |
| `AddSubtractDate.java` | Adds and subtracts days from a date |
| `PeriodExample.java` | Calculates difference in years, months and days |
| `DurationExample.java` | Calculates difference between two times |
| `ZonedDateTimeExample.java` | Works with date and time zones |
| `InterviewQuestions.md` | Date and Time API interview questions |
| `PracticePrograms.md` | Date and Time API practice programs |

## 🔹 What is Date & Time API?

Java provides the `java.time` package for handling dates and times.

The modern Date & Time API was introduced in **Java 8**.

Example:

```java
import java.time.LocalDate;

LocalDate today = LocalDate.now();

System.out.println(today);
