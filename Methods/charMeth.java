package Methods;

public class charMeth {
    
    public static void main(String[] args) {

        char ch = 'A';

        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.toLowerCase(ch));
        System.out.println(Character.toUpperCase('b'));
    }
}

