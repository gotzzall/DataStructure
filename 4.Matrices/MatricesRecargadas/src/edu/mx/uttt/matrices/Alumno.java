package edu.mx.uttt.matrices;

public class Alumno extends Persona
{
    private String matricula;
    
    public Alumno()
    {
        super("Luis",40,"Hombre","street wilson");
        this.matricula = "aaaaaaaaa0";
    }

    public Alumno (String nombre, int edad, String sexo, String direccion, String matricula)
    {
        super(nombre, edad, sexo, direccion);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nAlumno [Matricula: "+this.matricula+"]";
    }
    @Override
    public void saludar()
    {
        System.out.println("hola soy la subclase Alumno");
    }

    @Override
    public void insertar(Object obj) 
    {        
        ClaseBuena obj2 = (ClaseBuena) obj;
        String salida = "x: "+obj2.getX()+"\nY: "+obj2.getY();
        System.out.println(salida);
    }

    @Override
    public void seleccionar() 
    {       
        System.out.println("Hola me seleccionaste, soy un alumno"); 
    }

}
