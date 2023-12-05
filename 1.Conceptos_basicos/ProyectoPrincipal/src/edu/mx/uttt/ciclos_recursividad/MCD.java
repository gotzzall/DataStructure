package edu.mx.uttt.ciclos_recursividad;

public class MCD {
    public static int MCD(int valor1, int valor2)
    {
        int auxi = 0;
        while (valor1 % valor2 != 0) {
            auxi = valor2;
            valor2 = valor1 % valor2;
            valor1 = auxi;
        }
        return valor2;
    }

    public static int MDCR(int divisor, int dividendo)
    {
        if (dividendo == 0)
        {
            return divisor;
        }
        else
        {
            return MDCR(dividendo, divisor%dividendo);
        }
    }
}
