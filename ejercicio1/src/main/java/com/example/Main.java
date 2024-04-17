package com.example;
import java.util.Scanner;

// Brayan Estiben Giraldo Garcia

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejercicio 1: ingrese un numero entero, el programa decidira si es un numero positivo, negativo o 0");
        int entero = scanner.nextInt();

        if (entero >= 1){
            System.out.println("el numero ingresado es positivo");
        } else if (entero < 0){
            System.out.println("el numero ingresado es negativo");
        } else {
        System.out.println("el numero ingresado es 0");
         }
    }
    
}