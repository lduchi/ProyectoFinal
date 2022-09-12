/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Luis Miguel
 */
public class Validaciones {

    public boolean validarCedula(String texto) {

        texto = texto.trim();

        if (!texto.isEmpty()) {

            if (texto.matches("^[0-9]{10}$")) {
                return true;
            }
        }

        return false;
    }

    public boolean validarApellidosyNombre(String texto) {

        texto = texto.trim();

        if (!texto.isEmpty()) {

            if (texto.matches("^([a-zA-Z]+[ ]?){2}$")) {
                return true;
            }
        }
        return false;
    }

    public boolean validarEdad(String numero) {

        if (numero.isEmpty()) {
            return false;
        } else {

            numero = numero.trim();

            if (numero.matches("^[0-9]*$")) {

                int entero = Integer.parseInt(numero);

                if (entero >= 15 & entero <= 120) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean validarTelefono(String telefono) {
        boolean validar = false;
        telefono = telefono.trim();
        String inicio = telefono.substring(0, 2);

        if (telefono.matches("[0-9]{10}")) {
            if (inicio.equalsIgnoreCase("09")) {
                validar = true;
            }
        }
        return validar;
    }

    public boolean validarTextoConEspacio(String texto) {

        texto = texto.trim();

        if (!texto.isEmpty()) {

            if (texto.matches("^[A-Za-z\\s]*")) {
                return true;
            }
        }

        return false;
    }

    public boolean Validarcodigo(String codigo) {
        if (codigo.matches("[0-9]{5}")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Validarnombrec(String nombre) {
        if (nombre.matches("[A-Za-z]{1,50}")) {
            return true;
        } else {
            return false;
        }
    }

    
     public boolean Validarprecio(String numero) {

        if (numero.isEmpty()) {
            return false;
        } else {

            numero = numero.trim();

            if (numero.matches("^[0-9]*$")) {

                int entero = Integer.parseInt(numero);

                if (entero >= 30 & entero <= 150) {

                    return true;
                }
            }
        }
        return false;
    }

}
