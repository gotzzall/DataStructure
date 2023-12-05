/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.principal;

import edu.mx.uttt.ciclos_recursividad.Ciclos;
import javax.swing.JOptionPane;

/**
 *
 * @author mr.gos
 */
public class Menu {
    public static void principal(){
        String menu = "Menú principal\n"+
                        "1)Ciclos\n"+
                        "2)Recursividad\n"+
                        "3)Arreglos\n"+
                        "4)Listas\n"+
                        "5)Árboles binario\n"+
                        "6)Salir\n"+
                        "Elegir la opción";
        
        String option = "";
        boolean flag = true;
        
        do{
            option = JOptionPane.showInputDialog(menu);

            switch (option){
                case "1":
                        menuCiclos();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida");
                    break;
            }
        }while(flag);
    }
    
    private static void menuCiclos(){
        String menu = "Menú de ciclos\n"+
                        "1)Ejercicio 1\n"+
                        "2)Regresar\n"+
                        "Elegir la opción";
        
        boolean flag = true;
        String opcion = "";
        do{
            opcion = JOptionPane.showInputDialog(menu);

            switch(opcion){
                case "1":
                    Ciclos.factorialFor();
                break;
                case "2":
                    flag = false;
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida");
                break;
            }
            
        }while(flag);
    }
}
