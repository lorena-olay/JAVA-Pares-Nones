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
        //declaramos lo que necesitamos
        Scanner entradateclado = new Scanner(System.in);
        int num1, num2, entero, resto;
        // TODO code application logic here
        //bucle del primer número
        do {
            System.out.println("Dame el primer número");
            num1 = entradateclado.nextInt();
            if (!(0 < num1)) {
                System.out.println("solo trabajamos con números positivos");
            }
        } while (!(0 < num1));
        //bucle del segundo número
        do {
            System.out.println("Dame el segundo número");
            num2 = entradateclado.nextInt();
            if (!(0 < num2)) {
                System.out.println("solo trabajamos con números positivos");
            }
        } while (!(0 < num2));
        //operaciones para averiguar si es par o impar
        entero = num1 + num2;
        resto = entero % 2;
        //condicion para mostrar al usuario el resultado del juego
        if (resto == 0) {
            System.out.println("pares");
        } else {
            System.out.println("nones");
        }

    }

}
