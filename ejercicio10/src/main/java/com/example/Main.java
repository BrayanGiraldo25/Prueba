package com.example;
import java.util.Scanner;
public class Main {
   public static boolean esperfecto(int n){
    int i, suma = 1 ;
     for ( i =2; i<n; i++){
        if (n%i == 0) {
            suma += i;

            
        }
     }
   if (suma == n) { 
    return true;
    
   }else{
    return false;
   }

}
    public static <scanner> void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in);
   System.out.println("ingrese un numero"); 
   num = leer.nextInt();
   if (esperfecto(num)) {
    System.out.println("el numero es" + num + " perfecto" );
    
   }else {
    System.out.println(" el numero " + num + " no es perfecto ");
   }


}
}