package model;

public class GatilhoDor extends InformacaoDor{
	// atributos
	public String recorrencia_gatilho;
	
	// construtor
	public GatilhoDor(String nome, String descricao, String recorrencia_gatilho) {
		super(nome, descricao);
		this.recorrencia_gatilho = recorrencia_gatilho;
	}

	// gets e sets
	public String getRecorrencia_gatilho() {
		return recorrencia_gatilho;
	}

	public void setRecorrencia_gatilho(String recorrencia_gatilho) {
		this.recorrencia_gatilho = recorrencia_gatilho;
	}

}
