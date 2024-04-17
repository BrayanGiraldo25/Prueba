package com.example;

public class Main {
    public static void main(String[] args) {
       int num1 = 1;
       int num2 = 5;
       int resultado = num1 + num2;
       System.out.println("la suma de los 2 digitos de 15 es "+resultado);

       if (resultado % 2 == 0) { 
        System.out.println("el numero es par");
    } else {
        System.out.println("el numero es impar");
    }
}
}