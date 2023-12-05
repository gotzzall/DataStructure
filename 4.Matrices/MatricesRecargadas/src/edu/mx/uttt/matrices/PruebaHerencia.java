package edu.mx.uttt.matrices;

public class PruebaHerencia {
    public static void main(String[] args) {
        //Persona p1 = new Persona();
        // Alumno a1 = new Alumno();

        // a1.setNombre("Mónico");
        // a1.setEdad(40);
        // a1.setSexo("Hombre");
        // a1.setDireccion("wallStreet");
        // a1.setMatricula("22000");

        // System.out.println(a1);
        // a1.saludar();

        Persona p1 = new Alumno();
        Persona p2 = new Profesor();
        p1.insertar(new ClaseBuena());
        p2.insertar(new ClaseBuena());

        Alumno a1 = new Alumno();
        Profesor pr1 = new Profesor();
        Persona arr [] = new Persona [2];

        arr[0] = a1;
        arr[1] = pr1;

        for(Persona x : arr)
        {
            x.seleccionar();
        }
    }
}
