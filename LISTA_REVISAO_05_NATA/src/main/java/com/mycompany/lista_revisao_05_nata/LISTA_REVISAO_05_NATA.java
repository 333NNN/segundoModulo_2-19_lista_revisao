/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_05_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_05_NATA {

    public static void main(String[] args) throws IOException {
        String nome = "";
        float peso = 0f;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do lutador: ");
        nome = ler.nextLine();
        System.out.println();
        System.out.println("Informe o peso do lutador: ");
        peso = ler.nextFloat();
        String nomeArquivo = "Lutador";

        try (FileWriter arquivo = new FileWriter("C:\\Users\\Nata e Julia\\Desktop\\" + nomeArquivo + nome + ".txt"); 
            PrintWriter gravar = new PrintWriter(arquivo)) {

            if (peso < 65.0) {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Pena.");
            } 
            else if (peso >= 65.0 && peso < 72.0) {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Leve.");
            } 
            else if (peso >= 72.0 && peso < 79.0) {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Ligeiro.");
            } 
            else if (peso >= 79.0 && peso < 86.0) {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Meio médio.");
            } 
            else if (peso >= 86.0 && peso < 93.0) {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Médio.");
            } 
            else if (peso >= 93.0 && peso < 100) {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Médio Pesado.");
            } 
            else {
                gravar.println("O(A) lutador(a) " + nome + " pesa " + peso + " kg e se enquadra na categoria Pesado.");
            }
            System.out.println("Arquivo para o lutador " + nome + " gerado com sucesso!");
        } 
        catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());
        }
    }
}
