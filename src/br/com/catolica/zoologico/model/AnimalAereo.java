package br.com.catolica.zoologico.model;

public abstract class AnimalAereo extends Animal {

    public void voar(String voar){
        System.out.println(voar);
    }

    public void pousar(String pousar){
        System.out.println(pousar);
    }

    public void decolar(String decolar){
        System.out.println(decolar);
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
