/*
 * Carrera: Computación
 * Materia: Programacion Orientada a Objetos
 * Docente: Gabriel Alejandro Leon Paredes
 * Estudiante: Pedro Xavier Pesántez Urgilés
 */
package ec.edu.ups.poo.principal;
import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;
//Para importar solo en una línea es ec.edu.ups.poo.clases.Persona en vez de usar el import
//Para importar todas las clases de ese paquete es import ec.edu.ups.poo.clases.Persona*
public class Principal {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        //Personas
        System.out.print("Cuantas personas quieres ingresar: ");
        int numPersonas = lector.nextInt();
        System.out.println("-".repeat(45));
        Persona[] personas = new Persona[numPersonas];
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\tPersona  " + (i+1));
            System.out.print("Ingrese la cedula "+(i+1)+" : ");
            String cedula = lector.next();
            System.out.print("Ingrese el nombre "+(i+1)+" :  ");
            String nombre = lector.next();
            System.out.print("Ingrese el apellido "+(i+1)+" : ");
            String apellido = lector.next();
            lector.nextLine();
            System.out.print("Ingrese el direccion "+(i+1)+" : ");
            String direccion = lector.nextLine();

            //personas[i] = persona;
            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        System.out.println("-".repeat(45));

        for (int i = 0; i < numPersonas; i++) {
            /*System.out.println("Persona "+(i+1)+" {"+"cedula = "+personas[i].getCedula()+
                    " nombre = "+personas[i].getNombre()+
                    " apellido = "+personas[i].getApellido()+
                    " dirección = "+personas[i].getDireccion()+"}");*/
            Persona persona = personas[i];
            System.out.println(persona);
        }
        //Familiares
        System.out.println("-".repeat(45));
        System.out.print("Cuántos familiares quieres ingresar: ");
        int numFamiliares = lector.nextInt();
        System.out.println("-".repeat(45));
        Familiar[] familiares = new Familiar[numFamiliares];

        for (int i = 0; i < numFamiliares; i++) {
            System.out.println("\tFamiliar " + (i+1));
            System.out.print("Ingrese la cédula "+(i+1)+" : ");
            String cedula = lector.next();
            System.out.print("Ingrese el nombre "+(i+1)+" : ");
            String nombre = lector.next();
            System.out.print("Ingrese el apellido "+(i+1)+" : ");
            String apellido = lector.next();
            lector.nextLine();
            System.out.print("Ingrese la dirección "+(i+1)+" : ");
            String direccion = lector.nextLine();
            System.out.print("Ingrese el parentesco "+(i+1)+" : ");
            String parentesco = lector.next();
            System.out.print("Ingrese el tipo de sangre "+(i+1)+" : ");
            String tipoDeSangre = lector.next();

            System.out.print("Ingrese el año de nacimiento "+(i+1)+" : ");
            int año = lector.nextInt();
            System.out.print("Ingrese el mes de nacimiento (1-12): ");
            int mes = lector.nextInt() - 1;//mes 0 - 11
            System.out.print("Ingrese el día de nacimiento "+(i+1)+" : ");
            int dia = lector.nextInt();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(año, mes, dia);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, fechaNacimiento, parentesco, tipoDeSangre);
        }
        System.out.println("-".repeat(45));

        for (int i = 0; i < numFamiliares; i++) {
            Familiar familiar = familiares[i];
            System.out.println(familiar);
        }

    }
}
