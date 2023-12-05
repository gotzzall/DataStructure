package edu.mx.uttt.ciclos_recursividad;

public class numeroImpar {
    public static int numerosImpCiclo(int n)
    {
        int suma = 0;
        int i = 0;
        while(i <= n)
        {
            if (i%2 != 0)
            {
                suma += i;
            }
            i++;
        }
        return suma;
    }

    public static int numerosImpR(int n)
    {
        if (n == 0) {
            return n;
        }
        else
        {
            if (n % 2 == 0) {
                return numerosImpR(n-1);
            }
            else
            {
                return n + numerosImpR(n-1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(numerosImpCiclo(3));
        numerosImpR(7);
    }
}
