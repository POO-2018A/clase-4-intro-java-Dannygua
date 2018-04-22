
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
      
        Scanner variable = new Scanner (System.in);
        
        System.out.print("Si esta nevando digite true, si no esta nevando digite false: ");
        boolean estaNevando=variable.nextBoolean();
        
        System.out.print("Si esta lluoviendo digite true, si no esta lloviendo digite false: ");
        boolean estaLloviendo=variable.nextBoolean();
        
        System.out.print("Ingrese la temperatura ambiente: ");
        double temperatura=variable.nextDouble();
        
        if (estaNevando || estaLloviendo || temperatura < 10){
        
            System.out.println("Nos quedamos en casa!");
        
        }else{
        
            System.out.println("Vamos afuera!");
        
        }
        
        
        
        
    }
    
}
