/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alto;
        int ancho;

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());

        int area = alto * ancho;
        System.out.println("Área: " + area);
        int perimetro = (alto + ancho) * 2;
        System.out.println("Perímetro: " + perimetro);
    }

}
