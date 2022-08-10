package model;

public class MedicacaoUtilizada extends InformacaoDor {
	public String dosagem;
	public String funcionamento_medicacao;

	public MedicacaoUtilizada(String nome, String descricao, String dosagem, String funcionamento_medicacao) {
		super(nome, descricao);
		this.dosagem = dosagem;
		this.funcionamento_medicacao = funcionamento_medicacao;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getFuncionamento_medicacao() {
		return funcionamento_medicacao;
	}

	public void setFuncionamento_medicacao(String funcionamento_medicacao) {
		this.funcionamento_medicacao = funcionamento_medicacao;
	}

}
