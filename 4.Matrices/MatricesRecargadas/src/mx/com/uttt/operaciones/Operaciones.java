package mx.com.uttt.operaciones;

import javax.swing.JOptionPane;

public class Operaciones 
{
    private int[][] matriz;
    public  int fila;
    public  int columna;

    public Operaciones(int filas, int columnas)
    {
        this.fila=filas;
        this.columna=columnas;
        matriz=new int[filas][columnas];
    }

    public int[][] getMatriz()
    {
        return this.matriz;
    }

    public void llenarMatriz()
    {
        int     contadorFila=0;
        int     contadorColumna;
        
        while (contadorFila<fila)
        {
            contadorColumna=0;

            while (contadorColumna < columna)
            {
                matriz[contadorFila][contadorColumna]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
                contadorColumna++;
            }

            contadorFila++;
        }

    }
    
    public String copiar()
    {
        int[][] matrizCopia=new int[fila][columna];
        int     contadorFila=0;
        int     contadorColumna;

        while (contadorFila < fila)
        {
            contadorColumna=0;

            while (contadorColumna < columna)
            {
                matrizCopia[contadorFila][contadorColumna]=matriz[contadorFila][contadorColumna];
                contadorColumna++;
            }

            contadorFila++;
        }

        return imprimir(matrizCopia);
    }

    public String imprimir()
    {
        int     contadorFila=0;
        int     contadorColumna;
        String  imprimir="";

        while (contadorFila < fila)
        {
            contadorColumna=0;

            while (contadorColumna < columna)
            {
                imprimir+="|"+matriz[contadorFila][contadorColumna]+"|";
                contadorColumna++;
            }

            if (contadorFila != fila-1)
            {
                imprimir+="\n";
            }

            contadorFila++;
        }

        return imprimir;
    }

    public String imprimir(int[][] entrada)
    {
        String impresion="";
        
        for(int i=0; i<entrada.length; i++)
        {
            for(int j=0; j<entrada[0].length; j++)
            {
                impresion+="|"+entrada[i][j]+"| ";
            }
            
            impresion+="\n";
        }

        return impresion;
    }
    
    public String sumaDeMatrices(int[][] entrada)
    {
        int[][] matrizResultado=new int[fila][columna];
        int     contadorFila=0;
        int     contadorColumna;

        while (contadorFila < fila)
        {
            contadorColumna=0;

            while (contadorColumna < columna)
            {
                matrizResultado[contadorFila][contadorColumna]=(matriz[contadorFila][contadorColumna]+
                                                                entrada[contadorFila][contadorColumna]);
                contadorColumna++;
            }

            contadorFila++;
        }

        return imprimir(matrizResultado);
    }

    /* Suma de matrices by profesor
        public String suma(int[][]m)
        {
            String r="";
            int suma=0;
            for(int j=0; i<m.length; i++)
            {
                for(int j=0; j<this.m[0].length; j++)
                {
                    suma+=m[i][j]+this.m[i][j]
                }
                r+=suam+"";
                suma=0;
            }
            r+="\n";
        }
    */

    public String restaDeMatrices(int[][] entrada)
    {
        int[][] matrizResultado=new int[fila][columna];
        int     contadorFila=0;
        int     contadorColumna;

        while (contadorFila < fila)
        {
            contadorColumna=0;

            while (contadorColumna < columna)
            {
                matrizResultado[contadorFila][contadorColumna]=(matriz[contadorFila][contadorColumna]-
                                                                entrada[contadorFila][contadorColumna]);
                contadorColumna++;
            }

            contadorFila++;
        }

        return imprimir(matrizResultado);
    }

     public String multiplicar(int[][] m)
    {
        int     suma=0;
        String  salida="";
        
        for(int i=0; i<this.matriz.length; i++)
        {
            for(int j=0; j<this.matriz.length; j++)
            {
                for(int k=0; k<m[0].length; k++)
                {
                    suma+=this.matriz[i][k]+m[k][j];
                }
                salida+=suma+"";
                suma=0;
            }

            salida+="\n";
        }
        
        return salida;
    }

    public int[][] traspuesta()
    {
        int[][] transpuesta=new int[matriz[0].length][matriz.length];
        
        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz[0].length; j++)
            {
                transpuesta[j][i]=matriz[i][j];
            }
        }
        
        return transpuesta;
    }
    
    public String sumaDiagonal()
    {
        double suma=0.0;
        for(int i=0; i<matriz[0].length; i++)
        {
            suma+=matriz[i][i];
        }
        
        return Double.toString(suma);
    }

    public String sumaDiagonalInversa()
    {
        double suma=0.0;
        for(int i=0; i<matriz[0].length; i++)
        {
            suma+=matriz[i][(matriz[0].length-1)-i];
        }
        
        return Double.toString(suma);
        
    }
}
