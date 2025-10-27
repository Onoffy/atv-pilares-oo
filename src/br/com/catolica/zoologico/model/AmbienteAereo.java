package br.com.catolica.zoologico.model;

public class AmbienteAereo extends Ambiente {

    public String formatoNuvens;
    public boolean dia;
    public int quantidadeNuvens;
    public boolean chovendo;
    public int quantidadeAnimais;

    public AmbienteAereo(String nomeAmbiente, String temperatura, String formatoNuvens, boolean dia, int quantidadeNuvens, boolean chovendo, int quantidadeAnimais, int tamanho){
        super(tamanho);
        this.setNomeAmbiente(nomeAmbiente);
        this.setTemperatura(temperatura);
        this.formatoNuvens = formatoNuvens;
        this.dia = false;
        this.quantidadeNuvens = quantidadeNuvens;
        this.chovendo = true;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    @Override
    public String toString() {
        return "AmbienteAereo{" +
                "formatoNuvens='" + formatoNuvens + '\'' +
                ", dia=" + dia +
                ", quantidadeNuvens='" + quantidadeNuvens + '\'' +
                ", chovendo=" + chovendo +
                ", quantidadeAnimais=" + quantidadeAnimais +
                '}';
    }
}
