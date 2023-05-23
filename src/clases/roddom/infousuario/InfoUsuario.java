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
        f = new File("C://Users//rodri//IdeaProjects//Proyecto//src//Pruebas.txt");
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            System.out.println("Ingrese nombre de usuario");
            nombre = obj.nextLine();
            System.out.println("Ingrese Apellidos del usuario");
            apellidos = obj.nextLine();
            System.out.println("Ingrese correo del usuario");
            correo = obj.nextLine();
            datos = nombre + apellidos + correo;

            wr.write("El Usuario es:  " + datos + "\n");
            bw.write("Creacion");

            wr.close();
            bw.close();
        } catch (IOException e) {};
    }

}
