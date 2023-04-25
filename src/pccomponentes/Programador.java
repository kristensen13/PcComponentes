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
public class Programador extends Empleado {

    int lineasDeCodigoPorHora;

    public Programador() {

    }

    public Programador(int lineasDeCodigoPorHora, String nombre, int edad, boolean casado, double salario, String clasificacion) {
        super(nombre, edad, casado, salario, clasificacion);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    @Override
    public double calcularSalario() {
        if (lineasDeCodigoPorHora > 1500) {
            salario = super.salario + (super.salario * 0.5);
            return salario;
        }
        return super.salario;
    }

    @Override
    protected String casadoToString() {
        return super.casadoToString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        //return "Programador{" + "lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + '}';
        return "Programador{" + "nombre=" + nombre + " ,edad=" + edad + " ,casado=" + casadoToString() + " ,lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + " ,salario=" + calcularSalario() + '}';
    }

}
