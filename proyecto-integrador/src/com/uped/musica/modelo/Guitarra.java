package com.uped.musica.modelo;

public class Guitarra extends Instrumento {

    private int numeroCuerdas;

    public Guitarra(String nombre, String marca, int numeroCuerdas) {
        super(nombre, marca);
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void tocar() {
        System.out.println("La guitarra toca una melodía de cuerdas.");
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }
}