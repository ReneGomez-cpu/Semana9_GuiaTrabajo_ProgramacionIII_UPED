package com.uped.musica.modelo;

public abstract class Instrumento {

    protected String nombre;
    protected String marca;

    public Instrumento(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public abstract void tocar();

    public final void mostrarFicha() {
        System.out.println("Instrumento: " + nombre
                + " | Marca: " + marca);
    }
}