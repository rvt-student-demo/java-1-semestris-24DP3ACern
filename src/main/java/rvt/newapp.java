package rvt;
import java.util.Scanner;
public class newapp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    int[] data = new int[10];
    System.out.println("Set data: ");
    for (int x=0; x < data.length; x++) {
        data[x] = scanner.nextInt();
    }
    System.out.println("so far:");
    for (int x=0; x < data.length; x++){
        System.out.println((x+1)+": "+data[x]);
    }
    String[] data2 = new String[6];
    System.out.println("Make a sentence:");
    for (int i=0; i < data2.length; i++) {
        data2[i] = scanner.nextLine();
    }
    System.out.println("so far:");
    for (int i=0; i < data2.length; i++){
        System.out.println((i+1)+": "+data2[i]);
    }
    double[] data3 = new double[3];
    System.out.println("Set halfs: ");
    for (int i=0; i < data3.length; i++) {
        data3[i] = scanner.nextDouble();
    }
    System.out.println("so far:");
    for (int i=0; i < data3.length; i++){
        System.out.println((i+1)+": "+data3[i]);
    }
    }
}
