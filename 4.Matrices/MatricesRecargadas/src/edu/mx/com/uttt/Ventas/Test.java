package edu.mx.com.uttt.Ventas;

public class Test {
    public static void main(String[] args) {
        Empleados obj=new Empleados(5);
        obj.agregarNombres();
        System.out.println(obj.imprimirNombres());

        Ventas obj2=new Ventas(obj.getlongitud(), 5);
        obj2.llenar();
        System.out.println(obj2.imprimirCantiades(obj2.getMatriz()));

        Operaciones obj3 = new Operaciones(obj.getlongitud());
        obj3.suma(obj2.getMatriz());
        obj3.imprimir();

    

    }
}
