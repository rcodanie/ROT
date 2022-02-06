import java.util.Scanner;

public class ROT {

    public static void main(String[] args) {

        System.out.println("Hello and welcome to my ROT String scrambler");
        System.out.println("Please enter the String you wish to scramble: ");

        Scanner myObj = new Scanner(System.in);
        String password = myObj.nextLine();


        Scanner in = new Scanner(System.in);

        System.out.println("0\t ROT10");
        System.out.println("1\t ROT11");
        System.out.println("2\t ROT12");
        System.out.println("3\t ROT13");

        System.out.println("Great! and which ROT function would you like to use?");

        int choice = in.nextInt();

        switch (choice) {
            case 0:
                System.out.println(ROT10(password));
                break;
            case 1:
                System.out.println(ROT11(password));
                break;
            case 2:
                System.out.println(ROT12(password));
                break;
            case 3:
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
            if (c >= 'a' && c <= 'n') c += 12;
            else if (c >= 'A' && c <= 'N') c += 12;
            else if (c >= 'o' && c <= 'z') c -= 14;
            else if (c >= 'O' && c <= 'Z') c -= 14;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String ROT11(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'o') c += 11;
            else if (c >= 'A' && c <= 'O') c += 11;
            else if (c >= 'p' && c <= 'z') c -= 15;
            else if (c >= 'p' && c <= 'Z') c -= 15;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String ROT10(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'p') c += 10;
            else if (c >= 'A' && c <= 'P') c += 16;
            else if (c >= 'q' && c <= 'z') c -= 16;
            else if (c >= 'Q' && c <= 'Z') c -= 16;
            sb.append(c);
        }
        return sb.toString();
    }
}