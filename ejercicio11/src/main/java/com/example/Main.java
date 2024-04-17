package com.example;
import java.util.Scanner;
public class Main {
   private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println( "ingrese un numero base: :");
   int base = sc.nextInt();
   System.out.println( "ingrese numero de exponente : :");
   int exponente = sc.nextInt();
   System.out.println( " el resultado es :" +Potencia (base,exponente ));
   
   
    }
        
        public static int Potencia ( int base, int exponente){
            if (exponente == 0){
                return 1;
            }else{
                return base *Potencia ( base, exponente -1);
            }
        
    }
}