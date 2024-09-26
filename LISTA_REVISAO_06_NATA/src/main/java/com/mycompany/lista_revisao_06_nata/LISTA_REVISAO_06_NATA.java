/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_06_nata;

import java.util.Scanner;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_06_NATA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        boolean check = true;
        int num;
        
        while (check){
           System.out.println("Digite um valor inteiro: ");
           num = ler.nextInt();
           
           if (num == 0){
               System.out.println("Fim do programa");
               check = false;
               
           }
           else if (num > 0) {
               System.out.println(num + " é positivo");
           }
           else {
               System.out.println(num + " é negativo");
           }
        }
    }
}
