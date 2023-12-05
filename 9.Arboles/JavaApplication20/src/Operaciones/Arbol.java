package Operaciones;

public class Arbol 
{
    NodoArbol raiz;
    
    public Arbol()
    {
        this.raiz = null;
    }
    
    public void insertar(int dato)
    {
        if(this.empty())
        {
            this.raiz = new NodoArbol(dato);
        }
        else
        {
            this.raiz.agrega(dato);
        }
    }
    
    public boolean empty()
    {
        return this.raiz == null;
    }
    
    public void recorrerEnOrden()
    {
        this.enOrden(raiz);
    }
    
    public void enOrden(NodoArbol nodo)
    {
        if(nodo == null)
        {
            return;
        }
        else{
            this.enOrden(nodo.getNodoIzquierdo());
            System.out.print(nodo.getDato() + "-");
            this.enOrden(nodo.getNodoDerecho());
        }
    }
    
    public void recorrerEnPosOrden()
    {
        this.posOrden(raiz);
    }
    
    public void posOrden(NodoArbol nodo)
    {
        if(nodo == null)
        {
            return;
        }
        else{
            this.posOrden(nodo.getNodoIzquierdo());
            this.posOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getDato() + "-");
        }
    }

    public void recorrerEnPreOrden()
    {
        this.preOrden(raiz);
    }

    public void preOrden(NodoArbol nodo)
    {
        if(nodo == null)
        {
            return;
        }
        else{
            System.out.print(nodo.getDato() + "-");
            this.preOrden(nodo.getNodoIzquierdo());
            this.preOrden(nodo.getNodoDerecho());
        }
    }
}
