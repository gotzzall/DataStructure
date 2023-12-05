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
public class PilasVector {
    private double[] vector;
    private int tamanio;
    private int apuntador;
    
    public int getApuntador()
    {
        return this.apuntador;
    }
    
    public PilasVector(int tamanio)
    {
        this.tamanio = tamanio;
        this.vector = new double[this.tamanio];
        this.apuntador = -1;
    }
    
    public boolean push(double dato)
    {
        this.apuntador++;
        if(this.apuntador < this.tamanio)
        {
            this.vector[this.apuntador] = dato;
            return true;
        }
        else
        {
            this.apuntador--;
            return false;
        }
    }
    
    public boolean pop()
    {
        boolean result;
        if(this.apuntador != -1)
        {
            this.apuntador--;
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public boolean pop(double dato)
    {
        if(this.apuntador != -1)
        {
            for(int i = 0; i < this.vector.length; i++)
            {
                if (this.vector[i] == dato) {
                    this.apuntador = i-1;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean empty()
    {
        return this.apuntador == -1;
    }
    
    public String peek()
    {
        String texto = "";
        if(!this.empty())
        {
            texto += this.vector[this.apuntador];
        }
        else
        {
            texto += "Está vacia";
        }
        return texto;
    }

    public void length()
    {
        this.mensaje(String.valueOf(this.vector.length));
    }
    
    public String print()
    {
        String texto = "";
        if(this.apuntador != -1)
        {
            for(int i = this.apuntador; i >= 0; i--)
            {
                texto += " | " + this.vector[i] + " | ";
            }
        }
        else
        {
            texto = "Está vacia";
        }
        return texto;
    }
    
    public void mensaje(String texto)
    {
        JOptionPane.showMessageDialog(null, texto);
    }
}
