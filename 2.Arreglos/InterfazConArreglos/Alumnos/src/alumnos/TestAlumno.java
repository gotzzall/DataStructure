/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

/**
 *
 * @author mr.gos
 */
public class TestAlumno {
    public static void main (String [] luluComeQueso)
    {
        /*Alumnos obj, obj2, obj3;
                
        obj = new Alumnos();
        obj2 = new Alumnos("Ali");
        obj3 = new Alumnos("Lulis", "Hernandez", 12, "Mujer");
        imprimir(obj);
        System.out.println("");
        imprimir(obj2);
        System.out.println("");
        imprimir(obj3);*/
        
        /*
         Primero vamos arealizar una matriz de enteros.
        */
        int [][] matriz = new int [3][3];
        // vamos a imprimri el tamaño de las filas
        //System.out.println("El tamaño de las columnas es: "+matriz[matriz.length-1].length); // da 5
        //System.out.println("El tamaño de las filas es: "+matriz.length); // da 2
        imprimir(matriz);
        
    }
    /*public static void imprimir(Alumnos obj)
    {
        System.out.println(obj);
    }*/
    
    // Vamos a crear un método para imprimir la matriz.
    // El arreglo recibe como parámetro una matriz.
    public static void imprimir(int [][] valor)
    {
        int filas = 0;
        int columnas = 0;
        String cadena = "";
        while(filas < valor.length)
        {
            while(columnas < valor[valor.length-1].length)
            {
                cadena += valor[filas][columnas];
                columnas++;
            }
            System.out.println(cadena);
            filas ++;
        }
    }
}
