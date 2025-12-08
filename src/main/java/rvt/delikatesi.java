package rvt;

import java.util.Scanner;

public class delikatesi {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ievadi preci: ");
            String preci = scanner.nextLine();
            System.out.println("ievadi cēnu: ");
            double cena = scanner.nextDouble();
            System.out.println("ekspress piegade (0/1): ");
            int exp = scanner.nextInt();
            double piegade; 
            if (cena < 10.0){
                piegade = 2.0;
            } else{
                piegade = 0.0;
            } 
            if(exp == 1){
                piegade += 3.0;
            }
            System.out.println("\nRekins");
            System.out.printf("%-15s %.2f\n", preci, cena);
            System.out.printf("piegade      %.2f\n", piegade);
            System.out.printf("kopa:      %.2f\n",cena + piegade);
        }
}
