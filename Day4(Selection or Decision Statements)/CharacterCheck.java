class CharacterCheck{
    public static void main(String[] args){
        // Declare a character variable and store 'A'
        char ch = 'A';
        // Check whether the character is between A and Z
        // If true, the character is an uppercase letter
        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("Uppercase Letetrs");
        }
        // If the first condition is false,
        // check whether the character is between a and z
        // If true, the character is a lowercase letter
        else if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase Letters");
        }
        // If the above conditions are false,
        // check whether the character is between 0 and 9
        // If true, the character is a digit
        else if(ch >= '0' && ch <= '9'){
            System.out.println("Digits");
        }
        // If none of the above conditions are true,
        // the character is considered a special character
        else{
            System.out.println("Special Characters");
        }

    }
}