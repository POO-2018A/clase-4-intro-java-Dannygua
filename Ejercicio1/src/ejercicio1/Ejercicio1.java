
package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

   
    public static void main(String[] args) {
       
        Scanner variable =new Scanner (System.in);
        
        double fahrenheit;
        double celsius ;
        
        System.out.print("Ingrese un valor entre 0 y 100: ");
        fahrenheit = variable.nextDouble();
        
        while (fahrenheit <0 || fahrenheit >100){
          
            System.out.println("El numero no concuerda");
        
        System.out.print("Ingrese un valor entre 0 y 100: ");
        fahrenheit = variable.nextDouble();
        
        
    }
        
        celsius = (((fahrenheit-32)*5)/9);
         
        System.out.println("El valor en celsius es: "+celsius);
    }
    
}
