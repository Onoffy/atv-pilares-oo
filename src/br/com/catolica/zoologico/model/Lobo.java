package br.com.catolica.zoologico.model;

public class Lobo extends AnimalTerrestre{

    public Lobo(String nome, String especie, String sexo, double peso, int idade){
        this.setNome(nome);
        this.setEspecie(especie);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setIdade(idade);
    }

    @Override
    public void andar(String andar){
        System.out.println("A ação do Lobo: " + andar);
    }

    @Override
    public void correr(String correr){
        System.out.println("A ação do Lobo: " + correr);
    }

    @Override
    public void esgueirar(String esgueirar){
        System.out.println("A ação do Lobo: " + esgueirar);
    }

}
