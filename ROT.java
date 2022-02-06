import java.util.Scanner;

public class ROT {

    public static void main(String[] args) {

        System.out.println("Hello and welcome to my ROT String scrambler");
        System.out.println("Please enter the String you wish to scramble: ");

        Scanner myObj = new Scanner(System.in);
        String password = myObj.nextLine();


        Scanner in = new Scanner(System.in);

        System.out.println("1\t ROT10");
        System.out.println("2\t ROT11");
        System.out.println("3\t ROT12");
        System.out.println("3\t ROT13");

        System.out.println("Great! and which ROT function would you like to use?");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println(ROT10(password));
                break;
            case 2:
                System.out.println(ROT11(password));
                break;
            case 3:
                System.out.println(ROT12(password));
                break;
            case 4:
                System.out.println(ROT13(password));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static String ROT13(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String ROT12(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') c += 12;
            else if (c >= 'A' && c <= 'M') c += 12;
            else if (c >= 'n' && c <= 'z') c -= 12;
            else if (c >= 'N' && c <= 'Z') c -= 12;
            sb.append(c);
        }
        return sb.toString();
}

    public static String ROT11(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') c += 11;
            else if (c >= 'A' && c <= 'M') c += 11;
            else if (c >= 'n' && c <= 'z') c -= 11;
            else if (c >= 'N' && c <= 'Z') c -= 11;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String ROT10(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') c += 10;
            else if (c >= 'A' && c <= 'M') c += 10;
            else if (c >= 'n' && c <= 'z') c -= 10;
            else if (c >= 'N' && c <= 'Z') c -= 10;
            sb.append(c);
        }
        return sb.toString();
    }
}






