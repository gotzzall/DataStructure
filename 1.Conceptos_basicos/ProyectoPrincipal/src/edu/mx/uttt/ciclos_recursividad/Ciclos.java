/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.ciclos_recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.gos
 */
public class Ciclos {

    public static void factorialFor() {
        boolean flag = true;
        do {
            try {
                int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número a calcular"));

                long numero = 1;
                if (n > 0) {

                    for (int i = 1; i <= n; i++) {
                        numero *= i;
                    }

                }

                JOptionPane.showMessageDialog(null, "El factoria es: " + numero);
                flag = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido");
            }
        } while (flag);
    }
}
