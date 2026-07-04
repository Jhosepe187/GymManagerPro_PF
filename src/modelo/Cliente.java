/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jhose
 */
public class Cliente extends Persona {

    private String direccion;
    private String fechaRegistro;
    private boolean estado;

    public Cliente() {
    }

    public Cliente(int id, String dni, String nombres, String apellidos,
            String telefono, String correo,
            String direccion, String fechaRegistro, boolean estado) {

        super(id, dni, nombres, apellidos, telefono, correo);

        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    @Override
    public String mostrarInformacion() {
        return nombres + " " + apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
