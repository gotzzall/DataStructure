package Listas;

public class NodoLista
{
    private Object dato;
    private NodoLista sigNodo;
    
    public NodoLista(Object dato)
    {
        this(dato, null);
    }
    
    public NodoLista(Object dato, NodoLista sigNodo)
    {
        this.sigNodo = sigNodo;
        this.dato = dato;
    }
    
    public Object getDato()
    {
        return this.dato;
    }
    
    public void setDato(Object dato)
    {
        this.dato = dato;
    }
    
    public NodoLista getSigNodo()
    {
        return this.sigNodo;
    }

    public void setSigNodo(NodoLista nodo)
    {
        this.sigNodo = nodo;
    }
}
