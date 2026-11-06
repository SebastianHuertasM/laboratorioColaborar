import java.util.Scanner;

public class Ejemplo {

    static void main(){
    Scanner sc = new Scanner(System.in);


        System.out.println("Ingresa (1) para recibir un saludo");
        int saludo = sc.nextInt();


        while (saludo > 0) {
            if (saludo == 1) {
                System.out.println("Mucho Gusto");
                break;
            } else {
                System.out.println("Ingrese 1 para ser saludado");
            }
        }
    }
}
