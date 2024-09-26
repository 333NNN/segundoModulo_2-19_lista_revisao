/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_04_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_04_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Vamos formar um triângulo!");
        System.out.println("Insira o valor de um lado: ");
        n1 = ler.nextInt();
        System.out.println("Insira o valor de outro lado: ");
        n2 = ler.nextInt();
        System.out.println("Insira o valor do último lado: ");
        n3 = ler.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("O triângulo é equilátero.");
        } 
        else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("O triângulo é isósceles.");
        } 
        else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
