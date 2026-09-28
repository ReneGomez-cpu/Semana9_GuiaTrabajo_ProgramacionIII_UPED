package com.uped.musica.modelo;

public class Piano extends Instrumento {

    private int numeroTeclas;

    public Piano(String nombre, String marca, int numeroTeclas) {
        super(nombre, marca);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("El piano toca una melodía con sus teclas.");
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }
}