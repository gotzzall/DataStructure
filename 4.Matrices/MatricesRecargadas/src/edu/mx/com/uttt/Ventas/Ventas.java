package edu.mx.com.uttt.Ventas;

import javax.swing.JOptionPane;

public class Ventas 
{
    Double[][] matriz;
    int filas;
    int columnas;

    public Ventas(int filas, int columnas)
    {
        matriz=new Double[filas][columnas];
        this.filas=filas;
        this.columnas=columnas;
    }

    public void llenar()
    {
        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz[0].length; )
            {

                    matriz[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas"));
                    j++;

                    //JOptionPane.showMessageDialog(null,"Ingrese un valor numerico mayor o igual a 1");
            }
            JOptionPane.showMessageDialog(null, "Siguiente empelado");
        }
    }

    public String imprimirCantiades()
    {
        String imprimir="";

        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz[0].length; j++)
            {
                imprimir+=matriz[i][j];
            }
            imprimir+="\n";
        }
        return imprimir;
    }

    public Double[][] getMatriz()
    {
        return this.matriz;
    }

     public String imprimirCantiades(Double[][] valor)
    {
        String imprimir="";

        for(int i=0; i<valor.length; i++)
        {
            for(int j=0; j<valor[0].length; j++)
            {
                imprimir+=valor[i][j]+" ";
            }
            imprimir+="\n";
        }
        return imprimir;
    }
}
