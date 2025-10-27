package br.com.catolica.zoologico.model;

public class Tubarao extends AnimalAquatico{

    public Tubarao(String nome, String especie, String sexo, double peso, int idade){
        this.setNome(nome);
        this.setEspecie(especie);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setIdade(idade);
    }

    @Override
    public void nadar(String nadar){
        System.out.println("A ação do Tubarão: " + nadar);
    }

    @Override
    public void propulsionar(String propulsionar){
        System.out.println("A ação do Tubarão: " + propulsionar);
    }

    @Override
    public void mergulhar(String mergulhar){
        System.out.println("A ação do Tubarão: " + mergulhar);
    }

}
