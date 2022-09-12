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
	
	public void inserirAtualizarInformacao(String[] dadoNovo, String info) {
		
		if (info == "Sintoma") {
			SintomaDor sin = new SintomaDor(dadoNovo[1], dadoNovo[2], dadoNovo[3]);
			d.inserirEditarSintoma(sin, Integer.parseInt(dadoNovo[0]));
		}
		
		if (info == "Gatilho") {
			GatilhoDor gat = new GatilhoDor(dadoNovo[1], dadoNovo[2], dadoNovo[3]);
			d.inserirEditarGatilho(gat, Integer.parseInt(dadoNovo[0]));
		}
		
		if (info == "Medicação") {
			MedicacaoUtilizada med = new MedicacaoUtilizada(dadoNovo[1], dadoNovo[2], 
					dadoNovo[3], dadoNovo[4]);
			d.inserirEditarMedicacao(med, Integer.parseInt(dadoNovo[0]));
		}
	}
	
	
	public void excluirEntrada(int i) {
		String entradaRemovida = d.getDoresDeCabeca()[i].getDataDor();

		if(i == (d.getQtdDoresDeCabeca() - 1)) {
			d.setQtdDoresDeCabeca(d.getQtdDoresDeCabeca() - 1);
			d.getDoresDeCabeca()[d.getQtdDoresDeCabeca()] = null;
		} else { 
			int cont = 0;
			while(d.getDoresDeCabeca()[cont].getDataDor().compareTo(entradaRemovida) != 0) {
				cont++;
			}
			for(int j = cont; j < d.getQtdDoresDeCabeca() - 1; j++) {
				d.getDoresDeCabeca()[j] = null;
				d.getDoresDeCabeca()[j] = d.getDoresDeCabeca()[j+1];
			}
			d.getDoresDeCabeca()[d.getQtdDoresDeCabeca()] = null;
			d.setQtdDoresDeCabeca(d.getQtdDoresDeCabeca() - 1);
		}
	}
	
	public void excluirInformacao(int i, String info) {
		
		if(info == "Sintoma") {
			String sintomaRemovido = d.getSintomas()[i].getNome();

			if(i == (d.getQtdSintomas() - 1)) {
				d.setQtdSintomas(d.getQtdSintomas() - 1);
				d.getSintomas()[d.getQtdSintomas()] = null;
			} else { 
				int cont = 0;
				while(d.getSintomas()[cont].getNome().compareTo(sintomaRemovido) != 0) {
					cont++;
				}
				for(int j = cont; j < d.getQtdSintomas() - 1; j++) {
					d.getSintomas()[j] = null;
					d.getSintomas()[j] = d.getSintomas()[j+1];
				}
				d.getSintomas()[d.getQtdSintomas()] = null;
				d.setQtdSintomas(d.getQtdSintomas() - 1);
			}
		}
		
		if(info == "Gatilho") {
			String gatilhoRemovido = d.getGatilhos()[i].getNome();

			if(i == (d.getQtdGatilhos() - 1)) {
				d.setQtdGatilhos(d.getQtdGatilhos() - 1);
				d.getGatilhos()[d.getQtdGatilhos()] = null;
			} else { 
				int cont = 0;
				while(d.getGatilhos()[cont].getNome().compareTo(gatilhoRemovido) != 0) {
					cont++;
				}
				for(int j = cont; j < d.getQtdGatilhos() - 1; j++) {
					d.getGatilhos()[j] = null;
					d.getGatilhos()[j] = d.getGatilhos()[j+1];
				}
				d.getGatilhos()[d.getQtdGatilhos()] = null;
				d.setQtdGatilhos(d.getQtdGatilhos() - 1);
			}
		}
		
		if(info == "Medicação") {
			String medicacaoRemovida = d.getMedicacoes()[i].getNome();

			if(i == (d.getQtdMedicacoes() - 1)) {
				d.setQtdMedicacoes(d.getQtdMedicacoes() - 1);
				d.getMedicacoes()[d.getQtdMedicacoes()] = null;
			} else { 
				int cont = 0;
				while(d.getMedicacoes()[cont].getNome().compareTo(medicacaoRemovida) != 0) {
					cont++;
				}
				for(int j = cont; j < d.getQtdMedicacoes() - 1; j++) {
					d.getMedicacoes()[j] = null;
					d.getMedicacoes()[j] = d.getMedicacoes()[j+1];
				}
				d.getMedicacoes()[d.getQtdMedicacoes()] = null;
				d.setQtdMedicacoes(d.getQtdMedicacoes() - 1);
			}
		}

	}
 }
