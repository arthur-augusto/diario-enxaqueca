/**
 * Armazena os dados da aplicação.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class Dados {
	
	private DorDeCabeca[] doresDeCabeca = new DorDeCabeca[40];
	private int qtdDoresDeCabeca = 0;
	
	private SintomaDor[] sintomas = new SintomaDor[20];
	private int qtdSintomas = 0;
	
	private GatilhoDor[] gatilhos = new GatilhoDor[20];
	private int qtdGatilhos = 0;
	
	private MedicacaoUtilizada[] medicacoes = new MedicacaoUtilizada[20];
	private int qtdMedicacoes = 0;
	
	public void gerarDados() {
		
		sintomas[0] = new SintomaDor("Nenhum", "", "");
		sintomas[1] = new SintomaDor("Náusea", "", "2");
		sintomas[2] = new SintomaDor("Vômito", "", "1");
		sintomas[3] = new SintomaDor("Enxaqueca com aura", "", "1");
		
		qtdSintomas = 4;
		
		gatilhos[0] = new GatilhoDor("Nenhum", "", "");
		gatilhos[1] = new GatilhoDor("Atividade física intensiva", "", "Três vezes na semana");
		gatilhos[2] = new GatilhoDor("Cafeína", "", "Diário");
		gatilhos[3] = new GatilhoDor("Sono muito curto ou muito longo", "", "");
		gatilhos[4] = new GatilhoDor("Estresse", "", "");
		gatilhos[5] = new GatilhoDor("Fumar", "", "Diário");
		gatilhos[6] = new GatilhoDor("Menstruação", "", "Mensal");
		gatilhos[7] = new GatilhoDor("Odores fortes", "", "");
		gatilhos[8] = new GatilhoDor("Postura incorreta", "", "");
		gatilhos[9] = new GatilhoDor("Refeição ignorada", "", "");
		gatilhos[10] = new GatilhoDor("Tiramina", "", "");
		gatilhos[11] = new GatilhoDor("Álcool", "", "Semanal");
		
		qtdGatilhos = 12;
		
		medicacoes[0] = new MedicacaoUtilizada("Nenhum", "", "", "");
		medicacoes[1] = new MedicacaoUtilizada("Acetaminofeno / Paracetamol", "", "500mg", "Não");
		medicacoes[2] = new MedicacaoUtilizada("Advil", "", "1200mg", "Sim");
		medicacoes[3] = new MedicacaoUtilizada("Aspirina", "", "500mg", "Sim");
		medicacoes[4] = new MedicacaoUtilizada("Frovatriptan", "", "2,5mg", "Sim");
		medicacoes[5] = new MedicacaoUtilizada("Ibuprofeno", "", "500mg", "Funcionou um pouco");
		medicacoes[6] = new MedicacaoUtilizada("Naproxeno", "", "550mg", "Não");
		medicacoes[7] = new MedicacaoUtilizada("Nurofen Enxaqueca", "", "400mg", "Funcionou um pouco");
		medicacoes[8] = new MedicacaoUtilizada("Rizatriptano", "", "5mg", "Funcionou um pouco");
		medicacoes[9] = new MedicacaoUtilizada("Sumatriptano", "", "25mg", "Não");
		
		qtdMedicacoes = 10;
		
		doresDeCabeca[0] = new DorDeCabeca("01-09-2022", "01:40", 3, 2, "", "Ambos os lados", 
				sintomas[0], gatilhos[0], medicacoes[0]);
		
		doresDeCabeca[1] = new DorDeCabeca("02-09-2022", "19:38", 1, 1, "Estavam pintando o escritório ao lado", 
				"Atrás dos olhos", sintomas[0], gatilhos[0], medicacoes[0]);
		
		doresDeCabeca[2] = new DorDeCabeca("03-09-2022", "16:56", 2, 3,  "", "Lado direito", 
				sintomas[0], gatilhos[0], medicacoes[0]);
		
		doresDeCabeca[3] = new DorDeCabeca("04-09-2022", "01:19", 4, 4,  "", "Ambos os Lados", 
				sintomas[0], gatilhos[0], medicacoes[0]);
		
		doresDeCabeca[4] = new DorDeCabeca("05-09-2022", "21:23", 1, 1,  "", "Testa", 
				sintomas[0], gatilhos[0], medicacoes[0]);
		
		qtdDoresDeCabeca = 5;
	}
	
	public DorDeCabeca[] getDoresDeCabeca() {
		return doresDeCabeca;
	}
	
	public void setDoresDeCabeca(DorDeCabeca[] doresDeCabeca) {
		this.doresDeCabeca = doresDeCabeca;
	}
	
	public int getQtdDoresDeCabeca() {
		return qtdDoresDeCabeca;
	}
	
	public void setQtdDoresDeCabeca(int qtdDoresDeCabeca) {
		this.qtdDoresDeCabeca = qtdDoresDeCabeca;
	}
	
	public SintomaDor[] getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(SintomaDor[] sintomas) {
		this.sintomas = sintomas;
	}
	
	public int getQtdSintomas() {
		return qtdSintomas;
	}
	
	public void setQtdSintomas(int qtdSintomas) {
		this.qtdSintomas = qtdSintomas;
	}
	
	public GatilhoDor[] getGatilhos() {
		return gatilhos;
	}
	
	public void setGatilhos(GatilhoDor[] gatilhos) {
		this.gatilhos = gatilhos;
	}
	
	public int getQtdGatilhos() {
		return qtdGatilhos;
	}
	
	public void setQtdGatilhos(int qtdGatilhos) {
		this.qtdGatilhos = qtdGatilhos;
	}
	
	public MedicacaoUtilizada[] getMedicacoes() {
		return medicacoes;
	}
	
	public void setMedicacoes(MedicacaoUtilizada[] medicacoes) {
		this.medicacoes = medicacoes;
	}
	
	public int getQtdMedicacoes() {
		return qtdMedicacoes;
	}
	
	public void setQtdMedicacoes(int qtdMedicacoes) {
		this.qtdMedicacoes = qtdMedicacoes;
	}
}
