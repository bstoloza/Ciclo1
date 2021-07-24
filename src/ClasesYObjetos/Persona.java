/* Hacer un Algoritmo en JAVA que permita calcular la edad promedio de los
tripulantes de un curso de Misión TIC 2022. Aplicar POO (Constructores).

Para N Tripulantes.

CLASE: persona, promedio POO
ATRIBUTO: edad, promedio, n
Metodo: calcular, constructor, asignar edad, obtener edad


**********************
        PERSONA
**********************
edad

**********************
----------------------
constructor
asignarEdad
obtenerEdad
**********************
        PROMEDIO
**********************
promedio
n
----------------------
main
**********************


*/
package ClasesYObjetos;


public class Persona {
    // ATRIBUTOS
    
    public int edad;
    // METODO constructor

    public Persona(int edad) {
        this.edad = edad;
    }
    
    public Persona()
    {
    }
            
    public void asignarEdad(int edad) {
        this.edad = edad;
    }
    
    public float obtenerEdad()
    {
        return this.edad;
    }
    
}
    
    
