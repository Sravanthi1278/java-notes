🟢 Day 4 — Java if, else if, else,Nested if.
Day 4
│
├── 1. if statement
├── 2. if-else
├── 3. else-if
├── 4. Nested if
├── 5. Multiple conditions
├── 6. Comparing numbers

Every if statement needs a condition that results in true or false.
This means if statements work hand-in-hand with boolean values:
Most often, conditions are created using comparison operators, like the ones below:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to: a == b
Not equal to: a != b
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:
Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

1. The if Statement
The if statement specifies a block of code to be executed if a condition is true:

Syntax:
if (condition) {
  // block of code to be executed if the condition is true
}
The condition inside the if statement must result in a boolean value - it can be either a boolean expression (like x > y) or a boolean variable (like isLightOn).

Also note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

In the example below, we test two values to find out if 20 is greater than 18. If the condition is true, print some text:

Example:
if (20 > 18) {
  System.out.println("20 is greater than 18");
}

2. if-else
 The else statement lets you run a block of code when the condition in the if statement is false.
Use if-else when there are two possibilities.

Example:
int age = 16;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

Output:
Minor

Think:

          age >= 18?
          /       \
       true       false
        ↓           ↓
     Adult        Minor

     Notes
. else does not have a condition - it runs when the if condition is false.
. Do not put a semicolon right after if (condition). That would end the statement early and make else behave unexpectedly.

3. else if
Use else if when you have more than two possibilities.
Example: grades.
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 80) {
    System.out.println("Grade A");
} else if (marks >= 70) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else if (marks >= 40) {
    System.out.println("Grade D");
} else {
    System.out.println("Fail");
}
Output:
Grade A
4. logical
Multiple Conditions with &&
You already learned && on Day 3.
Now use it with if.
Example: &&
int age = 20;
int marks = 75;
if (age >= 18 && marks >= 40) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
Both conditions must be true.
age >= 18  → true
marks >= 40 → true
true && true → true
Output:
Eligible

Multiple Conditions with ||
Example:
int marks = 85;
if (marks >= 90 || marks < 40) {
    System.out.println("Special case");
} else {
    System.out.println("Normal case");
}
At least one condition must be true.
Use NOT (!) to reverse a condition:

Example:
Test if a is not greater than b:
int a = 33;
int b = 200;
if (!(a > b)) {
  System.out.println("a is NOT greater than b");
}

5. Nested if

You can also place an if statement inside another if. This is called a nested if statement.
A nested if lets you check for a condition only if another condition is already true.

Syntax:
if (condition1) {
  // code to run if condition1 is true
  if (condition2) {
    // code to run if both condition1 and condition2 are true
  }
}
Examaple:
int age = 20;
boolean hasId = true;
if (age >= 18) {
    if (hasId) {
        System.out.println("Entry allowed");
    }
}
Notes:
You can nest as many if statements as you want, but avoid making the code too deep - it can become hard to read.
Nested if is often used together with else and else if for more complex decision making.
