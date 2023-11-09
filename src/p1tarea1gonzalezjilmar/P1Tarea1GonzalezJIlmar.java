
package p1tarea1gonzalezjilmar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Nombre: Jilmar Gonzalez
 * Fecha: 08/11/2023
 * Materia: POO
 */
public class P1Tarea1GonzalezJIlmar {

    
    public static void mostrarOrden(int[] numeros){
    System.out.println("\nNumeros ordenados: " + Arrays.toString(numeros));
    }
    
    public static void quickSort(int[] numeros, int primero, int ultimmo){

        int central, i, j, pivote;

        central = primero + (ultimmo - primero) / 2;

        pivote = numeros[central];

        i = primero;
        j = ultimmo;

        do{
          while(numeros[i] < pivote) i++;
          while(numeros[j] > pivote) j--;
          if(i <= j){
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
            i++;
            j--;
          }
        }while(i <= j);

        if(primero < j){
          quickSort(numeros, primero, j);
        }
        if(i < ultimmo){
          quickSort(numeros, i, ultimmo);
        }
    }
    
    public static void main(String[] args) {
        
         Scanner a = new Scanner(System.in);

        int digito = 0;

        System.out.print("\nCuantos numeros quieres en el arreglo: ");
        while(!a.hasNextInt()){
            System.out.println("Por favor, ingresa un numero entero");
            a.next();
            System.out.print("\nCuantos numeros quieres en el arreglo: ");
        }
        digito = a.nextInt();

        int[] numeros = new int[digito];
        
        System.out.println("");

        for(int i=0; i<digito; i++){
          System.out.print("Numero [" + i + "] = ");
          while (!a.hasNextInt()) {
            System.out.println("Por favor, ingresa un numero entero");
            a.next();
            System.out.print("Numero [" + i + "] = ");
          }
          numeros[i] = a.nextInt();
        }

        int so = (0 + numeros.length - 1) / 2;

        System.out.println("\ndasf  " + so);
        System.out.println("dasf  " + (numeros.length - 1));

        System.out.println("\nNumeros sin ordenar: " + Arrays.toString(numeros));

        quickSort(numeros, 0, (digito - 1));

        mostrarOrden(numeros);
        
        System.out.println("");

    }
    
}
