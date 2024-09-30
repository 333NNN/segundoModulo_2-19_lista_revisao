/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_16_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_16_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
        int numFuncionarios = read.nextInt();

        float[] salarios = new float[numFuncionarios];
        float somaSalarios = 0;

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.printf("Digite o salário do funcionário %d: ", i + 1);
            salarios[i] = read.nextFloat();
            somaSalarios += salarios[i];
        }

        float media = somaSalarios / numFuncionarios;
        System.out.printf("A média salarial é: %.2f%n", media);

        int contadorAcimaMedia = 0;
        for (float salario : salarios) {
            if (salario > media) {
                contadorAcimaMedia++;
            }
        }

        System.out.printf("Número de funcionários com salário acima da média: %d%n", contadorAcimaMedia);
    }
}
