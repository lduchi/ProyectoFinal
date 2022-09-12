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
public class Calificaciones {
    private String nota, promedio;
    private Alumno alumno1;

    public Calificaciones() {
    }

    public Calificaciones(String nota, String promedio, Alumno alumno1) {
        this.nota = nota;
        this.promedio = promedio;
        this.alumno1 = alumno1;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public Alumno getAlumno1() {
        return alumno1;
    }

    public void setAlumno1(Alumno alumno1) {
        this.alumno1 = alumno1;
    }

    @Override
    public String toString() {
        return "Calificaciones{" + "nota=" + nota + ", promedio=" + promedio + ", alumno1=" + alumno1 + '}';
    }
    
}
