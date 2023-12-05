package edu.mx.uttt.matrices;

public class Profesor extends Persona{
    private String numeroDeNomina;
    private String gradoDeEstudio;

    Profesor()
    {

    }

    public Profesor(String nombre, int edad, String sexo, String direccion, String numeroDeNomina, String gradoDeEstudio)
    {
        super(nombre, edad, sexo, direccion);
        this.numeroDeNomina = numeroDeNomina;
        this.gradoDeEstudio = gradoDeEstudio;
    }

    public String getNumeroDeNomina() 
    {
        return numeroDeNomina;
    }

    public void setNumeroDeNomina(String numeroDeNomina) 
    {
        this.numeroDeNomina = numeroDeNomina;
    }

    public String getGradoDeEstudio() 
    {
        return gradoDeEstudio;
    }

    public void setGradoDeEstudio(String gradoDeEstudio) 
    {
        this.gradoDeEstudio = gradoDeEstudio;
    }

    @Override
    public void insertar(Object obj) {
        ClaseBuena obj2 = (ClaseBuena) obj;   
        obj2.setX(111);
        obj2.setY(123);     
        String salida = "x: "+obj2.getX()+"\nY: "+obj2.getY();
        System.out.println(salida);
    }

    @Override
    public void seleccionar() {
        System.out.println("Hola me seleccionaste, soy un profesor"); 
    }
    

}
