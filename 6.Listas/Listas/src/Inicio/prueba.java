package Inicio;

import Operaciones.Listas;
import Operaciones.NodoLista;

/**
 * prueba
 */
public class prueba {

    public static double tipoDato(Object data)
    {
        if(data instanceof String || data instanceof Character || data instanceof Boolean)
        {
            double n = String.valueOf(data).charAt(0);
            return n;
        }
        if(data instanceof Integer)
        {
            return (int)data;
        }
        return (double)data;
    }

    public static void ordenBurbujaAscendente(Listas obj)
    {
         int numero = obj.nNodos();
         int n = 0;
         while (n < numero) 
         {
             NodoLista aux = obj.getPrimerNodo();
             try
            {
                while (aux != null) {
                    
                        if (tipoDato(aux.getDato()) > tipoDato(aux.getSigNodo().getDato())) {
                            Object temporal = aux.getDato();
                            aux.setDato(aux.getSigNodo().getDato());
                            aux.getSigNodo().setDato(temporal);
                        }
                        aux = aux.getSigNodo();
                    
                }  
            }
            catch(NullPointerException ex){}
            n++;
        }
    }

    public static void orden(Listas datos)
    {
        Listas text = new Listas();
    //     Listas numeros = new Listas();
    //     Listas logicos = new Listas();

        NodoLista aux = datos.getPrimerNodo();
         try
         {
            while (aux != null) {
                if (aux.getDato() instanceof String || aux.getDato() instanceof Character) 
                {
                    text.insertarAlFrente(aux.getDato());    
                }
    //             if(aux.getDato() instanceof Integer || aux.getDato() instanceof Double)
    //             {
    //                 numeros.insertarAlFrente(aux.getDato());
    //             }
    //             if(aux.getDato() instanceof Boolean)
    //             {
    //                 logicos.insertarAlFrente(aux.getDato());
    //             }
                aux = aux.getSigNodo();
            }
        }
        catch(NullPointerException ex){}

        ordenBurbujaAscendente(text);
    //     ordenBurbujaAscendente(numeros);
    //     ordenBurbujaAscendente(logicos);

         NodoLista aux2 = datos.getPrimerNodo();
         NodoLista tex = text.getPrimerNodo();
    //     NodoLista nu = numeros.getPrimerNodo();
    //     NodoLista bo = logicos.getPrimerNodo();
         try
         {
             while (aux2 != null) {
                 try{
                     while (tex != null) {
                         aux2.setDato(tex.getDato());
                         tex = tex.getSigNodo();
                     }
                 }
                 catch(NullPointerException ex){}
    //             try{
    //                 while (nu != null) {
    //                     aux2.setDato(nu.getDato());
    //                     nu = nu.getSigNodo();
    //                 }
    //             }
    //             catch(NullPointerException ex){}
    //             try{
    //                 while (bo != null) {
    //                     aux2.setDato(bo.getDato());
    //                     bo = bo.getSigNodo();
    //                 }
    //             }
    //             catch(NullPointerException ex){}
    //             aux2 = aux2.getSigNodo();
             }
         }
         catch(NullPointerException ex){}
    }
    public static void main(String[] args) {
        Listas ejemplo = new Listas();
        ejemplo.insertarAlFrente("a");
        ejemplo.insertarAlFrente("s");
        ejemplo.insertarAlFrente("hola");
        ejemplo.insertarAlFrente("z");

        orden(ejemplo);

        System.out.println(ejemplo.imprimir());
    }
}