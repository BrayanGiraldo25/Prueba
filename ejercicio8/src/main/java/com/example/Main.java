package com.example;

public class Main {
    public static void main(String[] args) {
        {
            int numero = 49;
            int divisor = 3;
            int divisor2 = 7;
            int resultado1 = numero / divisor;
            int resultado2 = numero / divisor2;
            System.out.println("el numero dividido por 3 da "+resultado1);
            System.out.println("el numero dividido por 7 da "+resultado2);
    
            if (resultado1 == 3 && resultado2 == 7){
                System.out.println("el numero es multiplo de 3 y 7");
            } else if (resultado1 == 3 || resultado2 == 7){
                System.out.println("el numero es multiplo de 3 o 7");
            } else {
                System.out.println("el numero no es multiplo de ninguno");
            }
        }
    }
}