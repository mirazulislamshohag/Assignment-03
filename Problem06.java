package problem06;

import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 5 numbers please: ");
        int a[] = new int[6];
        int i, value, location = 0, found = 0;
        for (i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Enter any number you want: ");
        value = input.nextInt();
        for (i = 0; i < a.length; i++) {
            if (a[i] == value) {
                found = 1;
                location = i+1;
                break;
            }
        }
        if (found == 1) {
            System.out.println(value + " is found a location"+ " "+ location);
        } else {
            System.out.println(value + " is not found");
        }
    }
}
