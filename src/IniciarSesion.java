import clases.roddom.consultas.Consultas;
import clases.roddom.infousuario.InfoUsuario;
import clases.roddom.operaciones.Preactivacion;
import clases.roddom.operaciones.RecargaSaldo;

import java.util.Scanner;

public class IniciarSesion {

    public static void inicioSesion() {
        System.out.println("Acceso aL sistema");
        Scanner datos = new Scanner(System.in);
        int intento, contraseña = 2060, acceso = 0;
        do {
            System.out.println("INGRESA PIN DE SEGURIDAD");
            intento = datos.nextInt();
            if (intento == contraseña) {
                System.out.println("NIP CORRECTO");
                System.out.println("<><><><>BIENVENIDO<><><><>");
                    System.out.println("1. Guardar Usuario 2.Activa tu línea, 3.Recarga Saldo, 4.Consultas");
                    int eleccion = datos.nextInt();
                    switch (eleccion) {
                        case 1 -> {
                            System.out.println("Guardar Usuario");
                            InfoUsuario.registro();
                        }
                        case 2 -> {
                            System.out.println("Activa tu línea");
                            Preactivacion.preactivacion();
                        }
                        case 3 -> {
                            System.out.println("Recarga Saldo");
                            RecargaSaldo.Recarga();
                        }
                        case 4->{
                            System.out.println("Consultas");
                            Consultas.Consultar();
                        }
                        default -> {
                            System.out.println("---INGRESE OPCION CORRECTA---");
                        }
                    }
                    acceso = 3;
                } else{
                    System.out.println("Contraseña incorrecta");
                    acceso = acceso + 1;
                    if (acceso == 3) {
                        System.out.println("¡Accseso restringido!");
                        System.out.println("Supero el limite de intentos");
                    }
                }
            } while (acceso < 3) ;
        }
    }

