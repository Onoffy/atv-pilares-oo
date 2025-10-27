package br.com.catolica.zoologico.model;

abstract class Animal {

    // atributos
    private String nomeAnimal;
    private String especie;
    private String sexo;
    private double peso;
    private int idade;


    public Animal(){}

    // métodos
    public void setNome(String nome) {
        this.nomeAnimal = nome;
    }

    public String getNome() {
        return this.nomeAnimal;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void atacar(String atacar){
        System.out.println(atacar);
    }

    public void perseguir(String perseguir){
        System.out.println(perseguir);
    }

    public void dormir(String dormir){
        System.out.println(dormir);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nomeAnimal + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                '}';
    }
}
