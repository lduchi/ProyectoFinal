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
public class Admin extends Persona {
    private String cargo;

    public Admin() {
        super();
    }

    public Admin(String cargo) {
        this.cargo = cargo;
    }

    public Admin(String cargo, String cedula, String edad, String nombres, String apellidos, String telefono, String direccion) {
        super(cedula, edad, nombres, apellidos, telefono, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Admin{" + "cargo=" + cargo + '}';
    }
    
}
