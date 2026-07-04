/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jhose
 */
public class Entrenador extends Persona {

    private int id;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String especialidad;
    private boolean estado;

    public Entrenador() {
    }

    public Entrenador(int id, String dni, String nombres,
            String apellidos, String telefono,
            String correo, String especialidad,
            boolean estado) {

        super(id, dni, nombres, apellidos, telefono, correo);

        this.especialidad = especialidad;
        this.estado = estado;
    }

    @Override
    public String mostrarInformacion() {
        return nombres + " " + apellidos + " - " + especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
