/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_08_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_08_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int total = 0, cont = 0, x, min, max;

        System.out.print("Digite o valor mínimo: ");
        min = read.nextInt();

        System.out.print("Digite o valor máximo: ");
        max = read.nextInt();

        if (min > max) {
            System.out.println("O valor mínimo é maior que o valor de máximo! Invertendo os valores.");
            int temp = min;
            min = max;
            max = temp;
        }

        do {
            System.out.print("Digite um valor para X (ou 0 para sair): ");
            x = read.nextInt();

            if (x != 0) {
                if (x >= min && x <= max) {
                    total += x;
                    cont++;
                } 
                else {
                    System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalização.");
                }
            }
        } 
        while (x != 0);

        System.out.println("Total de valores digitados no intervalo [" + min + ", " + max + "]: " + total);
        System.out.println("Quantidade de valores digitados no intervalo: " + cont);
    }
}
