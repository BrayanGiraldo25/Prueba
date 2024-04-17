package com.example;

public class Main {
    public static void main(String[] args) {
    int base = 20;
    int altura = 15;
    int area = (base * altura/2);
    System.out.println("Área del triángulo: " + area);
    int ladotriangulo1 = 50;
    int ladotriangulo2 = 50;
    int ladotriangulo3 = 50;
    int totallados = ladotriangulo1 + ladotriangulo2 + ladotriangulo3;
    if (totallados / 3 == ladotriangulo1){
        System.out.println("es un triangulo equilatero");
    } else if (totallados / 3 != ladotriangulo1 && totallados == ladotriangulo2){
        System.out.println("es un triangulo isoceles");
    }
}

}