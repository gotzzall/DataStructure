package Inicio;

import Operaciones.Listas;

public class Inicio 
{
    public static void main (String[] args)
    {
        Listas li = new Listas();
        li.insertarAlFrente(1.2);
        li.insertarAlFrente(7.0);
        li.insertarAlFrente(8.9);
        li.insertarAlFrente(1000);
        li.ingresarAlUltimo(10.0);
        li.insertarAlFrente(1.3);
        System.out.println(li.imprimir());
        //li.ordenShellAscendente();
        //li.ordenShellDescendente();
        //li.ordenMergeAscendente();
        //li.ordenMergeDescendente();
        //li.ordenQuickSortAscendente();
        //li.ordenQuickSortDescendente();
        System.out.println(li.imprimir());
    }
}
