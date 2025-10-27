package br.com.catolica.zoologico.model;

public abstract class AnimalAquatico extends Animal {

    public void nadar(String nadar){
        System.out.println(nadar);
    }

    public void propulsionar(String propulsionar){
        System.out.println(propulsionar);
    }

    public void mergulhar(String mergulhar){
        System.out.println(mergulhar);
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
