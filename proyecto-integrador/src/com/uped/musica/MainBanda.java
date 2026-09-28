package com.uped.musica;

import com.uped.musica.modelo.Bateria;
import com.uped.musica.modelo.Guitarra;
import com.uped.musica.modelo.Instrumento;
import com.uped.musica.modelo.Piano;

public class MainBanda {

    public static void main(String[] args) {

        Instrumento guitarra =
                new Guitarra("Guitarra eléctrica", "Fender", 6);

        Instrumento piano =
                new Piano("Piano acústico", "Yamaha", 88);

        Instrumento bateria =
                new Bateria("Batería acústica", "Pearl", 5);

        System.out.println("================================");
        System.out.println("       BANDA MUSICAL");
        System.out.println("================================");

        System.out.println("\n--- GUITARRA ---");
        guitarra.mostrarFicha();
        guitarra.tocar();

        System.out.println("\n--- PIANO ---");
        piano.mostrarFicha();
        piano.tocar();

        System.out.println("\n--- BATERÍA ---");
        bateria.mostrarFicha();
        bateria.tocar();

        System.out.println("\n================================");
        System.out.println("       FIN DEL PROGRAMA");
        System.out.println("================================");
    }
}