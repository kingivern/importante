 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5_1;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class JavaApplication5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valores[] = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100 + 1);
            int suma = 0;
            for (int valor =0; i<=valores.length; i++) {
                suma += valor;

            }
            System.out.println("la suma de los valores aleatorios es" + suma);
        }

    }

}
