
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner variable =new Scanner (System.in);
        
       
        System.out.print("Ingrese su edad: ");
        int edad = variable.nextInt();
        
        while(edad <0){ //Comprueba que la edad no sea un numero negativo
            
            System.out.println("El numero no concuerda");
            System.out.print("Ingrese su edad: ");
            edad = variable.nextInt();
        } 
        
        if (edad <18){
            
            System.out.println("Usted es menor de edad");
        }else{
            
            System.out.println("Usted es mayor de edad");
            
        }
        
    }
    
}
