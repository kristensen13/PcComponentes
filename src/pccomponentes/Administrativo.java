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
public class Administrativo extends Empleado {

    //enum NivelIngles {ALTO, MEDIO, BAJO}
    NivelIngles nivelIngles;

    //nivelIngles = NivelIngles.MEDIO;
    public Administrativo() {
    }

    public Administrativo(String nombre, int edad, boolean casado, double salario, String clasificacion) {
        super(nombre, edad, casado, salario, clasificacion);
    }

    @Override
    public double calcularSalario() {

        if (nivelIngles == NivelIngles.MEDIO) {
            salario = super.salario + 250;
            return salario;
        } else if (nivelIngles == NivelIngles.ALTO) {
            salario = super.salario + 500;
        }
        return super.salario;
    }

    public NivelIngles getNivelIngles() {
        return nivelIngles;
    }

    public void setnIngles(NivelIngles nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    @Override
    protected String casadoToString() {
        return super.casadoToString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        //return "Administrativo{" + "nivelIngles=" + nivelIngles + '}';
        return "Administrativo{" + "nombre=" + nombre + " ,edad=" + edad + " ,casado=" + casadoToString() + " ,nIngles=" + nivelIngles + " ,salario=" + calcularSalario() + '}';
    }

}
