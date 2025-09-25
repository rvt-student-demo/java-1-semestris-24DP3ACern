package rvt;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int priceAp = 10;
       int priceOr = 15;
       int pricePot = 5;
       System.out.println("enter apple count (10 per apple): ");
       int countAp = Integer.valueOf(scanner.nextLine());
       System.out.println("enter orange count (15 per orange): ");
       int countOr = Integer.valueOf(scanner.nextLine());
       System.out.println("enter potater count (10 per potat): ");
       int countPot = Integer.valueOf(scanner.nextLine());
       if (countOr != countAp){
        System.out.println("check your money, too little oranges");
       }
       else if(countAp != (2*countPot)) {
        System.out.println("check your money, too little potaters");
       }
       else {
        System.out.println("just enough");
       };
       System.out.println("that will be: " + (priceAp*countAp+priceOr*countOr+pricePot*countPot));
    }
    }

