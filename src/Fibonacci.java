package src;

import java.util.Scanner;

/* 
 Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
*/

public class Fibonacci {
    public void printFibonacci() {
      int fibo1 = 0;
      int fibo2 = 1;
      Scanner scanner = new Scanner(System.in);
      System.out.println("**FIBONACCI SERIES**");
      System.out.print("Enter numbers to show: ");
      int numbers = scanner.nextInt();

      for(int i = 0; i < numbers; i++) {
          System.out.print(fibo1 + " ");
          int fibonacci = fibo1 + fibo2;
          fibo1 = fibo2;
          fibo2 = fibonacci;
      }
     
      
    }
}
