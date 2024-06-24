// factorial of a number

import java.util.Scanner;

public class p2{
    
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
         int num = scanner.nextInt();
        int index, result = 1;
        for (index = 2; index <= num; index++){ // index = 2 and 0,1 have factorial 1
            result *= index;
            
        }
        System.out.println("Factorial of number is: " + result);
        scanner.close();
    }
}