package com.example.tablasMultiplicar;

import java.util.Scanner;

public class Tablas {

    Scanner entrada = new Scanner(System.in);

    public void mostarTablas(int numeroTablas) {
        for (int i = 1; i < 11; i++) {
            System.out.println("["+numeroTablas*i+"]");
        }
    }

    public void mostrarMenu() {
        System.out.println("==Seleccione una opción==");
        System.out.println("1) Mostrar una tabla \n 2) Mostrar tabla del 2 al 5 \n 3) Salir");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                mostarTablas(1);
                break;
            case 2:
                mostarTablas(5);
                break;
            default:
                System.out.println("Ingreser una opción válida");
                break;
        }
    }

}
