Day 3 — Java Operators

An operator in Java is a symbol that tells Java to perform an operation on one or more values (operands).

Relational operators
Logical operators
Assignment operators
Increment and decrement
Ternary operator
Combining operators
 Relational operators
compare two values.
that is  result in true (or) false.

Operator	           Meaning
	>	               greater than
	<	               less than
	>=			         greater than or equal
	<=			         less than or equal
	==			         equal to
	!=			         not equal to

int age = 20;
System.out.println(age > 18);
System.out.println(age < 18);
System.out.println(age >= 20);
System.out.println(age == 20);
System.out.println(age != 20);

Difference:
=   → put a value
==  → compare two values
Logical Operators

Logical operators combine conditions.
There are three:
&&   AND
||   OR
!       NOT


&& — AND
Both conditions must be true.
int age = 20;
boolean student = true;
System.out.println(age >= 18 && student == true);

Output:
true
If even one condition is false:
true && false → false

|| — OR
At least one condition must be true.
int age = 16;
boolean permission = true;
System.out.println(age >= 18 || permission);

Output:
true
Because:
false || true = true

! — NOT
! reverses the boolean value.
boolean student = true;
System.out.println(!student);

Output:
false
!true  → false
!false → true

7. Assignment Operators
You already know:
int x = 10;
But Java also has shortcuts.

+=
int x = 10;
x += 5;

Same as:
x = x + 5;

Result:
15
-=
x -= 3;

Same as:
x = x - 3;
*=
x *= 2;

Same as:
x = x * 2;
/=
x /= 2;

Same as:
x = x / 2;
%=
x %= 3;

Same as:
x = x % 3;

8. Practice — Assignment Operators

Create:
Assignment.java

Start:
int x = 20;

Then perform:
x += 10
x -= 5
x *= 2
x /= 5

Print x after each operation.
Don't calculate the answers beforehand. Let Java calculate them.

9. Increment ++
Increment means increase by 1.

int x = 10;
x++;
System.out.println(x);

Output:
11

Same as:
x = x + 1;

10. Decrement --
Decrement means decrease by 1.
int x = 10;
x--;
System.out.println(x);

Output:
9

Same as:
x = x - 1;

11. x++ vs ++x
This is slightly tricky.
Post-increment
int x = 5;

System.out.println(x++);
System.out.println(x);

Output:
5
6

First use the old value, then increase.
Pre-increment
int x = 5;
System.out.println(++x);
System.out.println(x);

Output:
6
6
First increase, then use the value.

Remember:
x++ → use first, increase later
++x → increase first, use later
You'll see this frequently in loops and DSA.

12. Ternary Operator

The ternary operator is a short way to make a simple choice.
Syntax:
condition ? valueIfTrue : valueIfFalse;
Example:
int age = 20;
String result = age >= 18 ? "Adult" : "Minor";
System.out.println(result);

Output:
Adult
Read it as:
If age is greater than or equal to 18, choose "Adult", otherwise choose "Minor".

Another example:
int marks = 75;
String result = marks >= 40 ? "Pass" : "Fail";
System.out.println(result);

Output:
Pass




Relational operators
Compare two numbers.
Check whether a person is eligible based on age.

Logical operators
Check whether a student is an adult and a student.
Check whether a student passes and has attendance.

Assignment operators
Update a bank balance.
Update a product quantity.

Increment/decrement
Increase a number by 1.
Decrease a number by 1.

Ternary operator
Check Pass/Fail.
Check Adult/Minor.
