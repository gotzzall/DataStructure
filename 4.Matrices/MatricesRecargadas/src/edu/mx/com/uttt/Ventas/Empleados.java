package edu.mx.com.uttt.Ventas;

import java.util.regex.Pattern;
import javax.imageio.ImageReadParam;
import javax.swing.JOptionPane;

public class Empleados extends Arrelgos
{
    private String[] nombres;
    private int longitud;
    
    public Empleados(int longitud)
    {
        super();
        Object[] arreglo = super.getArreglo();
        arreglo[0] = new String[longitud];
        nombres = (String[])arreglo[0];
        this.longitud=longitud;
    }

    public void agregarNombres()
    {
          String regex = "^[a-zA-Z]+$";
            for(int i=0; i<nombres.length; )
            {
                //boolean matches = Pattern.matches(regex, JOptionPane.showInputDialog("Ingresa un nombre"));

                    nombres[i]=JOptionPane.showInputDialog(null, "ingrese los nombres");
                    i++;

                    //JOptionPane.showMessageDialog(null, "Ingrese el nombre de forma correcta");
            }   
    }

    public String imprimirNombres()
    {
        String imprimir="";
        for(int i=0; i<nombres.length; i++)
        {
            imprimir+=nombres[i]+"\n";
        }
        return imprimir;
    }

    public String[] getNombre()
    {
        return this.nombres;
    }

    public int getlongitud()
    {
        return this.longitud;
    }
}
