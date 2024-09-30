/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_15_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_15_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int anoAtual = 0, anoNasc = 0, idade;
        
        System.out.print("Insira o ano atual: ");
        anoAtual = read.nextInt();
        System.out.print("Insira seu ano de nascimento: ");
        anoNasc = read.nextInt();
        
        idade = anoAtual - anoNasc;
        
        System.out.println("Sua idade é: "+ idade);
    }
}
