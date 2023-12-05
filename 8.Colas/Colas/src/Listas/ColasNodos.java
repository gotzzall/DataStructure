package Listas;

import javax.swing.JOptionPane;

public class ColasNodos 
{
    private Listas lista = new Listas();

    public void enqueue(double dato)
    {
        lista.insertarAlFrente(dato);
    }

    public void dequeue()
    {
        try 
        {
            lista.eliminarAlFinal();
        } 
        catch (NullPointerException e) {
            this.empty();
        }
    }

    public void dequeue(double dato)
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
            JOptionPane.showMessageDialog(null,"Está vacia");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Tiene elementos");
        }
    }

    public void front()
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

    public void sizes()
    {
        try
        {
            JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + lista.nNodos());
        }
        catch(NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null,"No hay elementos");
        }
    }
    
    public  void print()
    {
        if(lista.getPrimerNodo() == null)
        {
            this.empty();
        }
        else
        {
            JOptionPane.showMessageDialog(null,lista.imprimir());        
        }
    }
}