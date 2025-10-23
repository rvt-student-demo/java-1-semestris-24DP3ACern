package rvt;
import java.util.Scanner;
public class newapp {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    int[] data = new int[10];
    System.out.println("Set data: ");
    for (int i=0; i < data.length; i++) {
        data[i] = scanner.nextInt();
    }
    System.out.println("so far:");
    for (int i=0; i < data.length; i++){
        System.out.println((i+1)+": "+data[i]);
    }
    String[] data2 = new String[10];
    System.out.println("Set data: ");
    for (int i=0; i < data.length; i++) {
        data[i] = scanner.nextInt();
    }
    System.out.println("so far:");
    for (int i=0; i < data.length; i++){
        System.out.println((i+1)+": "+data[i]);
    }
    double[] data3 = new double[10];
    System.out.println("Set data: ");
    for (int i=0; i < data.length; i++) {
        data[i] = scanner.nextInt();
    }
    System.out.println("so far:");
    for (int i=0; i < data.length; i++){
        System.out.println((i+1)+": "+data[i]);
    }
    }
}
