package com.example;
import java.util.Scanner;
// Brayan Estiben Giraldo Garcia

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Ejercicio 2: un numero el cual sea divisible por 5 y por 7");
      System.out.println("Ingresa un numero el cual pueda ser dividido entre 5 y 7");
      int entero = scanner.nextInt();
      int divisible = entero / 5;
      int divisible2 = entero / 7;
      boolean numero = false;

      System.out.println(divisible + " " + "y" + " " + divisible2);
      if (divisible == 7 && divisible2 == 5){
        numero = true;
      }

      if (numero){
        System.out.println("El numero " +entero +" es divisible por 5 y 7");
      } else {
        System.out.println("el numero " +entero +" no es divisible por 5 y 7");
      }

    }
}