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
public class Grabacion {
    private String fecha_graba,hora_ini_grab,hora_fin_grab;
    private Alumno alum_grab;
    private Productor productor1;

    public Grabacion() {
    }

    public Grabacion(String fecha_graba, String hora_ini_grab, String hora_fin_grab, Alumno alum_grab, Productor productor1) {
        this.fecha_graba = fecha_graba;
        this.hora_ini_grab = hora_ini_grab;
        this.hora_fin_grab = hora_fin_grab;
        this.alum_grab = alum_grab;
        this.productor1 = productor1;
    }

    public String getFecha_graba() {
        return fecha_graba;
    }

    public void setFecha_graba(String fecha_graba) {
        this.fecha_graba = fecha_graba;
    }

    public String getHora_ini_grab() {
        return hora_ini_grab;
    }

    public void setHora_ini_grab(String hora_ini_grab) {
        this.hora_ini_grab = hora_ini_grab;
    }

    public String getHora_fin_grab() {
        return hora_fin_grab;
    }

    public void setHora_fin_grab(String hora_fin_grab) {
        this.hora_fin_grab = hora_fin_grab;
    }

    public Alumno getAlum_grab() {
        return alum_grab;
    }

    public void setAlum_grab(Alumno alum_grab) {
        this.alum_grab = alum_grab;
    }

    public Productor getProductor1() {
        return productor1;
    }

    public void setProductor1(Productor productor1) {
        this.productor1 = productor1;
    }

    @Override
    public String toString() {
        return "Grabacion{" + "fecha_graba=" + fecha_graba + ", hora_ini_grab=" + hora_ini_grab + ", hora_fin_grab=" + hora_fin_grab + ", alum_grab=" + alum_grab + ", productor1=" + productor1 + '}';
    }
    
    
}
