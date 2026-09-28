package com.uped.musica.modelo;

public class Bateria extends Instrumento {

    private int numeroTambores;

    public Bateria(String nombre, String marca, int numeroTambores) {
        super(nombre, marca);
        this.numeroTambores = numeroTambores;
    }

    @Override
    public void tocar() {
        System.out.println("La batería toca un ritmo de percusión.");
    }

    public int getNumeroTambores() {
        return numeroTambores;
    }
}