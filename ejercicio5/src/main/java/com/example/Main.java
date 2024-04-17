package com.example;

// Brayan Estiben Giraldo Garcia

public class Main {
    public static void main(String[] args) {
        int temperatura =  5;
        double celsius;
        double farenheirt;

        if (temperatura < 0){
            celsius = 5 * 5 /9 + 32;
            farenheirt = celsius;
            System.out.println("La temperatura Farenheirt es de "+farenheirt);
        } else if(temperatura > 0){
            farenheirt = 50 - 32 * 5 / 9;
            celsius = farenheirt;
            System.out.println("la temperatura en celsisu es de "+celsius);
        }
    }
}