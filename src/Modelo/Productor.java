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
public class Productor extends Persona {
    private String dias_labora;

    public Productor() {
        super();
    }

    public Productor(String dias_labora) {
        this.dias_labora = dias_labora;
    }

    public Productor(String dias_labora, String cedula, String edad, String nombres, String apellidos, String telefono, String direccion) {
        super(cedula, edad, nombres, apellidos, telefono, direccion);
        this.dias_labora = dias_labora;
    }

    public String getDias_labora() {
        return dias_labora;
    }

    public void setDias_labora(String dias_labora) {
        this.dias_labora = dias_labora;
    }

    @Override
    public String toString() {
        return "Productor{" + "dias_labora=" + dias_labora + '}';
    }
    
}
