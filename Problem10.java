package problem10;

import java.util.Scanner;

public class Problem10 {

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
        
        for (i = a.length; i > 0; i--) {
            System.out.print(a[i-1] + " ");
        }
        
        System.out.println("");
        
    }
}
