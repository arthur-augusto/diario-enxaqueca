package model;

public class Relatorio {
	private String data_inicio;
	private String data_fim;
	private DorDeCabeca[] dores = new DorDeCabeca[31];

	public Relatorio(String data_inicio, String data_fim) {
		super();
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}

	public String getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}

	public String getData_fim() {
		return data_fim;
	}

	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}

	public DorDeCabeca[] getDores() {
		return dores;
	}

	public void setDores(DorDeCabeca[] dores) {
		this.dores = dores;
	}
}
