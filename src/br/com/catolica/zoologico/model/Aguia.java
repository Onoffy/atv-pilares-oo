package br.com.catolica.zoologico.model;

public class Aguia extends AnimalAereo{

    public Aguia(String nome, String especie, String sexo, double peso, int idade){
        this.setNome(nome);
        this.setEspecie(especie);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setIdade(idade);
    }

    @Override
    public void voar(String voar){
        System.out.println("A ação da Águia: " + voar);
    }

    @Override
    public void pousar(String pousar){
        System.out.println("A ação da Águia: " + pousar);
    }

    @Override
    public void decolar(String decolar){
        System.out.println("A ação da Águia: " + decolar);
    }

}
