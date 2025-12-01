package rvt;
import java.util.Scanner;

public class chap44 {

    public static void main(String[] args) {
    uzd1();
    uzd2();
    uzd3();
    uzd4();
    uzd5();
    uzd6();
    uzd7();
    }

    public static void uzd1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        int spaceIndex = name.indexOf(" ");

        if (spaceIndex > 0) {
            String first = name.substring(0, spaceIndex);
            String last  = name.substring(spaceIndex + 1).toUpperCase();
            System.out.println(first + " " + last);
        } else {
            System.out.println(name);
        }
    }

    public static void uzd2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void uzd3() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name:");
            String name = scanner.nextLine();

            if (name.length() == 0) {
                break;
            }

            String result;

            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) {
                result = "Ms. " + name;
            } else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) {
                result = "Mr. " + name;
            } else {
                result = name;
            }

            System.out.println(result);
            System.out.println();
        }
    }

    public static void uzd4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String digits = scanner.nextLine().trim();

        int len = digits.length();
        String minutes;
        String seconds;

        if (len <= 2) {
            minutes = "0";
            seconds = digits;
        } else {
            minutes = digits.substring(0, len - 2);
            seconds = digits.substring(len - 2);
        }

        System.out.println("Your time->  " + minutes + ":" + seconds);
    }

    public static void uzd5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }

    public static void uzd6() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String pw = scanner.nextLine();

            boolean longEnough = pw.length() >= 7;
            boolean hasUpper = !pw.equals(pw.toLowerCase());
            boolean hasLower = !pw.equals(pw.toUpperCase());
            boolean hasDigit = false;

            for (int i = 0; i < pw.length(); i++) {
                if (Character.isDigit(pw.charAt(i))) {
                    hasDigit = true;
                }
            }

            if (longEnough && hasUpper && hasLower && hasDigit) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.");
                System.out.println();
            }
        }
    }

    public static void uzd7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int spaces = 0;

        while (word.length() > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println(word);
            if (word.length() <= 2) break;
            word = word.substring(1, word.length() - 1);
            spaces++;
        }
    }
}
