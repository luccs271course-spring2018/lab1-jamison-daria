package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Please input a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("We will now determine fizz buzz");
    Main.fizzbuzz(n);
  }

  public static List<String> fizzbuzz(int n) {
    if (n >= 1) {
      List<String> list = new ArrayList<String>();
      for (int i = 1; i <= n; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
          list.add("fizz buzz");
        } else if (i % 5 == 0) {
          list.add("buzz");
        } else if (i % 3 == 0) {
          list.add("fizz");
        } else {
          list.add(String.valueOf(i));
        }
      }
      return list;
    }
    return null;
  }
}
