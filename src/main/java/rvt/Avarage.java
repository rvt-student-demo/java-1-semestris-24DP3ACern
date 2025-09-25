package rvt;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 25; 
        System.out.println(b / Double.valueOf(a));
        
        System.out.println("Give me number 1:");
        int Anumber = scanner.nextInt();
        System.out.println("Give me number 2:");
        int Bnumber = scanner.nextInt();
        System.out.println(Anumber + " + " + Bnumber + " = " + (Anumber + Bnumber));

    }
    }

