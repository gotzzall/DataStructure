package edu.mx.com.uttt.Ventas;

public class Operaciones 
{
    Double[] resutlado;

    public Operaciones(int longitud)
    {
        resutlado = new Double[longitud];
    }

    public void suma(Double[][] valor)
    {
        
        for(int i=0; i<valor.length; i++)
        {
            double suma=0.0;
            for(int j=0; j<valor[0].length; j++)
            {
                suma+=valor[i][j];
            }
            resutlado[i]=suma;
        }
    }

    public String imprimir()
    {
        String imprimir="";
        for(int i=0; i<resutlado.length; i++)
        {
            imprimir+=this.resutlado[i]+"     ";
        }
        return imprimir;
    }
}
