
package ClasesYObjetos;

import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
        Scanner sn = new Scanner(System.in);
        Persona objetoTrip = new Persona();
        int SumEdad = 0, con = 0, continuar = 1;
        
        // objeto trip
        
        while(continuar==1){
            System.out.println("\n\n Digite la Edad de la persona: ");
            objetoTrip.asignarEdad(sn.nextInt());
            
            // objeto trip
            con ++;
            SumEdad = (int) (SumEdad + objetoTrip.obtenerEdad());
            System.out.println("");
            
            System.out.println("Desea continuar? 1. Si, 0. No: ");
            continuar = sn.nextInt();
        }
        System.out.println("El promedio de edad de las personas es: " +SumEdad/con);
    }
} // CERRAR CLASS
