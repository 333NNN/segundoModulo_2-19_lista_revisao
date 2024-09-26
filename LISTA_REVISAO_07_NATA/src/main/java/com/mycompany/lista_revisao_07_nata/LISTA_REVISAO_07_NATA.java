/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_07_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_07_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, qntd = 0, soma = 0;
        float media = 0;
        boolean check = false;

        while (!check) {
            System.out.println("Digite um valor inteiro (ou 0 para encerrar): ");
            num = ler.nextInt();

            if (num <= 0) {
                if (qntd == 0) {
                    System.out.println("Nenhum valor válido foi inserido.");
                } 
                else {
                    media = (float) soma / qntd; 
                    System.out.println("O maior valor é: " + maior);
                    System.out.println("O menor valor é: " + menor);
                    System.out.println("Quantidade de valores: " + qntd);
                    System.out.println("A soma dos valores é: " + soma);
                    System.out.println("A média dos valores é: " + media);
                }
                check = true; 
            } 
            else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
                qntd++;
                soma += num;
            }
        }
    }
}
