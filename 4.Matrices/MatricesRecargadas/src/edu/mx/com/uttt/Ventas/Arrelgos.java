package edu.mx.com.uttt.Ventas;

import javax.swing.JOptionPane;

public abstract class Arrelgos {

    private Object[]    arreglo;
    private int         longitud;

    public Arrelgos()
    {
        this.arreglo=new Object[1];
    }

    public Object[] getArreglo()
    {
        return this.arreglo;
    }

    public int getlongitud()
    {
        return this.longitud;
    }

    public String imprimir(String[] valor)
    {
        String resutlado="";

        for(String var:valor)
        {
            resutlado+=var+" ";
        }

        return resutlado;
    }
}
