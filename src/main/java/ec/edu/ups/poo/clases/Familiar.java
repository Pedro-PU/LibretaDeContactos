/*
 * Carrera: Computación
 * Materia: Programacion Orientada a Objetos
 * Docente: Gabriel Alejandro Leon Paredes
 * Estudiante: Pedro Xavier Pesántez Urgilés
 */
package ec.edu.ups.poo.clases;
import java.util.GregorianCalendar;

public class Familiar extends Persona{
    //Atributos
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;

    public Familiar(){};

    public Familiar(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaNacimiento, String parentesco, String tipoDeSangre) {
        super(cedula, nombre, apellido, direccion);
        this.fechaNacimiento = fechaNacimiento;
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double calcularEdad() {
        GregorianCalendar hoy = new GregorianCalendar();
        int añoActual = hoy.get(GregorianCalendar.YEAR);
        int mesActual = hoy.get(GregorianCalendar.MONTH);
        int diaActual = hoy.get(GregorianCalendar.DAY_OF_MONTH);

        int añoNacimiento = fechaNacimiento.get(GregorianCalendar.YEAR);
        int mesNacimiento = fechaNacimiento.get(GregorianCalendar.MONTH);
        int diaNacimiento = fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH);

        int edad = añoActual - añoNacimiento;

        if (mesActual > mesNacimiento || (mesActual == mesNacimiento && diaActual >= diaNacimiento)) {
            return edad;
        } else {
            return edad - 1;
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Parentesco: " + parentesco +
                ", Tipo de Sangre: " + tipoDeSangre +
                ", Edad: " + calcularEdad();
    }

    //Crear método calcular edad para imprimir en vez de GregorianCalendar
}
