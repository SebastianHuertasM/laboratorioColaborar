package laboratorioColaborar;

import java.util.Scanner;

public class Ejemplo_2 {

    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa (1) para recibir un saludo");
        System.out.println("Ingresa (2) para decir adios");
        System.out.print("Introduzca su opción: ");
        int saludo = sc.nextInt();

        while (saludo > 0) {
            if (saludo == 1) {
                System.out.println("Mucho Gusto");
                break;
            } else if (saludo == 2) {
                System.out.println("Hasta luego");
                break;
            }
        }

        // --- LÍNEAS 26 A 31 MODIFICADAS PARA EL CONFLICTO ---
        System.out.println("Validación alternativa hecha por el usuario 2");
        if (saludo > 0 && saludo <= 50) {
            System.out.println("El número introducido está en el rango de 1 a 50");
        } else {
            System.out.println("El número NO está entre 1 y 50");
        }
    }
}
