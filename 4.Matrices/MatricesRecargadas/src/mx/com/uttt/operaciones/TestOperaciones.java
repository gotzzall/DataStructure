package mx.com.uttt.operaciones;

import javax.swing.JOptionPane;

public class TestOperaciones {
    public static void main(String[] args) {
        //Operaciones obj=new Operaciones(2, 3);
        // System.out.println("resultado:\n"+obj.imprimir());
        // System.out.println("copia: \n"+obj.copiar());
        //JOptionPane.showMessageDialog(null, "segunda matriz");
        //Operaciones obj2=new Operaciones(3,3);
        // System.out.println("Obj1:\n"+obj.imprimir());
        // System.out.println("Obj2:\n"+obj2.imprimir());
        //System.out.print(obj2.multiplicar(obj.getMatriz()));
        //System.out.println(obj2.imprimir(obj2.getMatriz()));
        //System.out.println(obj2.imprimir(obj2.traspuesta()));
        //System.out.println(obj2.sumaDiagonal(obj2.getMatriz()));

        Operaciones obj=new Operaciones(3, 3);
        obj.llenarMatriz();
        System.out.println(obj.imprimir());
        System.out.println(obj.sumaDiagonalInversa());

    }
}
