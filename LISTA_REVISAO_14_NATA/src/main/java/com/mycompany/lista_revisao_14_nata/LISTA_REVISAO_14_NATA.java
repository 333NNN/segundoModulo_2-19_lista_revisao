/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_14_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_14_NATA {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String nome;
        Float salarioAtual;
        Float salarioReajust;
        Float somaSalariosAtuais = 0f;
        Float somaSalariosReajustados = 0f;
        int porcent = 0;

        while (true) {
            System.out.print("Digite o nome do funcionário (ou FIM para sair): ");
            nome = read.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }

            System.out.print("Digite o salário atual de " + nome + ": ");
            salarioAtual = read.nextFloat();
            read.nextLine();

            if (salarioAtual <= 150) {
                salarioReajust = salarioAtual * 1.25f;
                porcent = 25;
            } 
            else if (salarioAtual <= 300) {
                salarioReajust = salarioAtual * 1.20f;
                porcent = 20;
            } 
            else if (salarioAtual <= 600) {
                salarioReajust = salarioAtual * 1.15f;
                porcent = 15;
            } 
            else {
                salarioReajust = salarioAtual * 1.10f;
                porcent = 10;
            }

            System.out.println("Nome: " + nome);
            System.out.printf("Salário Atual: R$ %.2f%n", salarioAtual);
            System.out.printf("Salário Reajustado em ", porcent, ": R$ %.2f%n", salarioReajust);
            System.out.println();

            somaSalariosAtuais += salarioAtual;
            somaSalariosReajustados += salarioReajust;
        }

        System.out.printf("Soma dos Salários Atuais: R$ %.2f%n", somaSalariosAtuais);
        System.out.printf("Soma dos Salários Reajustados: R$ %.2f%n", somaSalariosReajustados);
        System.out.printf("Diferença entre Salários: R$ %.2f%n", somaSalariosReajustados - somaSalariosAtuais);

    }
}
