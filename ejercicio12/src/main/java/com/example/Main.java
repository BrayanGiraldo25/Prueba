package com.example;

public class Main {
   
    public static void main(String[] args) {
       System.out.println("ingrese un nuemro");
       
       int num = 156;
        System.out.println(
             ( isArmstrong(num)) ? "Es un numero armstrong ": " no es un numero armstrong");
    
    }
private static boolean isArmstrong(int num ){
    int temporal = num, digitos=0,ultimodigito=0,suma=0;
    digitos = (int) (Math.log10(num) + 1);

    temporal = num;
    while (temporal> 0) {
        ultimodigito = temporal % 10 ;
        suma += (Math.pow(ultimodigito, digitos));
        
        temporal = temporal /10;
    } 
    if (num == suma ) {return true ;
    
    
}else { return false;}
}





}
