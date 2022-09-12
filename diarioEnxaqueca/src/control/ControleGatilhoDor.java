package control;

import model.*;

public class ControleGatilhoDor {

	private GatilhoDor[] gat;
	private int qtdGatilhos;
	
	public ControleGatilhoDor(ControleDados d) {
		gat = d.getGatilhos();
		qtdGatilhos = d.getQtdGatilhos();
	}
	
	public String[] getNomesGatilhos() {
		String[] s = new String[qtdGatilhos];
		
		for(int i = 0; i < qtdGatilhos; i++) {
			s[i] = gat[i].getNome();
		}
		
		return s;
	}
	
}
