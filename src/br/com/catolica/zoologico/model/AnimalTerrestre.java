package br.com.catolica.zoologico.model;

public abstract class AnimalTerrestre extends Animal {

    public void andar(String andar){
        System.out.println(andar);
    }

    public void correr(String correr){
        System.out.println(correr);
    }

    public void esgueirar(String esgueirar){
        System.out.println(esgueirar);
    }

    @Override
    public void atacar(String atacar){
        super.atacar(atacar);
    }

    @Override
    public void perseguir(String perseguir){
        super.perseguir(perseguir);
    }

    @Override
    public void dormir(String dormir){
        super.perseguir(dormir);
    }

}
