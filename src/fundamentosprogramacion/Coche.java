
package fundamentosprogramacion;

    // sout para que aparezca System.out.println//
    // para anotaciones en una sola linea
    /* */ //para anotaciones en mas de una linea
    // final int = es para colocar una constante y que nunca cambie
    
    /* VARIABLES
    long = 64
    int = 32
    short = 16 
    byte = 8 -128 a 127
    
    decimales como 3,1416: es mejor siempre ponerlo con coma
    double = 64
    float = 32 \ siempre se coloca float decimal = 3,1416f;
    
    TIPO CARACTER
    cadena / cadena = sn.nextline();
    char caracter = 'a'
    boolean decision = true;
    
    */ 




/* PROGRAMACION ORIENTADA A OBJETOS

    ATRIBUTOS: CUESTIONES
    METODOS: ACCIONES

        EJEMPLO DE CARRO:
        ATRIBUTOS: COLOR, MARCA, KM.
        METODOS: ENCENDER(), ACELERAR(), FRENAR()

los constructores son los unicos   QUE NO SE LES COLOCA VOID O INT
    public (nombre de la clase)

*/

public class Coche{
    //Atributos
    String color;
    String marca;
    int km;
    
    //metodo
   public static void main(String [] args) {
       Coche coche1 = new Coche();
       
       coche1.color = "blanco";
       coche1.marca = "audi";
       coche1.km = 0;
       
       System.out.println("El color del coche es: " +coche1.color);   
       System.out.println("La marca del coche es: " +coche1.marca);
       System.out.println("Los kilometros del coche son: " +coche1.km);
   } 
    
}

