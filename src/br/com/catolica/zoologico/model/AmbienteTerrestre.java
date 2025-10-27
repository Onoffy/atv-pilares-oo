package br.com.catolica.zoologico.model;

public class AmbienteTerrestre extends Ambiente{

    public String tipoRelevo;
    public String tipoVegetacao;
    public String tipoSolo;
    public boolean aguaPerto;
    public int quantidadeAnimais;

    public AmbienteTerrestre(String nomeAmbiente, String temperatura, String tipoRelevo, String tipoVegetacao, String tipoSolo, boolean aguaPerto, int quantidadeAnimais, int tamanho){
        super(tamanho);
        this.setNomeAmbiente(nomeAmbiente);
        this.setTemperatura(temperatura);
        this.tipoRelevo = tipoRelevo;
        this.tipoVegetacao = tipoVegetacao;
        this.tipoSolo = tipoSolo;
        this.aguaPerto = true;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    @Override
    public String toString() {
        return "AmbienteTerrestre{" +
                "tipoRelevo='" + tipoRelevo + '\'' +
                ", tipoVegetacao='" + tipoVegetacao + '\'' +
                ", tipoSolo='" + tipoSolo + '\'' +
                ", aguaPerto=" + aguaPerto +
                ", quantidadeAnimais=" + quantidadeAnimais +
                '}';
    }
}
