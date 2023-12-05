/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Arreglos.ColasVector;
import Listas.ColasNodos;
import Listas.Listas;

/**
 *
 * @author mr.gos
 */
public class TestMain 
{
    public static void main(String[] args) 
    {    
        ColasNodos obj = new ColasNodos();
        obj.enqueue(1);
        obj.enqueue(3.0);
        obj.dequeue(3.0);
        obj.print();
    }
}
