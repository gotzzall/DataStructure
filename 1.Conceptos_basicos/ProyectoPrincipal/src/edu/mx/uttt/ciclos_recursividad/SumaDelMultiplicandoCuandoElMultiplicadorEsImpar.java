package edu.mx.uttt.ciclos_recursividad;

public class SumaDelMultiplicandoCuandoElMultiplicadorEsImpar {

    public static int serie(int multiplicador, int multiplicado)
    {
        if (multiplicador == 1)
        {
            return multiplicado;
        }
        else
        {
            if ((multiplicador % 2) != 0)
            {
                return multiplicado + serie(multiplicador / 2, multiplicado * 2);
            }
            else
            {
                return serie(multiplicador / 2, multiplicado * 2);
            }
        }
    }
    
    public static void main(String[] args) {
        int multiplicador = 37;
        int multiplicando = 12;
        int suma = 0;

        do
        {
            System.out.println(multiplicador+" "+multiplicando+" "+suma);
            if((multiplicador % 2) != 0)
            {
                suma += multiplicando;
            }
            multiplicador /= 2;
            multiplicando *= 2;
        }
        while(multiplicador != 0);
        
        System.out.println("Suma = "+suma);
        
        
        System.out.println(serie(9, 3));
    }
}