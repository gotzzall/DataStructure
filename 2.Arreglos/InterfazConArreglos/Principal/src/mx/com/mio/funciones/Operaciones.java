/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mio.funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.gos
 */
public class Operaciones {

   
    
    private int [] arreglos;

    public int tamanio()
    {
        return arreglos.length;
    }
    
    public String toString(String valor, String resultado) 
    {
        return "Vector1: "+this.imprimir()+"\nVector2: "+valor+"\nResultado: "+resultado;
    }
    
    public int[] getArreglos() 
    {
        return arreglos;
    }

    public void setArreglos(int[] arreglos)
    {
        this.arreglos = arreglos;
    }

    public Operaciones(int tamanio)
    {
        arreglos = new int[tamanio];
    }

    public String imprimir()
    {
        String pila = "";
        for (int i = 0; i < this.arreglos.length; i++)
        {
            pila += arreglos[i]+" | ";
        }
        return pila;
    }
    public String imprimir(int[] valor)
    {
        String pila = "";
        for (int i = 0; i < valor.length; i++)
        {
            pila += valor[i]+" | ";
        }
        return pila;
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
    public int sumar()
    {
        int suma = 0;
        for (int i = 0; i < arreglos.length; i++)
        {
            suma += arreglos[i];
        }
        return suma;
    }
    public int valorMayor()
    {
        int mayor = 0;
        for (int i = 0; i < arreglos.length; i++)
        {
            if(mayor < arreglos[i])
            {
                mayor = arreglos[i];
            }
        }
        return mayor;
    }
    private boolean numerosPrimos(int n)
    {
        int contador = 0;
        for(int i = 1; i <= n; i++)
        {
            if (n%i == 0)
            {
                contador++;
            }
        }
        return contador == 2;
        
    }
    public int contadorNumerosPrimos()
    {
        int contador = 0;
        for(int i = 0; i < arreglos.length; i++)
        {
            if(numerosPrimos(arreglos[i]))
            {
                contador ++;
            }
        }
        return contador;
    }
    public  String sumaVectores(int[] valor)
    {
        int[] resultado = new int[valor.length];
        for(int i = 0; i < valor.length; i++)
        {
            resultado[i] = valor[i]+arreglos[i];
        }
        return imprimir(resultado);
    }
    public int encontrarNumero()
    {
        int numero = this.solicitarNumero();
        for(int i = 0; i < arreglos.length; i++)
        {
            if(arreglos[i] == numero)
            {
                return i;
            }
        }
        return -1;
    }
    private int solicitarNumero()
    {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número a buscar"));
    }
    
    public void copy(int[] copy){
        
        for(int i=0; i<copy.length; i++)
        {
            this.arreglos[i]=copy[i];
        }
        
    }
    
    public String busquedaSecuencial()
    {
        int buscador=-1;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));
        
        for(int i=0; i<arreglos.length; i++)
        {
            if(arreglos[i] == numero)
            {
                buscador=i+1;
            }
        }
        if(buscador == -1)
        {
            return "No se encontró el número";
        }
        else
        {
            return "Esta en el espacio"+Integer.toString(buscador);
        }
        
    }
    
    public void burbujaAscendente()
    {
        int indicador=0;
        
        do
        {
            for (int i=0; i<(arreglos.length-1); i++)
            {
                indicador=0;
                
                if (arreglos[i]>arreglos[i+1])
                {
                    int respaldo=arreglos[i+1];
                    arreglos[i+1]=arreglos[i];
                    arreglos[i]=respaldo;
                    indicador++;
                }
            }
        }
        while(indicador != 0);
    }
    
    public void burbujaDescendente()
    {
        int indicador=0;
        
        do
        {
            for (int i=0; i<(arreglos.length-1); i++)
            {
                indicador=0;
                
                if (arreglos[i]<arreglos[i+1])
                {
                    int respaldo=arreglos[i+1];
                    arreglos[i+1]=arreglos[i];
                    arreglos[i]=respaldo;
                    indicador++;
                }
            }
        }
        while(indicador != 0);
    }
}
