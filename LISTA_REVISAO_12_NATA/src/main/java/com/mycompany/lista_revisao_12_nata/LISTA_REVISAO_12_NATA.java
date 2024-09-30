/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_12_nata;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_12_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random aleat = new Random();

        int n = 0, x;
        
        while (n <= 0 || n > 50) {
            System.out.print("Digite um número N (entre 0 e 50): ");
            n = read.nextInt();
        }
        
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = aleat.nextInt(101); 
        }

        System.out.println("Vetor gerado:");
        System.out.print("[ ");
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        while (true) {
            System.out.print("Digite um número X para pesquisar e eliminar do vetor (ou -1 para sair): ");
            x = read.nextInt();

            if (x == -1) {
                break;
            }

            int count = 0;
            for (int num : v) {
                if (num == x) {
                    count++;
                }
            }

            if (count > 0) {
                int[] novoVetor = new int[v.length - count];
                int index = 0;
                for (int num : v) {
                    if (num != x) {
                        novoVetor[index++] = num;
                    }
                }

                v = novoVetor;

                System.out.println("Número " + x + " removido. Vetor atualizado:");
                for (int num : v) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } 
            else {
                System.out.println("Número " + x + " não encontrado.");
            }
        }
    }
}
