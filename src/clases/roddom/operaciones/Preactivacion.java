package clases.roddom.operaciones;

import java.util.Scanner;

public class Preactivacion {
    static Scanner scanner = new Scanner(System.in);
    static int lada, numero1, numero2, numero3, numero4;


    public static void preactivacion() {

        System.out.println("Ingrese la lada");
        lada = scanner.nextInt();

        numero1 = (int) (Math.random() * 8);
        numero2 = (int) (Math.random() * 8);
        numero3 = (int) (Math.random() * 8);
        numero4 = (int) (Math.random() * 8);


        System.out.println("El numero es:");
        System.out.print(lada);
        System.out.print(numero1);
        System.out.print(numero2);
        System.out.print(numero3);
        System.out.print(numero4);

        String dato;
        System.out.println("¿Requiere el saldo de su línea?");
        dato = scanner.nextLine();
    }
}




