# Day 3 Notes

## What is Scanner?

Scanner is a predefined Java class used to take input from the user through the keyboard.

To use Scanner:

```java
import java.util.Scanner;
```

---

## Creating a Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` → Class name
- `sc` → Object name
- `System.in` → Keyboard input

---

## Common Scanner Methods

### Read an Integer

```java
int age = sc.nextInt();
```

### Read a Double

```java
double salary = sc.nextDouble();
```

### Read a Float

```java
float marks = sc.nextFloat();
```

### Read a Long

```java
long mobile = sc.nextLong();
```

### Read a Boolean

```java
boolean result = sc.nextBoolean();
```

### Read One Word

```java
String name = sc.next();
```

### Read an Entire Line

```java
String address = sc.nextLine();
```

---

## Difference Between next() and nextLine()

`next()`
- Reads only one word.
- Stops at the first space.

`nextLine()`
- Reads the entire line, including spaces.

---

## Closing Scanner

```java
sc.close();
```

Closing the scanner releases system resources and is a good programming practice.

---

## What I Learned Today

- Importing Scanner
- Creating Scanner Object
- Reading Different Data Types
- Difference Between next() and nextLine()
- Taking User Input
- Closing Scanner