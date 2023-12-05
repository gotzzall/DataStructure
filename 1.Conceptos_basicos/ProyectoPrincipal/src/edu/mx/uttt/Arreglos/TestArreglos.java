package edu.mx.uttt.Arreglos;

import javax.swing.JOptionPane;

public class TestArreglos {
    public static void main(String[] args) {
        String tamanio = JOptionPane.showInputDialog(null, "Introduce el tamaño del arrglo");
        if (validadValor(tamanio)) 
        {
            Operaciones obj = new Operaciones(Integer.parseInt(tamanio));
            obj.llenarArreglo();
            obj.imprimir();
        }
        System.out.println("Lo siento");
    }

    public static boolean validadValor(String tamanio)
    {
        try 
        {
            Integer.parseInt(tamanio);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }
}
