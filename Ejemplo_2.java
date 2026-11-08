package Trabajo_4_GITHUB.laboratorioColaborar;

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
        System.out.println("Modificacion de codigo para generar conflicto");
        if (saludo <= 100){
            System.out.println("El numero introducido esta entre los primeros 100 numeros");
        } else {
            System.out.println("su numero no esta del 1 al 100");
        }
    }
}
