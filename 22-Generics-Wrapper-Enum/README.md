# Java Generics, Wrapper Classes & Enum

## Wrapper Classes

Wrapper classes convert primitive data types into objects.

| Primitive | Wrapper |
|---|---|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

## Autoboxing

Automatic conversion of primitive type into wrapper object.

```java
int number = 10;
Integer value = number;
```

## Unboxing

Automatic conversion of wrapper object into primitive type.

```java
Integer value = 10;
int number = value;
```

## Generics

Generics allow classes and methods to work with different data types while providing type safety.

Example:

```java
ArrayList<String> names = new ArrayList<>();
```

## Enum

Enum is used to define a fixed set of constants.

Example:

```java
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}
```
