/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.paresnones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradateclado = new Scanner(System.in);
        int num1, num2, entero, resto;
        Random numAleatrio = new Random();
        // TODO code application logic here
        do
        {
            System.out.println("Dame el primer número");
            num1 = entradateclado.nextInt();
            if(!(0<num1)){
                System.out.println("solo trabajamos con números positivos");
            }
        }while(!(0 < num1));
        
        do{
            System.out.println("Dame el segundo número");
            num2 = numAleatrio.nextInt();
            System.out.println(num2);
            if(!(0<num2)){
                System.out.println("solo trabajamos con números positivos");
            }
        }while(!(0 < num2));
        
        entero = num1 + num2;
        resto = entero % 2;
        if (resto == 0) {
            System.out.println("pares");
        } else {
            System.out.println("nones");
        }
    }
    
}
