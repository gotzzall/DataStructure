/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author mr.gos
 */
public class NodoArbol 
{
    private int dato;
    private NodoArbol nodoIzquierdo;
    private NodoArbol nodoDerecho;
    
    public NodoArbol(int dato)
    {
        //Crea el nodo inicial o raíz
        this.dato = dato;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }
    
    public int getDato()
    {
        return this.dato;
    }
    
    public void setDato(int dato)
    {
        this.dato = dato;
    }
    
    public NodoArbol getNodoIzquierdo()
    {
        return this.nodoIzquierdo;
    }
    
    public NodoArbol getNodoDerecho()
    {
        return this.nodoDerecho;
    }
    
    public void agrega(int dato)
    {
        if(dato < this.dato)
        {
            //inserta de lado izquierdo
            if(this.nodoIzquierdo == null)
            {
                this.nodoIzquierdo = new NodoArbol(dato);
            }
            else
            {
                this.nodoIzquierdo.agrega(dato);
            }
        }
        else
        {
            if(this.nodoDerecho == null)
            {
                this.nodoDerecho = new NodoArbol(dato);
            }
            else
            {
                this.nodoDerecho.agrega(dato);
            }
        }
    }
}
