/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista_revisao_13_nata;

/**
 *
 * @author Nata e Julia
 */
public class LISTA_REVISAO_13_NATA {

    public static void main(String[] args) {

        int cont = 0;

        for (int i = 150; i <= 300; i++) {
            System.out.print(i + " ");

            cont++;
            if (cont == 10) {
                System.out.println();
                cont = 0;
            }
        }
        if (cont > 0) {
            System.out.println();
        }
    }
}
