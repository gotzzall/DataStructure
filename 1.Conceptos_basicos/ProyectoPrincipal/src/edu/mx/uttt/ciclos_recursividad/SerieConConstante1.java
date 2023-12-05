package edu.mx.uttt.ciclos_recursividad;

public class SerieConConstante1 {

    public static double serial(int valor, int i)
    {
        if(i == valor)
        {
            return 1.0/i;
        }
        else
        {
            return 1.0/i + serial(valor, i+1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        double resultado = 0;

        for(int i = 1; i <= n; i++)
        {
            resultado += 1.0/i;
        }

        System.out.println(resultado);

        int valor = 5;
        int i = 1;

        System.out.println(serial(valor, i));

    }
}
