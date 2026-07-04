/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jhose
 */
public class Membresia {
    private int idMembresia;
    private String nombre;
    private int duracion;
    private double precio;
    private String descripcion;

    public Membresia() {
    }

    public Membresia(int idMembresia, String nombre,
            int duracion, double precio,
            String descripcion) {

        this.idMembresia = idMembresia;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
