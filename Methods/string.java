package Methods;

public class string{
    
    public static void main(String[] args) {

        String name = "Satyam Pandey";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("Pandey"));
        System.out.println(name.substring(0, 6));
        System.out.println(name.replace("Satyam", "Rahul"));
        System.out.println(name.startsWith("Sat"));
        System.out.println(name.endsWith("Pandey"));
        System.out.println(name.indexOf("P"));
        System.out.println(name.isEmpty());
    }
}

