/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jhose
 */
public class Rutina {
    private int idRutina;
    private Cliente cliente;
    private Entrenador entrenador;
    private String nombre;
    private String objetivo;
    private String descripcion;

    public Rutina() {
    }

    public Rutina(int idRutina,
            Cliente cliente,
            Entrenador entrenador,
            String nombre,
            String objetivo,
            String descripcion) {

        this.idRutina = idRutina;
        this.cliente = cliente;
        this.entrenador = entrenador;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.descripcion = descripcion;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
