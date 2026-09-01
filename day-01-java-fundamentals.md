What Java is
Why Java is used
JDK, JRE, JVM
How a Java program works
Basic Java program structure
How to compile and run Java
main() method
System.out.println()
Comments
Write 5 small programs yourself


1. What is Java?

Java is a high-level, object-oriented programming language developed by Sun Microsystems and now maintained by Oracle.

Java is widely used for:

Backend development
Web applications
Android development
Enterprise applications
Banking applications
Desktop applications


2 . Why Java?

One major reason Java is popular is:
Write Once, Run Anywhere
Java code is compiled into bytecode, which can run on different operating systems using a JVM.

For example:

Java Code
   ↓
Compiler
   ↓
Bytecode
   ↓
JVM
   ↓
Windows / Linux / macOS.


3. JDK vs JRE vs JVM

This is a very common interview question.

JVM

Java Virtual Machine

It runs Java bytecode.

.class file → JVM → Program runs

JRE

Java Runtime Environment

It provides the environment required to run Java programs.

JRE = JVM + Runtime Libraries

JDK
Java Development Kit

It is used to develop and run Java programs.
JDK = JRE + Development Tools

Remember:
JDK
 ↓
JRE
 ↓
JVM

Easy example
Think of a car:

JDK = complete workshop + tools
JRE = environment needed to use the car
JVM = engine that actually runs the program

4. Your First Java Program
Create a file called:
Main.java

Write:
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

Output:
Hello World

5. Understand Every Line

Line 1
public class Main {
#This creates a class called Main.
For now, remember:
Java programs are organized using classes.

Line 2
public static void main(String[] args) {
This is the main method.
Java starts execution from the main() method.
Don't try to memorize every word today. We'll break down:

public
static
void
main
String[]
args

Line 3

System.out.println("Hello World");
This prints text on the screen.

Example:

System.out.println("My name is Sravanthi");
System.out.println("I am learning Java");

Output:
My name is Sravanthi
I am learning Java

6. print() vs println()

#println
System.out.println("Hello");
System.out.println("Java");

Output:
Hello
Java

#print
System.out.print("Hello ");
System.out.print("Java");

Output:
Hello Java

The difference is simple:
println() moves to the next line.
print() stays on the same line.

7. Comments
Comments are notes for humans. Java doesn't execute them.

Single-line comment
// This is a comment
System.out.println("Hello");

Multi-line comment
/*
   This is
   a multi-line comment
*/
System.out.println("Hello");

8. Your First 5 Programs

Program 1 — Print your name

public class Main {
    public static void main(String[] args) {
        System.out.println("My name is Sravanthi");
    }
}


Program 2 — Print your college

public class Main {
    public static void main(String[] args) {
        System.out.println("I am a B.Tech student");
        System.out.println("I am learning Java Full Stack");
    }
}


Program 3 — Print multiple lines

public class Main {
    public static void main(String[] args) {
        System.out.println("Java");
        System.out.println("Spring Boot");
        System.out.println("React");
        System.out.println("MySQL");
    }
}


Program 4 — Use print()

public class Main {
    public static void main(String[] args) {
        System.out.print("Java ");
        System.out.print("Full ");
        System.out.print("Stack");
    }
}

Output:
Java Full Stack

Program 5 — Simple introduction

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Sravanthi");
        System.out.println("Course: B.Tech");
        System.out.println("Goal: Java Full Stack Developer");
    }
}


