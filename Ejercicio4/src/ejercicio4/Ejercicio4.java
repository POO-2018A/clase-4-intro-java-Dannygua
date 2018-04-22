
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        Scanner variable = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = variable.nextInt();
        
        while (numero ==0){ //Verifica que el numero ingresado no sea 0 
            
            System.out.println("El numero " +numero + " no es impar ni es par");
            System.out.print("Ingrese un numero: ");
            numero = variable.nextInt();
        }
      
        
        if (numero % 2 ==0){
            
            System.out.println("El numero " +numero + " Es par" );
        
        }else{
        
            System.out.println("El numero " +numero + " Es impar");
            
        }
        
        
    }
    
}
