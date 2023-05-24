package clases.roddom.infousuario;

import java.io.*;
import java.util.Scanner;

public class InfoUsuario {

    public static void registro(){
        Scanner obj=new Scanner(System.in);
        String nombre;
        String apellidos;
        String correo;
        String datos;
        File f ;
        try{
            f = new File("registrousuario.txt");

            if(f.createNewFile()){

            }else {

                PrintWriter wr = new PrintWriter("registrousuario.txt","UTF-8");


                System.out.println("Ingrese nombre de usuario");
                nombre = obj.nextLine();
                System.out.println("Ingrese Apellidos del usuario");
                apellidos = obj.nextLine();
                System.out.println("Ingrese correo del usuario");
                correo = obj.nextLine();
                datos = nombre + " " + apellidos + " " + correo;

                wr.write("Usuario:" + " " + datos + "\n");

                wr.close();
            }

            }catch (IOException e) {
            System.out.println(e);
        };
    }

}
