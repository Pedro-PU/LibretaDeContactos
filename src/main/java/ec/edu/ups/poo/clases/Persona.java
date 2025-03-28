/*
 * Carrera: Computación
 * Materia: Programacion Orientada a Objetos
 * Docente: Gabriel Alejandro Leon Paredes
 * Estudiante: Pedro Xavier Pesántez Urgilés
 */
package ec.edu.ups.poo.clases;
public class Persona {
    //Atributos
    /*
    * No tienen un val  or inicial
    * Siempre tienen que ser privados
    * Los atributos por defecto (default) sólo se puede usar en las clases del mismo paquete
    */
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(){};

    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    //Clase Object, clase padre de todas las clases
    @Override //Método Sobreescrito(de la clase padre), pero implementandolo de otra forma
    public String toString(){
        return " Cedula: "+ cedula +
                ", Nombre: "+nombre+
                ", Apellido: "+apellido+
                ", Dirección: "+direccion;
    }
}
