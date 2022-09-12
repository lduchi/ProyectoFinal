package Modelo;

public class Alumno extends Persona {   
    
    private String curso;
    public Alumno() {
        super();
    }

    public Alumno(String curso) {
        this.curso = curso;
    }

    public Alumno(String curso, String cedula, String edad, String nombres, String apellidos, String telefono, String direccion) {
        super(cedula, edad, nombres, apellidos, telefono, direccion);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "curso=" + curso + '}';
    }
   
}