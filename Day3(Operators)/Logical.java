public class Logical {
    public static void main(String[] args){
        int age = 20;
        boolean student = true;
        System.out.println("Adult and student: " + (age >= 18 && student == true));
        System.out.println("Adult or student: " + (age >=18 || student));
        System.out.println("Not student: " + (!student));

    }
    
}
