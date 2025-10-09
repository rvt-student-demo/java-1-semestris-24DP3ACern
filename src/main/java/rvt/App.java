package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int summ = 0;
    System.out.println("enter number: ");
    int num1 = Integer.valueOf(scanner.nextLine());
    System.out.println("imput another number: ");
    int numm2 = Integer.valueOf(scanner.nextLine());
    for (int i = num1; i <= numm2; i++) {
        summ = summ + i;
    }
    System.out.println("sum is " + summ);
        }
    }   
