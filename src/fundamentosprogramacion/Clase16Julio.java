package fundamentosprogramacion;

import java.util.Scanner;

/* Hacer un Algoritmo en JAVA que me solicite datos flotantes para un
vector 2X2 y me almacene en un vector unidimensional de longitud 2,
los promedios de los números de cada fila del vector Bidimensional */

public class Clase16Julio {
    public static void main(String[] args) {  
    Scanner sn = new Scanner(System.in);
    int length = 2, i, j, fil = 2, col = 2;
    float[] averages = new float[length];
    float[][] vecValues = new float [fil][col];
    float acumValues = 0;
    
    for (i = 0; i < fil; i++) {
        for (j = 0; j < col; j++) {
            System.out.println("Type the value for the vecValues[" + i + "] [" + j + "]: ");
            vecValues[i][j] = sn.nextInt();
        }
    }
    
    for (i = 0; i < fil; i++) {
        for (j = 0; j < col; j++) {
            acumValues = acumValues + vecValues[i][j];
        }
        averages[i] = (acumValues / j);
        acumValues = 0;
    }
    for (i = 0; i < length; i++) {
        System.out.println("averages [" + i + "]: " + averages[i]);
    }
}
}

