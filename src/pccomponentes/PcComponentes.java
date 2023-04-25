/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pccomponentes;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class PcComponentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");
        char opcion = sc.next().charAt(0);

        if (opcion == 'p') {
            sc.nextLine();
            System.out.println("Introduce nombre programador");
            Programador p = new Programador();
            p.setNombre(sc.nextLine());

            System.out.println("¿Está casad@? s/n");
            if (sc.nextLine().toLowerCase().equals("s")) {
                p.setCasado(true);
            } else {
                p.setCasado(false);
            }

            System.out.println("Líneas de código por hora");
            p.setLineasDeCodigoPorHora(sc.nextInt());
            System.out.println("Introduzca su edad");
            p.setEdad(sc.nextInt());

            System.out.println(p);

        } else {
            sc.nextLine();
            System.out.println("Introduce nombre administrativo");
            Administrativo a = new Administrativo();
            a.setNombre(sc.nextLine());

            System.out.println("¿Está casad@? s/n");
            if (sc.nextLine().toLowerCase().equals("s")) {
                a.setCasado(true);
            } else {
                a.setCasado(false);
            }

            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");
            String nivel = sc.nextLine();
            System.out.println("Introduzca su edad");
            a.setEdad(sc.nextInt());
            switch (nivel) {
                case "a":
                    a.setnIngles(NivelIngles.ALTO);
                    break;
                case "m":
                    a.setnIngles(NivelIngles.MEDIO);
                    break;
                case "b":
                    a.setnIngles(NivelIngles.BAJO);
                    break;
                default:
                    a.setnIngles(NivelIngles.BAJO);

            }

            System.out.println(a);

        }

    }
    
}
