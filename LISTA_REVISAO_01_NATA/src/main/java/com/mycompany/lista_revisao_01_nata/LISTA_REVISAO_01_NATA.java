/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_01_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class LISTA_REVISAO_01_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, result;

        System.out.println("Insira um número: ");
        n1 = ler.nextInt();
        System.out.println("Insira outro número: ");
        n2 = ler.nextInt();
        result = n1 + n2;
        System.out.println("Soma de " + n1 + " com " + n2 + " = " + result);

    }
}
