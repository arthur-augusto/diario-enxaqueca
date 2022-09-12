package control;

import model.*;

public class ControleDados {
	
	private Dados d = new Dados();
	
	public ControleDados() {
		d.gerarDados();
	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public DorDeCabeca[] getDoresDeCabeca() {
		return this.d.getDoresDeCabeca();
	}
	
	public int getQtdDoresDeCabeca() {
		return this.d.getQtdDoresDeCabeca();
	}
	
	public SintomaDor[] getSintomas() {
		return this.d.getSintomas();
	}
	
	public int getQtdSintomas() {
		return this.d.getQtdSintomas();
	}
	
	public GatilhoDor[] getGatilhos() {
		return this.d.getGatilhos();
	}
	
	public int getQtdGatilhos() {
		return this.d.getQtdGatilhos();
	}
	
	public MedicacaoUtilizada[] getMedicacoes() {
		return this.d.getMedicacoes();
	}
	
	public int getQtdMedicacoes() {
		return this.d.getQtdMedicacoes();
	}
	
	public void inserirAtualizarEntrada(String[] dadoNovo) {
		
		DorDeCabeca dor = new DorDeCabeca(dadoNovo[1], dadoNovo[2], Integer.parseInt(dadoNovo[3]),
				Integer.parseInt(dadoNovo[4]), dadoNovo[9], dadoNovo[5], new SintomaDor("", "", ""),
				new GatilhoDor("", "", ""), new MedicacaoUtilizada("", "", "", ""));
		
		d.inserirEditarDorDeCabeca(dor, Integer.parseInt(dadoNovo[0]));
		
	}
}
