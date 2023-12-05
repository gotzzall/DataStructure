/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mio.modelo;

/**
 *
 * @author mr.gos
 */
public class Empleado extends Persona
{
    private double salario;
    public Empleado(String nombre, String apellidos, int edad, String sexo, double salario)
    {
        super(nombre, apellidos, edad, sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nSalario: "+this.salario;
    }
}
