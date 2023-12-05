public class Prueba {
    public static void main(String[] args) {
        Empleado obj = new Empleado(4);
        obj.llenarNombre();
        System.out.print(obj.getNombres());

        Operacion obj2 = new Operacion(5, 4);
        obj2.llenarMatriz();
    }
}
