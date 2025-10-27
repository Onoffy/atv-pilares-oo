package br.com.catolica.zoologico.model;

public class Peixe extends AnimalAquatico{

    public Peixe(String nome, String especie, String sexo, double peso, int idade){
        this.setNome(nome);
        this.setEspecie(especie);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setIdade(idade);
    }

    @Override
    public void nadar(String nadar){
        System.out.println("A ação do Peixe: " + nadar);
    }

    @Override
    public void propulsionar(String propulsionar){
        System.out.println("A ação do Peixe: " + propulsionar);
    }

    @Override
    public void mergulhar(String mergulhar){
        System.out.println("A ação do Peixe: " + mergulhar);
    }

}
