package Operaciones;

public class NodoListaCirculares
{
    private Object dato;
    private NodoListaCirculares sigNodo;
    
    public NodoListaCirculares(Object dato)
    {
        this(dato, null);
    }
    
    public NodoListaCirculares(Object dato, NodoListaCirculares sigNodo)
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
    
    public NodoListaCirculares getSigNodo()
    {
        return this.sigNodo;
    }

    public void setSigNodo(NodoListaCirculares nodo)
    {
        this.sigNodo = nodo;
    }
}
