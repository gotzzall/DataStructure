/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author mr.gos
 */
public class ColasVector {
    private double[] vector;
    private int tamanio;
    private int apuntador; // i
    private int deleteApuntador; // j
    
    public int getApuntador()
    {
        return this.apuntador;
    }
    public int getDeleteApuntador()
    {
        return this.deleteApuntador;
    }
    
    public int getLength()
    {
        return this.vector.length;
    }
    
    public ColasVector(int tamanio)
    {
        this.tamanio = tamanio;
        this.vector = new double[this.tamanio];
        this.apuntador = -1;
        this.deleteApuntador = -1;
    }
    
    public boolean enqueue(double dato)
    {
        boolean result;
        this.apuntador++;
        if(this.apuntador < this.tamanio){
            this.vector[this.apuntador] = dato;
            result = true;
        }
        else
        {
            this.apuntador--;
            result = false;
        }
        
        return result;
    }
    
    public boolean dequeue()
    {
        boolean result;
        double[] aux = new double[this.tamanio];
        this.deleteApuntador += 2;
        for(int i = this.deleteApuntador; i < this.tamanio; i++)
        {
            aux[i-1] = vector[i];
        }
        for(int j = 0; j < this.tamanio; j++)
        {
            this.vector[j] = aux[j];
        }
        if(this.apuntador != -1)
        {
            this.apuntador--;
            this.deleteApuntador = -1;
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public void dequeue(double dato)
    {
       double[] aux = new double[tamanio];
       for(int i = 0; i < this.tamanio; i++)
       {
           if(vector[i] == dato)
           {
               this.deleteApuntador = i+1;
           }
       }
       if(this.deleteApuntador == -1)
       {
           JOptionPane.showMessageDialog(null, "No se encontró el número");
           return;
       }
       for(int j = this.deleteApuntador; j < this.tamanio; j++)
       {
           aux[j - this.deleteApuntador] = this.vector[j];
       }
       for(int k = 0; k < this.tamanio; k++)
       {
           this.vector[k] = aux[k];
       }
       this.apuntador -= this.deleteApuntador;
       this.deleteApuntador = -1;
    }
    
    public boolean empty()
    {
        
        return this.apuntador == -1;
    }
    
    public String front()
    {
        String mensaje = "";
        if(!this.empty())
        {
            mensaje += this.vector[this.apuntador];
        }
        else
        {
            mensaje += "Está vacio";
        }
        return mensaje;
    }

    public int size()
    {
        return this.vector.length;
    }
    
    public String print()
    {
        String mensaje = "";
        for(int i = 0; i < this.vector.length; i++)
        {
            mensaje += " | " + this.vector[i] + " | ";
        }
        return mensaje;
    }
    
    public void mensaje(String text)
    {
        JOptionPane.showMessageDialog(null, text);
    }
}
