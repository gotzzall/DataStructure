package edu.mx.uttt.Arreglos;

import javax.swing.JOptionPane;

/**
 * Operaciones
 */
public class Operaciones {

    private int tamanio;
    private int [] arreglos;

    public Operaciones(int tamanio)
    {
        arreglos = new int[tamanio];
    }

    public void imprimir()
    {
        for (int i = 0; i < this.arreglos.length; i++)
        {
            System.out.print(arreglos[i]+" | ");
        }
    }
    public void llenarArreglo()
    {
        int i = 0;
        while(i < arreglos.length)
        {
            arreglos[i] = solicitarValor();
            i++;
        }
    }
    private int solicitarValor()
    {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor"));
    }
}