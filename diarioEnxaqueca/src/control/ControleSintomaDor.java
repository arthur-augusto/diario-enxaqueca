package control;

import model.*;

public class ControleSintomaDor {

	private SintomaDor[] sin;
	private int qtdSintomas;
	
	public ControleSintomaDor(ControleDados d) {
		sin = d.getSintomas();
		qtdSintomas = d.getQtdSintomas();
	}
	
	public String[] getNomesSintomas() {
		String[] s = new String[qtdSintomas];
		
		for(int i = 0; i < qtdSintomas; i++) {
			s[i] = sin[i].getNome();
		}
		
		return s;
	}
}
