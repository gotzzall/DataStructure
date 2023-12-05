package edu.mx.uttt.ciclos_recursividad;

public class DivisionConFactorial {
    
    public static int factorial(int contador)
    {
        if (contador == 1)
        {
            return 1;
        }
        else
        {
            return contador*factorial(contador-1);
        }
    }
    
    public static double operacion(int valor, double i, int denominador )
    {
        if (valor == i)
        {
            return i/factorial(denominador);
        }
        else
        {
            return i/factorial(denominador) + operacion(valor, i + 1, denominador + 2);
        }
    }
    
    public static void main(String[] args) {
        double resultado = 0.0;
        int valor = 3;
        int cont2 = 2;
        double i = 1.0;
        int j = 1;
        int factorial = 1;

        while(i <= valor)
        {
            while(j <= cont2)
            {
                factorial *= j;
                j++;
            }
            resultado += i/factorial;
            i++;
            cont2 += 2;
        }

        System.out.println(resultado);
        
        System.out.println(operacion(3, 1, 2));
    }
}
