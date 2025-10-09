package rvt;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Give me your numbers ");
        int sums = 0;
        int quat = 0;
        int notodd = 0; 
        int odd = 0; 
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                System.out.println("ok byee");
                break;
            } else if(num % 2 == 0) {
                notodd++;
            } else {
                odd++;
            } 
            sums = sums + num;
            quat++;
        }
        System.out.println("yo sums are " + sums);
        System.out.println(quat + " times");
        System.out.println("yo average is " + (sums / (double) quat));
        System.out.println("i forgot what not odds are called but there are " + notodd + " of em");
        System.out.println("and odds here are " + odd);
    }
    }

