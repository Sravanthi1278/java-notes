DAY 2 — Variables & Data Types


Understand variables
Declare and initialize variables
Understand Java data types
Use byte, short, int, long
Use float, double
Use char
Use boolean
Print variables
Change variable values
Understand basic type casting
Write 10 small programs



1. What is a Variable?

A variable is a named storage location used to store a value.
For example:
int age = 20;

Here:

int  → data type
age  → variable name
20   → value
=    → assignment operator

Think of it like a box:

      age
   ┌────────┐
   │   20   │
   └────────┘

Another example:

String name = "Sravanthi";
       name
   ┌────────────┐
   │ Sravanthi  │
   └────────────┘
2. Declaration vs Initialization

These are two terms you need to know.
Declaration
int age;

You created the variable but haven't given it a value.

Initialization
age = 20;

Now you've assigned a value.

You can do both together:
int age = 20;

This is called declaration + initialization.

3. Java Data Types

Java has two broad categories:

Data Types
│
├── Primitive
│
└── Non-Primitive

Today we'll focus mainly on primitive data types.

There are 8 primitive types:
byte
short
int
long
float
double
char
Boolean

4. Integer Data Types

These store whole numbers.

byte

byte age = 20;

Range:

-128 to 127

Example:
byte temperature = 45;
short
short year = 2026;

Range:
-32,768 to 32,767

int
This is the most commonly used integer type.
int salary = 30000;

Example:
int students = 5000;
For normal whole numbers, you'll usually use int.

long

Used for very large whole numbers.
long population = 1400000000L;
Notice the:
L
at the end.
Example:
long distance = 9876543210L;

5. Decimal Data Types

float

float price = 99.5f;
You normally need f at the end:
99.5f
Without f, Java treats a decimal literal like 99.5 as a double.

double

This is the more commonly used decimal type.
double salary = 25000.75;
Example:
double percentage = 85.5;

6. char

char stores one character.
Use single quotes: char grade = 'A';
Correct: char letter = 'S';
Wrong: char letter = "S";
Why?
'S'  → char
"S"  → String
We'll learn String properly later.

7. Boolean

A Boolean has only two possible values:
true
false
Example:
Boolean isStudent = true;
Another example: Boolean isJavaEasy = true;
Or:
Boolean isCompleted = false;

8. Your First Day 2 Program

Create:
Day2.java

public class Day2 {
    public static void main(String[] args) {
        byte age = 20;
        short year = 2026;
        int students = 5000;
        long population = 1400000000L;
        float percentage = 85.5f;
        double salary = 25000.75;
        char grade = 'A';
        boolean  isStudent = true;
        System.out.println(age);
        System.out.println(year);
        System.out.println(students);
        System.out.println(population);
        System.out.println(percentage);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isStudent);
    }
}

9. Printing Text + Variables

This is very important.
You don't want output like:

20
85.5
A

You want meaningful output:

Age: 20
Percentage: 85.5
Grade: A

Use +:

public class Day2 {
    public static void main(String[] args) {

        int age = 20;
        double percentage = 85.5;
        char grade = 'A';

        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

Output:

Age: 20
Percentage: 85.5
Grade: A

10. Changing a Variable

Look at this:
int age = 20;
System.out.println(age);
age = 21;
System.out.println(age);

Output:
20
21

The value stored in age changed.
That's why it's called a variable.

11. Variable Naming Rules

This is important.

Correct
int age;
int studentAge;
int student_age;
int age2;
Wrong
int 2age;
int student-age;
int student age;

A variable cannot start with a number.
It also cannot contain spaces or -.

12. Naming Convention

Java commonly uses camelCase.
Camel case is a way of writing names where multiple words are joined together without spaces, and each new word starts with a capital letter.

Good:

studentName
studentAge
totalMarks
averageMarks
collegeName

Avoid:

Studentname
student_name
STUDENTNAME

For normal variables, use:

firstName
totalMarks
averageSalary

13. Basic Type Casting

Type casting means converting one data type into another.

Types of Type Casting

Java mainly has two types:

                 Type Casting
                      |
          ┌───────────┴───────────┐
          ↓                             ↓

    Widening           Casting           Narrowing Casting
    (Implicit)              (Explicit)
          ↓
                                           ↓
 Small → Large            Large → Small
   Automatic                Manual

1. Widening Type Casting

Widening casting means converting a smaller data type into a larger data type.
Java performs this conversion automatically, so we don't need to write anything extra.

Example 1
int number = 100;
double value = number;
System.out.println(value);

Output:
100.0

Here: int → double

The int value 100 becomes 100.0.
Example 2
byte a = 10;
int b = a;
System.out.println(b);

Output:
10

Here: byte → int
Widening order

byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double

Widening is generally safe because the destination type can represent the source type's range, though floating-point types have their own precision limitations.

2. Narrowing Type Casting

Narrowing casting means converting a larger data type into a smaller data type.
Java does not perform this automatically because there may be loss of data.
Therefore, we must explicitly specify the target type.

Syntax:

smallDataType variable = (smallDataType) value;
Example 1
double number = 10.75;
int value = (int) number;
System.out.println(value);

Output:
10

Here: double → int
The .75 is removed.

Example 2
int number = 130;
byte value = (byte) number;
System.out.println(value);

Here, narrowing can produce an unexpected result because byte cannot represent 130. This is why narrowing can be risky.
Difference Between Widening and Narrowing

Widening
Smaller → larger type
Automatic
No explicit cast usually needed
Usually safer
int → double
Also called implicit casting

Narrowing
Larger → smaller type
Manual
Explicit cast required	Can lose data
double → int
Also called explicit casting
Important Point

Do not confuse type casting with changing the original variable's data type.

int a = 10;
double b = (double) a;
The variable a is still an int.
Only the value is being used as a double when assigned to b.
public class Casting {
public static void main(String[] args) {

        int number = 25;
        double decimalNumber = number;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);

        double price = 99.99;
        int convertedPrice = (int) price;

        System.out.println("Double: " + price);
        System.out.println("Integer: " + convertedPrice);
    }
}
