import javax.swing.JOptionPane;

public class Operacion {
    private int[][] matriz;
    int fila;
    int columna;

    public Operacion(int filas, int columnas)
    {
        this.fila=filas;
        this.columna=columnas;
        matriz=new int[filas][columnas];
        this.llenarMatriz();
    }

    public void llenarMatriz()
    {
        int     contadorFila=0;
        int     contadorColumna;

        while (contadorFila < fila)
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
    
    private String imprimir(int[][] entrada)
    {
        int     contadorFila=0;
        int     contadorColumna;
        String  impresion="";

        while (contadorFila < fila)
        {
            contadorColumna=0;

            while (contadorColumna < columna)
            {
                impresion+="|"+entrada[contadorFila][contadorColumna]+"|";
                contadorColumna++;
            }

            if (contadorFila != fila-1)
            {
                impresion+="\n";
            }

            contadorFila++;
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
}
