🟢 Day 4 — Java if, else if, else

You have finished the basics, variables, data types, and operators. Day 4 is important because now Java starts making decisions.

🎯 Day 4 Topics
Day 4
│
├── 1. if statement
├── 2. if-else
├── 3. else-if
├── 4. Nested if
├── 5. Multiple conditions
├── 6. Comparing numbers
├── 7. Combining conditions with && and ||
└── 8. Practice programs

if
 ↓
One condition

if-else
 ↓
Two choices

if-else if-else
 ↓
Multiple choices

nested if
 ↓
Condition inside another condition

1. if Statement
if is used when you want Java to execute something only when a condition is true.

Syntax:
if (condition) {
    // code
}

Example:
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible");
}

Output:
You are eligible
Because:
20 >= 18 → true
If the condition is false, the code inside if doesn't execute.

2. if-else
Use if-else when there are two possibilities.

Example:
int age = 16;
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}

Output:
Minor   age >= 18?
          /       \
       true       false
        ↓           ↓
     Adult        Minor
     
3. Example: Pass or Fail
This is a very common programming problem.
int marks = 75;
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}

Output:
Pass
Change:
int marks = 35;

Output:
Fail
Notice that you didn't change the if condition. Only the input changed.
That's the point of decision-making.

4. else if

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
How Java checks it
For 85:
85 >= 90 → false
85 >= 80 → true  ← stops here

It doesn't continue checking the remaining conditions.

⚠️ Important: Order Matters
This is wrong:

if (marks >= 40) {
    System.out.println("Pass");
} else if (marks >= 80) {
    System.out.println("Grade A");
}

For 85, Java sees:
85 >= 40 → true
So it prints:
Pass
It never reaches marks >= 80.
Therefore, put more specific/higher conditions first:

if (marks >= 90) {
    ...
} else if (marks >= 80) {
    ...
} else if (marks >= 40) {
    ...
} else {
    ...
}

5. Multiple Conditions with &&
You already learned && on Day 3.
Now use it with if.

Example:

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

6. Multiple Conditions with ||
Example:
int marks = 85;
if (marks >= 90 || marks < 40) {
    System.out.println("Special case");
} else {
    System.out.println("Normal case");
}

At least one condition must be true.

7. Nested if
An if inside another if is called nested if.

Example:
int age = 20;
boolean hasId = true;

if (age >= 18) {
 if (hasId) {
        System.out.println("Entry allowed");
    }

}

Output:

Entry allowed

The second condition is checked only if the first condition is true.

🧪 Program 1 — Check Positive or Negative

Create:

PositiveNegative.java

Write:

int number = 10;

if (number > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Negative");
}

Run:

javac PositiveNegative.java
java PositiveNegative

Expected:

Positive
Test it again

Change:

int number = -5;

Expected:

Negative

Then try:

int number = 0;

You'll notice a problem: 0 is neither positive nor negative.

We'll fix that using else if.

🧪 Program 2 — Positive, Negative, or Zero

Create:

NumberCheck.java

Your program should produce:

Positive

for 10.

Negative

for -5.

Zero

for 0.

Use:

if
else if
else

Don't copy the solution. Write it yourself.

🧪 Program 3 — Pass or Fail

Create:

Result.java

Use:

marks = 75

If marks are >= 40:

Pass

Otherwise:

Fail

Then test it with:

35

You should get:

Fail
🧪 Program 4 — Grade Calculator ⭐

Create:

Grade.java

Use:

marks = 85

Rules:

90–100 → A+
80–89  → A
70–79  → B
60–69  → C
40–59  → D
Below 40 → Fail

For:

marks = 85

Expected:

Grade A

Test at least these values:

95
85
75
65
50
30

You should get different results.

🧪 Program 5 — Even or Odd

Create:

EvenOdd.java

Use:

int number = 10;

Hint:

number % 2 == 0

Expected:

Even

Then test:

number = 7;

Expected:

Odd

This combines Day 3 % with Day 4 if-else.

🧪 Program 6 — Student Eligibility

Use:
age = 20
marks = 75
attendance = 85

Student is eligible only when:
age >= 18
AND
marks >= 40
AND
attendance >= 75

Expected:

Eligible

This is important because you're combining:

Variables
+
Relational operators
+
Logical operators
+
if-else

That's how real programs start becoming useful.

🔥 Day 4 Challenge

Create:

StudentResult.java

Use:

studentName = "Sravanthi"
marks = 85

Your program should:

Print the student's name.
Check whether the student passed.
Print the grade.

For 85, expected:

Student Name: Sravanthi
Result: Pass
Grade: A

Then test:

marks = 35

Expected:
Student Name: Sravanthi
Result: Fail
Grade: Fail



