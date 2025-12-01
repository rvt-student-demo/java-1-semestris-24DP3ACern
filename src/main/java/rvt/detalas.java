package rvt;

import java.util.Scanner;

public class detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int skr_pr = 5;
        final int uzgr_pr = 3;
        final int papl_pr = 1; 
        System.out.println("skruvju skaits: ");
        int skr = scanner.nextInt();
        System.out.println("uzgrieznu skaits: ");
        int uzgr = scanner.nextInt();
        System.out.println("paplaksnu skaits: ");
        int papl = scanner.nextInt();
        boolean hasError = false;
        if(uzgr < skr){
            System.out.println("Par maz griežņu");
            hasError = true;
        }
        if(papl < skr *2){
            System.out.println("Par maz skruvi");
            hasError = true;
        }
       if(!hasError){
        System.out.println("Viss ir kartiba");
       }
       int maksa = skr * skr_pr + uzgr * uzgr_pr + papl * papl_pr; 
       System.out.println("kopeja cena: "+ maksa);
    }
}
