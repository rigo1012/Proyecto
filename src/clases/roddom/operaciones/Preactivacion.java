package clases.roddom.operaciones;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Preactivacion {


    public static void preactivacion() {
        {
            Scanner scanner = new Scanner(System.in);
            int lada, numero1, numero2, numero3, numero4, numero5, numero6, numero7;
            File f ;
            try{
                f = new File("registroactivacion.txt");

                if(f.createNewFile()){

                }else {

                    PrintWriter wr = new PrintWriter("registroactivacion.txt","UTF-8");


                    System.out.println("Ingrese la lada");
                    lada = scanner.nextInt();

                    numero1 = (int) (Math.random() * 8);
                    numero2 = (int) (Math.random() * 8);
                    numero3 = (int) (Math.random() * 8);
                    numero4 = (int) (Math.random() * 8);
                    numero5 = (int) (Math.random() * 8);
                    numero6 = (int) (Math.random() * 8);
                    numero7 = (int) (Math.random() * 8);


                    System.out.println("El numero es:");
                    System.out.print("Con lada: " + lada+ " " + numero1 + numero2 + numero3 + " " + numero4 + numero5 + " " + numero6+numero7);


                    wr.write("El numero es: " + lada +" "+ numero1+numero2+numero3+" "+numero4+numero5+" "+numero6+numero7);
                    wr.close();
                }

            }catch (IOException e) {
                System.out.println(e);
            };
        }
    }
}




