/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author mr.gos
 */
public class Test {
    public static void main(String[] args) {
        ListasCirculares obj = new ListasCirculares();
        obj.insertarAlFrente(2);
        obj.insertarAlFrente(3);
        obj.insertarAlFrente(5);
        System.out.println(obj.imprimir());
        obj.ingresarAlUltimo(200);
        System.out.println(obj.imprimir());
        obj.ordenQuickSortDescendente();
        System.out.println(obj.imprimir());

    }
}
