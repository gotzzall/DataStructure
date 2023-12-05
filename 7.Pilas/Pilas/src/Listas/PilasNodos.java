package Listas;

import javax.swing.JOptionPane;

public class PilasNodos 
{
    private Listas lista = new Listas();

    public void push(double dato)
    {
        lista.insertarAlFrente(dato);
    }

    public void pop()
    {
        try 
        {
            lista.eliminarAlFrente();
        } 
        catch (NullPointerException e) {
            this.empty();
        }
    }

    public void pop(double dato)
    {
        try 
        {
            lista.eliminarPila(dato);
        } 
        catch (NullPointerException e) {
            this.empty();
        }
    }

    public void empty()
    {
        if(lista.estaVacia())
        {
            JOptionPane.showMessageDialog(null, "Está vacia");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tiene elementos");
        }
    }

    public void peek()
    {
        if(lista.getPrimerNodo() == null)
        {
            this.empty();
        }
        else
        {
            JOptionPane.showMessageDialog(null, (double)lista.getPrimerNodo().getDato());
        }
    }

    public void length()
    {
        JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + lista.nNodos());
    }
    
    public  void print()
    {
        if(lista.getPrimerNodo() == null)
        {
            this.empty();
        }
        else
        {
            JOptionPane.showMessageDialog(null, lista.imprimir());        
        }
    }
}