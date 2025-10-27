package br.com.catolica.zoologico.main;

import br.com.catolica.zoologico.model.*;

public class Main {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico(
                "Red Sun",
                "Rua incrível",
                "83912345678",
                "6h",
                3
        );

        AmbienteTerrestre ambienteTerrestre = new AmbienteTerrestre(
                "Ambiente Terrestre",
                "24°C",
                "Planalto",
                "Savana",
                "Latossolo",
                true,
                16,
                12
        );
        zoologico.addAmbiente(ambienteTerrestre);

        AmbienteAereo ambienteAereo = new AmbienteAereo(
                "Ambiente Aéreo",
                "22°C",
                "Robô gigante",
                false,
                24,
                true,
                12,
                8
        );
        zoologico.addAmbiente(ambienteAereo);

        AmbienteAquatico ambienteAquatico = new AmbienteAquatico(
                "Ambiente Aquático",
                "22°C",
                1534,
                false,
                12,
                true,
                21,
                155
        );
        zoologico.addAmbiente(ambienteAquatico);

        System.out.println("-----Ambientes-----");
        zoologico.mostrarAmbiente();

        Lobo lobo = new Lobo(
                "Sekiro",
                "Lobo-cinzento",
                "Masculino",
                54.12,
                14
        );

        zoologico.addAnimalAmbiente("Ambiente Terrestre", lobo);

        System.out.println("-----Animais Terrestres-----");
        ambienteTerrestre.mostrarAnimais();

    }
}
