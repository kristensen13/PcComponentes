/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pccomponentes;

/**
 *
 * @author Wilson
 */
public class Empleado {

    protected String nombre;
    protected int edad;
    protected boolean casado;
    protected double salario = 1000;
    protected String clasificacion;

    public Empleado() {

    }

    public Empleado(String nombre, int edad, boolean casado, double salario, String clasificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    protected void mostrarClasificacion() {
        if (edad <= 21) {
            clasificacion = "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            clasificacion = "Intermedio";
        }
        clasificacion = "Senior";
    }

    protected String casadoToString() {
        if (casado == true) {
            return "SÍ";
        }
        return "NO";
    }

    protected double calcularSalario(){
        
        return salario;
    }

}
