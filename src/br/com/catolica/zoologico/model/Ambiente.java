package br.com.catolica.zoologico.model;

abstract class Ambiente {

    // atributos
    private String nomeAmbiente;
    private String temperatura;
    private Animal[] animais;

    public Ambiente(int tamanho){
        this.animais = new Animal[tamanho];
    }

    public boolean addAnimais(Animal animal){
        for (int i = 0;i < this.animais.length;i++){
            if (this.animais[i] == null){
                this.animais[i] = animal;
                return true;
            }
        }
        return false;
    }

    public void mostrarAnimais(){
        for (int i = 0;i < this.animais.length;i++){
            if (this.animais[i] != null){
                System.out.println(this.animais[i]);
            }
        }
    }

    public void setNomeAmbiente(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }

    public String getNomeAmbiente() {
        return nomeAmbiente;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return this.temperatura;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public Animal[] getAnimais() {
        return this.animais;
    }

}
