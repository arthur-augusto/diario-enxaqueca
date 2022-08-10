package model;

public class SintomaDor extends InformacaoDor {
	public String duracao_sintoma;

	public SintomaDor(String nome, String descricao, String duracao_sintoma) {
		super(nome, descricao);
		this.duracao_sintoma = duracao_sintoma;
	}

	public String getDuracao_sintoma() {
		return duracao_sintoma;
	}

	public void setDuracao_sintoma(String duracao_sintoma) {
		this.duracao_sintoma = duracao_sintoma;
	}

}
