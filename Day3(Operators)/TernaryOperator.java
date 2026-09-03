 public class TernaryOperator {
    public static void main(String[] args) {

        // 1. Check whether a number is positive or negative
        int num = 10;
        String result1 = (num >= 0) ? "Positive" : "Negative";
        //              condition ? true     : false
        System.out.println("Number is: " + result1);


        // 2. Check whether a person is eligible to vote
        int age = 20;
        String result2 = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        //                condition ? if true           : if false
        System.out.println("Voting: " + result2);


        // 3. Find the bigger of two numbers
        int a = 25;
        int b = 15;
        int bigger = (a > b) ? a : b;
        //             condition ? a : b
        //             If a > b is true, a is selected
        //             Otherwise, b is selected
        System.out.println("Bigger number: " + bigger);


        // 4. Find the smaller of two numbers
        int x = 10;
        int y = 20;
        int smaller = (x < y) ? x : y;
        //              condition ? x : y
        //              If x < y is true, x is selected
        //              Otherwise, y is selected
        System.out.println("Smaller number: " + smaller);


        // 5. Check whether a number is even or odd
        int number = 7;
        String result3 = (number % 2 == 0) ? "Even" : "Odd";
        //                    condition ? true  : false
        System.out.println("Number is: " + result3);


        // 6. Check whether a student passed or failed
        int marks = 65;
        String result4 = (marks >= 40) ? "Pass" : "Fail";
        //                condition ? Pass : Fail
        System.out.println("Result: " + result4);


        // 7. Check whether a person is an adult or minor
        int personAge = 16;
        String result5 = (personAge >= 18) ? "Adult" : "Minor";
        //                     condition ? Adult : Minor
        System.out.println("Person is: " + result5);
        // 8. Find the largest of three numbers
        int p = 30;
        int q = 50;
        int r = 40;

        int largest = (p > q)
                ? ((p > r) ? p : r)
                : ((q > r) ? q : r);

        // First check p > q
        // If true, compare p and r
        // If false, compare q and r

        System.out.println("Largest number: " + largest);
    }
} 
    

