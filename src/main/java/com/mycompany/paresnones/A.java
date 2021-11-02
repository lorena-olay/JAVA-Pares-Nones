/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.paresnones;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //repositorio
        /*https://github.com/lorena-olay/JAVA-Pares-Nones*/
        //declaramos lo que necesitamos
        Scanner entradateclado = new Scanner(System.in);
        int num1, num2, entero, resto, equipo, equipo1;
        // TODO code application logic here
        //bucle para controlar que no eligan el mismo equipo
        do{
        //elegimos equipos usuario 1
        do {
            System.out.println("Dime el equipo que eliges usuario 1: ");
            System.out.println("1 - Pares");
            System.out.println("2 - Nones");
            equipo = entradateclado.nextInt();
        } while (!(equipo == 1 || equipo == 2));
        //elegimos equipos usuario 2
        do {
            System.out.println("Dime el equipo que eliges usuario 2: ");
            System.out.println("1 - Pares");
            System.out.println("2 - Nones");
            equipo1 = entradateclado.nextInt();
        } while (!(equipo1 == 1 || equipo1 == 2));
        }while(equipo == equipo1);
        //bucle del primer número
        do {
            System.out.println("Dame el número usuario 1");
            num1 = entradateclado.nextInt();
            if (!(0 < num1 || 10 > num1)) {
                System.out.println("solo trabajamos con números positivos entre el 0 y el 10");
            }
        } while (!(0 < num1 || 10 > num1));
        //bucle del segundo número
        do {
            System.out.println("Dame el número usuario 2");
            num2 = entradateclado.nextInt();
            if (!(0 < num2 || 10 > num1)) {
                System.out.println("solo trabajamos con números positivos entre el 0 y el 10");
            }
        } while (!(0 < num2 || 10 > num2));
        //operaciones para averiguar si es par o impar
        entero = num1 + num2;
        resto = entero % 2;
        //condicion para mostrar al usuario el resultado del juego
        if (resto == 0 && equipo == 1) {
            System.out.println("HAS GANADO CON PARES! Muy bien usuario 1");
        } else if (!(resto == 0) && equipo == 2) {
            System.out.println("HAS GANADO CON NONES! Muy bien usuario 1");
        } else if (resto == 0 && equipo1 == 1) {
            System.out.println("HAS GANADO CON PARES! Muy bien usuario 2");
        } else if (!(resto == 0) && equipo1 == 2) {
            System.out.println("HAS GANADO CON NONES! Muy bien usuario 2");
        } else {
            System.out.println("Que mal, has perdido. Ha ganado el equipo contrario");
        }

    }

}
