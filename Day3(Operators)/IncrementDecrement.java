public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 10;

        // POST-INCREMENT
        System.out.println(a++);  // First use 10, then increase a to 11
        System.out.println(a);    // a is now 11


        // PRE-INCREMENT
        System.out.println(++a);  // First increase a to 12, then use 12
        System.out.println(a);    // a is now 12


        // POST-DECREMENT
        System.out.println(a--);  // First use 12, then decrease a to 11
        System.out.println(a);    // a is now 11


        // PRE-DECREMENT
        System.out.println(--a);  // First decrease a to 10, then use 10
        System.out.println(a);    // a is now 10
    }

}
