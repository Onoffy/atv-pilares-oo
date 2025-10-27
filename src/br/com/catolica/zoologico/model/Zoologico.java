package br.com.catolica.zoologico.model;

public class Zoologico {

    public String nome;
    public String endereco;
    public String telefone;
    public String horarioFuncionamento;
    public Ambiente[] ambientes;

    public Zoologico(String nome, String endereco, String telefone, String horarioFuncionamento, int quantAmbientes){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
        this.ambientes = new Ambiente[quantAmbientes];
    }

    public boolean addAmbiente(Ambiente ambiente){
        for (int i = 0;i < this.ambientes.length;i++){
            if (this.ambientes[i] == null){
                this.ambientes[i] = ambiente;
                return true;
            }
        }
        return false;
    }

    public void mostrarAmbiente(){
        for (int i = 0;i < this.ambientes.length;i++) {
            System.out.println(this.ambientes[i]);
        }
    }

    public Ambiente pesquisarAmbiente(String nome){
        for (int i = 0;i < this.ambientes.length;i++){
            if (this.ambientes[i].getNomeAmbiente().equals(nome)){
                return this.ambientes[i];
            }
        }
        return null;
    }

    public boolean addAnimalAmbiente(String nome, Animal animal){
        Ambiente encontrarAmbiente = this.pesquisarAmbiente(nome);
        if (encontrarAmbiente != null){
            boolean resultado = encontrarAmbiente.addAnimais(animal);
            return resultado;
        }
        return false;
    }

    public boolean removAnimalAmbiente(String nome, Animal nomeAnimal){
        Ambiente encontrarAmbiente = this.pesquisarAmbiente(nome);
        for (int i = 0;i < this.ambientes.length;i++){
            if (encontrarAmbiente.getAnimais()[i].equals(nomeAnimal)){
                encontrarAmbiente.getAnimais()[i] = null;
                return true;
            }
        }
        return false;
    }

}
