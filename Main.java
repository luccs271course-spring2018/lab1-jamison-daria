package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Please input a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("We will now determine fizz buzz");
    Main.fizzbuzz(n);
  }

  public static String[] fizzbuzz(int n) {
    if (n >= 1) {
      String[] list = new String[n+1];
      for (int i = 1; i <= n; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
          list[i] = "fizz buzz";
        } else if (i % 5 == 0) {
          list[i] = "buzz";
        } else if (i % 3 == 0) {
          list[i] = "fizz";
        } else {
          list[i] = String.valueOf(i);
        }
      }
      return list;
    }
    return null;
  }
} 
