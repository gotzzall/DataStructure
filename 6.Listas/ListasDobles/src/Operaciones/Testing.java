package Operaciones;

public class Testing {
    public static void main(String[] args) {
        ListaDobles obj = new ListaDobles();
        obj.insertarAlFrente(3);
        obj.insertarAlFrente(4);
        System.out.println(obj.imprimirPorDerecha());
        System.out.println(obj.imprimirPorIzquierda());
        obj.insertearDondeSea(3, 100);
        obj.insertearDondeSea(3, 999);
        System.out.println(obj.imprimirPorDerecha());
        System.out.println(obj.imprimirPorIzquierda());
        obj.eliminarDondeSea(100);
        System.out.println(obj.imprimirPorDerecha());
        System.out.println(obj.imprimirPorIzquierda());
        obj.ordenBurbujaAscendente();
        System.out.println(obj.imprimirPorDerecha());
        System.out.println(obj.imprimirPorIzquierda());
    }
}
