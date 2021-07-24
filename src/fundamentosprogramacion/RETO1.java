/*
Hacer un Algoritmo en Java (Utilizar esta clase) que almacene las calificaciones de los periodos Academicos de las asignaturas de 
un estudiante del colegio HighSchool.  Las asignaturas son:

1. Matemàticas
2. Ciencias
3. Ingles
4. Informática
5. Deportes

La escala de calificación es en porcentaje 0 a 100.

El programa permite realizar 4 opciones al usuario a través de un menú:

1. Cargar calificaciones Estudiante.
2. Imprimir Boletin (Todas las Asignaturas)
3. Imprimir Estado  Asignatura (Ver calificaciones de la Asignatura seleccionada)
4. Salir

 */

package fundamentosprogramacion;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;


public class RETO1 {


public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
        // definir variables
    boolean salir = false;
    int menu;
    int[][] uploadgrades;
    
    // desarrollo del Algoritmo (llamado de funciones con switch)
    while(!salir){
        
        menu = Menu();
           
        switch(menu){
            case 1: {
                uploadgrades = UploadGrades();
                break;
            }
            case 2: {
                
                break;
            }
            case 3: {
                
                break;
            }
            case 4: {
                salir = true;
                break;
            }
        }
    }
} // cierra metodo Main

// Definir Función Menú
public static int Menu(){
    Scanner sn = new Scanner(System.in);
    int option;
    System.out.println("--------------------------------");
    System.out.println("            MINTIC 2021");
    System.out.println("--------------------------------");
    System.out.println("             Main Menu");
    System.out.println("--------------------------------");
    System.out.println("1. Upload Student grades.");
    System.out.println("2. Print Bulletin (All Subjects)");
    System.out.println("3. Print Subject Status");
    System.out.println("4. Exit the program");
    System.out.println("--------------------------------");

    System.out.println("What option do you wanna use?: ");
    option = sn.nextInt();
    return option;
} // cierra metodo Menu

public static void Dictionary(){
    Map<Integer, String> subject = new TreeMap();
    subject.put(0, "Math");
    subject.put(1, "Sciences");
    subject.put(2, "English");
    subject.put(3, "Computer class");
    subject.put(4, "Sports");
}

// Función Cargar Calificaciones (Usar Vector Bidimensional
 public static int[][] UploadGrades() {
    Scanner sn = new Scanner(System.in);
    int row = 5, column = 4;
    int Notes[][] = new int [row][column];
    Map<Integer, String> subject = new TreeMap();
    Dictionary();
    int i,j,k;
    for(i=0; i<row; i++){
        k = 1;
        for(j=0; j<column; j++){
            System.out.println("Please type the note " +k+ " (0 to 100) for the subjet: " + subject.get(i) );
            Notes[i][j] = sn.nextInt();
            k = k + 1;
        }
    }
    return Notes;
 }    // cierra metodo Matriz

// Definir Función Imprimir Boletin
    

// Definir Función Estado Asignatura//


} // cierra la clase
