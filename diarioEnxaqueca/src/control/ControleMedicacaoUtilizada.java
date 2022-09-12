package control;

import model.*;

public class ControleMedicacaoUtilizada {
	
	private MedicacaoUtilizada[] med;
	private int qtdMedicacoes;
	
	public ControleMedicacaoUtilizada(ControleDados d) {
		med = d.getMedicacoes();
		qtdMedicacoes = d.getQtdMedicacoes();
	}
	
	public String[] getNomesMedicacoes() {
		String[] s = new String[qtdMedicacoes];
		
		for(int i = 0; i < qtdMedicacoes; i++) {
			s[i] = med[i].getNome();
		}
		
		return s;
	}
	
}
