package Operaciones;

public class Comparator {
    int entero;
    int flotante;
    int cadena;
    int booleano;

    private int tipoDato(Object dato)
    {
        int aux = 0;
        if(dato instanceof Integer)
        {
            aux = 1;
            this.entero += 1;
        }
        else
        {
            if(dato instanceof Double)
            {
                aux = 2;
                this.flotante += 1;
            }
            else
            {
                if(dato instanceof String)
                {
                    aux = 3;
                    this.cadena += 1;
                }
                else
                {
                    if(dato instanceof Boolean)
                    {
                        aux = 4;
                        this.booleano += 1;
                    }
                }
            }
        }
        return aux;
    }

    public void asignacionDato(Object dato)
    {
        int indice = this.tipoDato(dato);
        switch (indice) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        
            default:
                break;
        }
    }
}
