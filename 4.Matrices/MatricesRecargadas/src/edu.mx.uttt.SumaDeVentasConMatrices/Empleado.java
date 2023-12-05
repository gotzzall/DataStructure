import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

import edu.mx.uttt.matrices.Persona;

public class Empleado
{
    String[] vecto;

    public Empleado(int tamanio)
    {
        vecto = new String[tamanio];
    }

    public void llenarNombre()
    {
        for(int i=0; i<vecto.length; i++)
        {
            vecto[i]=JOptionPane.showInputDialog(null, "Ingresa el valor");
        }

    }

    public String getNombres()
    {
        String valor="";

        for(int i=0; i<vecto.length; i++)
        {
            valor+= vecto[i]+"\n";
        }

        return valor;
    }
}