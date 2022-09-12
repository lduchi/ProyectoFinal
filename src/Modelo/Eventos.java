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
public class Eventos {
    private String fecha_eve,nombre_eve,hora_inicio,hora_fin,categoria;

    public Eventos() {
    }

    public Eventos(String fecha_eve, String nombre_eve, String hora_inicio, String hora_fin, String categoria) {
        this.fecha_eve = fecha_eve;
        this.nombre_eve = nombre_eve;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.categoria = categoria;
    }

    public String getFecha_eve() {
        return fecha_eve;
    }

    public void setFecha_eve(String fecha_eve) {
        this.fecha_eve = fecha_eve;
    }

    public String getNombre_eve() {
        return nombre_eve;
    }

    public void setNombre_eve(String nombre_eve) {
        this.nombre_eve = nombre_eve;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Eventos{" + "fecha_eve=" + fecha_eve + ", nombre_eve=" + nombre_eve + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + ", categoria=" + categoria + '}';
    }
    
}
