package Operaciones;

public class NodoListaDoble {
    private Object dato;
    private NodoListaDoble sigNodo;
    private NodoListaDoble antNodo;
    
    public NodoListaDoble(Object dato)
    {
        this(dato , null, null);
    }
    
    public NodoListaDoble(Object dato, NodoListaDoble antNodo,  NodoListaDoble sigNodo)
    {
        this.antNodo = antNodo;
        this.sigNodo = sigNodo;
        this.dato = dato;
    }
    
    public Object getDato()
    {
        return this.dato;
    }
    
    public void setDato(Object data)
    {
        this.dato = data;
    }

    public NodoListaDoble getSigNodo()
    {
        return this.sigNodo;
    }
    
    public NodoListaDoble getAntNodo()
    {
        return this.antNodo;
    }

    public void setSigNodo(NodoListaDoble nodo)
    {
        this.sigNodo = nodo;
    }
    
    public void setAntNodo(NodoListaDoble nodo)
    {
        this.antNodo = nodo;
    }
}
