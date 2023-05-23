package clases.roddom.operaciones;

import java.util.Scanner;

public class RecargaSaldo {

    float monto;
    int recarga, numeroRecarga;

    public RecargaSaldo() {
    }

    public RecargaSaldo(float monto, int recarga) {
        this.monto = monto;
        this.recarga = recarga;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    /*public static void recarga(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu número a recargar");
         int numeroRecarga = scanner.nextInt();
    }*/

    public static void Recarga() {
        String numero = "";
        int opt = 0;
        int a = 0;
        int opt1;
        int opcion;

        Scanner Leer = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de recargas");
        System.out.println("Ingrese el numero de telefono");
        numero = Leer.nextLine();
        a = numero.length();//Valida o asigana el tamaño de la
        if (a == 10) {
            System.out.println("++++++++++");
            do {
                System.out.println("1.- Telcel");
                System.out.println("2.- Movistar");
                System.out.println("3.- AT&T");
                System.out.println("4.- Salir");
                System.out.println("Ingrese No. de la opcion");
                opt = Leer.nextInt();
                switch (opt) {
                    case 1 -> {
                        System.out.println("--Telcel--");
                        do {
                            System.out.println("1.- recarga de 10");
                            System.out.println("2.- recarga de 20");
                            System.out.println("3.- recarga de 50");
                            System.out.println("4.- recarga de 100");
                            System.out.println("5.          -- SALIR--");
                            System.out.println("Ingrese No. de una opcion");
                            opt1 = Leer.nextInt();
                            switch (opt1) {
                                case 1 -> {
                                    System.out.println("RECGARGA $10 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 2 -> {
                                    System.out.println("RECGARGA $20 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 3 -> {
                                    System.out.println("RECGARGA $50 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 4 -> {
                                    System.out.println("RECGARGA $100 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                            }
                        } while (opt1 != 5);
                    }
                    case 2 -> {
                        System.out.println("--MOVISTAR--");
                        do {
                            System.out.println("1.- recarga de 10");
                            System.out.println("2.- recarga de 20");
                            System.out.println("3.- recarga de 50");
                            System.out.println("4.- recarga de 100");
                            System.out.println("5.- Salir");
                            System.out.println("Ingrese No. de una opcion");
                            opt1 = Leer.nextInt();
                            switch (opt1) {
                                case 1 -> {
                                    System.out.println("RECGARGA $10 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 2 -> {
                                    System.out.println("RECGARGA $20 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 3 -> {
                                    System.out.println("RECGARGA $50 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 4 -> {
                                    System.out.println("RECGARGA $100 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                            }
                        } while (opt1 != 5);
                    }
                    case 3 -> {
                        System.out.println("--AT&T--");
                        do {
                            System.out.println("1.- recarga de 10");
                            System.out.println("2.- recarga de 20");
                            System.out.println("3.- recarga de 50");
                            System.out.println("4.- recarga de 100");
                            System.out.println("5.- Salir");
                            System.out.println("Ingrese No. de una opcion");
                            opt1 = Leer.nextInt();
                            switch (opt1) {
                                case 1 -> {
                                    System.out.println("RECGARGA $10 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 2 -> {
                                    System.out.println("RECGARGA $20 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 3 -> {
                                    System.out.println("RECGARGA $50 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                                case 4 -> {
                                    System.out.println("RECGARGA $100 AL NUMERO:" + numero);
                                    System.out.println("Tienes 20mb, 30sms, un dia de llamadas ilimitadas");
                                }
                            }
                        } while (opt1 != 5);
                    }
                }
            } while (opt != 4);
        } else {
            System.out.println("INGRESE NUMERO TELEFONICO A 10 DIGITOS");
        }


    }
}
