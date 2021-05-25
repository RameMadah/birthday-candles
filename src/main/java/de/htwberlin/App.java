package de.htwberlin;

import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {
    // 5 ist die höchste Zahl (Kerze) und kommt 2 Mal vor.
    CakeCandles cake = new CakeCandles(Arrays.asList(3,8, 34,45,67, 5,66, 4,88));
    CakeCandles cake2 = new CakeCandles(Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5,6,8,3,9,6));
    CakeCandles birthdayCakeCandles =new CakeCandles(Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5)) ;
    System.out.println("----------------------------------------------");
    cake.CakeCounter(Arrays.asList(3, 2, 3, 1, 3, 5, 4, 5));
    cake.CakeCounter(Arrays.asList(3,8, 34,45,67, 5,66, 4,88));
    // TODO: Rufen Sie hier Ihre Methode auf
  }
}
