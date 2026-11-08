package laboratorioColaborar;

import java.util.Scanner;

public class Ejemplo {

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
    }
}
