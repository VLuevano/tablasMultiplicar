package com.example.tablasMultiplicar;

import java.util.Scanner;

public class Tablas {

    Scanner entrada = new Scanner(System.in);

    public void mostarUnaTabla(int numeroTablas) {
        for (int i = 1; i < 11; i++) {
            System.out.print("[" + numeroTablas * i + "]");
        }
    }

    public void mostarVariasTablas(int numeroTablas) {
        for (int j = numeroTablas; j > 1; j--) {
            for (int i = 1; i < 11; i++) {
                System.out.print("[" + numeroTablas * i + "]");
            }
            System.out.println("");
            numeroTablas = numeroTablas - 1;
        }
    }

    public void mostrarMenu() {
        while (true) {

            System.out.println("Bienvenido\nIngrese su nombre de usuario: ");
            String nombre = entrada.nextLine();

            System.out.println("==Tablas de multiplicar==");
            System.out.println("Hola "+nombre+"\nSeleccione una opción");
            System.out.println("1) Mostrar una tabla \n 2) Mostrar tabla del 2 al 5 \n 3) Salir");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Esta es su tabla: "+nombre);
                    mostarUnaTabla(1);
                    break;
                case 2:
                    System.out.println("Esta son sus tablas: "+nombre);
                    mostarVariasTablas(5);
                    break;
                default:
                    System.out.println("Ingreser una opción válida");
                    System.exit(0);
                    break;
            }
        }
    }

}
