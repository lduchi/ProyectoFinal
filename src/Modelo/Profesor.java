/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ISTA
 */
public class Profesor extends Persona{
    private String titulo_prof;

    public Profesor() {
        super();
    }

    public Profesor(String titulo_prof) {
        this.titulo_prof = titulo_prof;
    }

    public Profesor(String titulo_prof, String cedula, String edad, String nombres, String apellidos, String telefono, String direccion) {
        super(cedula, edad, nombres, apellidos, telefono, direccion);
        this.titulo_prof = titulo_prof;
    }

    public String getTitulo_prof() {
        return titulo_prof;
    }

    public void setTitulo_prof(String titulo_prof) {
        this.titulo_prof = titulo_prof;
    }

    @Override
    public String toString() {
        return "Profesor{" + "titulo_prof=" + titulo_prof + '}';
    }
    
}
