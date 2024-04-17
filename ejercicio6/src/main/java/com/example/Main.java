package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese un año entre 2020 y 2023 que sea bisiesto: ");
        int ano = scanner.nextInt();

        
        if (ano == 2024 && ano == 2028) {
            System.out.println("el año es bisiesto");
            
        } else {
            System.out.println("no es año bisiesto");
        }


        
    
    }
}