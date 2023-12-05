/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mio.control;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mr.gos
 */
public class ControlVuelos {
    private int[][] tablero;// = {{12, 56, 11}, {4, 5, 8}, {6, 7, 12}, {7, 8, 9}, {11, 23, 12}};
    //private String [] destinos;
    private String  destinos[];// = {"Cancun", "CDMX", "Los Cabos", "Mazatlan", "Puerto Vallarta","Guanchumpein", "Contra el Dragon"};
    private String[] horarios;// = {"Mañana", "Medio Dia", "Noche"};

    public ControlVuelos() 
    {
    
    }
    
    public ControlVuelos(int filas, int columnas) 
    {
        tablero = new int[filas][columnas];
        destinos=new String[filas];
        horarios=new String[columnas];
    }
    
    public int[][] getTablero()
    {
        return tablero;
    }
    
    public String[] getDestino()
    {
        return destinos;
    }
    
    public String[] getHorarios()
    {
        return horarios;
    }

    public String Imprimir() {
        String salida = "                        Mañana    Medio Dia    Noche\n";
        for (int i = 0; i < tablero.length; i++) {
            salida += destinos[i] + "                 ";
            for (int j = 0; j < tablero[0].length; j++) {
                salida += tablero[i][j] + "               ";
            }

            salida += "\n";
        }
        return salida;
    }

    public String mostrarMenuDestino() {
        String salida = "   Destinos      \n";

        for (int i = 0; i < destinos.length; i++) {
            salida += (i + 1) + ")" + destinos[i] + "\n";
        }

        salida += "Elegir Opción: \n";
        return salida;
    }

    public String mostrarMenuHorario() {
        String salida = "   Horarios      \n";

        for (int i = 0; i < horarios.length; i++) {
            salida += (i + 1) + ")" + horarios[i] + "\n";
        }

        salida += "Elegir Opción: \n";
        return salida;
    }

    public boolean verificarDisponibilidad(int destino, int horario, int numeroBoletos) {
        boolean res = false;
        if (numeroBoletos > 0) {
            if (tablero[destino - 1][horario - 1] >= numeroBoletos) {
                tablero[destino - 1][horario - 1] = tablero[destino - 1][horario - 1] - numeroBoletos;
                res = true;
            }

           
        }
   
        return res;
       
    }
   
   public void llenarTablero()
   {
       boolean flag=true;
       
       for(int i=0; i<this.tablero.length; i++)
       {
           for(int j=0; j<this.tablero[0].length; j++)
           {
               do
               {
                   try
                   {
                       this.tablero[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor"));
                       flag=false;
                   }
                   catch(NumberFormatException ex)
                   {
                       flag=true;
                       JOptionPane.showMessageDialog(null, "Introduce un valor entero");
                   }
               }
               while(flag);
           }
       }
   }
   
   public void copiarTablero(int [][] tablero)
   {
       for(int i=0; i<this.tablero.length; i++)
       {
           for(int j=0; j<this.tablero[0].length; j++)
           {
               this.tablero[i][j]=tablero[i][j];
           }
       }
    }
   
    public String mensaje(boolean opcion) {
        return opcion ? "La venta fue exitosa " : "La venta de boletos no fue exitosa por falta de disponibilidad";
    }
}
