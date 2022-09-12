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
public class Cursos {
   private String id_curso,nombre_curso,fecha_ini,fecha_fin,precio;

    public Cursos() {
    }

    public Cursos(String id_curso, String nombre_curso, String fecha_ini, String fecha_fin, String precio) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.precio = precio;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cursos{" + "id_curso=" + id_curso + ", nombre_curso=" + nombre_curso + ", fecha_ini=" + fecha_ini + ", fecha_fin=" + fecha_fin + ", precio=" + precio + '}';
    }
   
}
