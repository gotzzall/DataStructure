
import mx.com.mio.funciones.Operaciones;
import mx.com.mio.modelo.Empleado;
import mx.com.mio.modelo.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mr.gos
 */
public class Prueba 
{
    public static void main(String [] args)
    {
        /*Persona[] per = new Persona[3];
        Empleado obj = new Empleado("Monico", "Peréz", 20, "Hombre", 23000.01);
        Empleado obj2 = new Empleado("Luis", "Valle", 40, "Hombre", 20000);
        Empleado obj3 = new Empleado("Ana", "Guitierrez", 30, "Mujer", 20990);
        per[1] = obj;
        per[2] = obj2;
        per[3] = obj3;*/
        
        Operaciones obj=new Operaciones(3);
        obj.llenarArreglo();
        //System.out.println("Arreglo1:\n"+obj.imprimir());
        //System.out.println(obj.busquedaSecuencial());
        //obj.burbujaDecendente();
        System.out.println(obj.imprimir(obj.getArreglos()));
    }
}
