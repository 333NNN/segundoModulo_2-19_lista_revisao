/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_10_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_10_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite o valor de N (entre 0 e 50): ");
            n = read.nextInt();
        } 
        while (n < 0 || n > 50);

        float[] a = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número real para A[" + i + "]: ");
            a[i] = read.nextFloat();
        }

        float[] neg = new float[n];
        float[] pos = new float[n];
        int countNeg = 0, countPos = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                neg[countNeg] = a[i];
                countNeg++;
            } 
            else {
                pos[countPos] = a[i];
                countPos++;
            }
        }

        System.out.println("Vetor NEG (valores negativos):");
        for (int i = 0; i < countNeg; i++) {
            System.out.print(neg[i] + " ");
        }
        System.out.println("\nQuantidade de valores negativos: " + countNeg);

        System.out.println("Vetor POS (valores positivos e zero):");
        for (int i = 0; i < countPos; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println("\nQuantidade de valores positivos e zero: " + countPos);
    }
}
