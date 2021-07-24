
package fundamentosprogramacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
    Scanner sn = new Scanner(System.in);

    boolean salir = false;
    int option, N, num = 1, i = 1;
    
    while(!salir){
        int result =0;
        System.out.println("Type one number: ");
        N = sn.nextInt();
        
        System.out.println("Main Menu");
        System.out.println("1. Factorial of a number");
        System.out.println("2. Sum of 2i-1, 1-> N");
        System.out.println("3. Exit the program");

        System.out.println("What option do you wanna use?: ");
        option = sn.nextInt();
        
        switch(option){
            case 1: {
                if (N >= 0) {
                    do {
                        num = num * i;
                        i++;
                    } while (i <= N);
                       
                    System.out.println("The factorial of " + N + "is the same as: " + num);
                } else {
                    System.out.println("There's no factorial for Negative Numbers");
                        
                    }
                break;
            }
            case 2:
                for(i=1; i<=N; i++)
                {
                    result = result + ((2*i)-1);
                }
                System.out.println("The Sum of " + N + " is the same as: " + result);
                break;
            case 3:
                salir = true;
                break;
            default:
                System.out.println("The options are between 1 and 3");
        }
    }
    System.out.println("End of the program");
}
}

// buscar public static int //