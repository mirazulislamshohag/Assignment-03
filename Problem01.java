package problem01;

import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 5 numbers please: ");
        int a[] = new int[5];
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
