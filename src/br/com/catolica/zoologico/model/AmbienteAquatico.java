package br.com.catolica.zoologico.model;

public class AmbienteAquatico extends Ambiente{

    public int quantBolhas;
    public boolean algaPerto;
    public int quantidadePeixes;
    public boolean fugindoDeTubarao;
    public int quantidadeAnimais;

    public AmbienteAquatico(String nomeAmbiente, String temperatura, int quantBolhas, boolean algaPerto, int quantidadePeixes, boolean fugindoDeTubarao, int quantidadeAnimais, int tamanho){
        super(tamanho);
        this.setNomeAmbiente(nomeAmbiente);
        this.setTemperatura(temperatura);
        this.quantBolhas = quantBolhas;
        this.algaPerto = true;
        this.quantidadePeixes = quantidadePeixes;
        this.fugindoDeTubarao = true;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    @Override
    public String toString() {
        return "AmbienteAquatico{" +
                "quantBolhas=" + quantBolhas +
                ", algaPerto=" + algaPerto +
                ", quantidadePeixes='" + quantidadePeixes + '\'' +
                ", fugindoDeTubarao=" + fugindoDeTubarao +
                ", quantidadeAnimais=" + quantidadeAnimais +
                '}';
    }
}
