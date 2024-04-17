package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4: Area de un circulo mayor a 100");
        int RadioCirculo = 35;
        double AreaCirculo = RadioCirculo * Math.PI;
        System.out.print(AreaCirculo);
        if (AreaCirculo > 100){
            System.out.println(" El area del circulo es mayor a 100");
        } else {
            System.out.println("el area del circulo es menor a 100");
        }
    }
}