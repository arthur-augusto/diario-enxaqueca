package control;

import model.*;

public class ControleDorDeCabeca {
	
	private DorDeCabeca[] dor;
	private int qtdDoresDeCabeca;
	
	public ControleDorDeCabeca(ControleDados d) {
		dor = d.getDoresDeCabeca();
		qtdDoresDeCabeca = d.getQtdDoresDeCabeca();
	}
	
	
	public String[] getNomesDores() {
		String[] s = new String[qtdDoresDeCabeca];
		
		for(int i = 0; i < qtdDoresDeCabeca; i++) {
			s[i] = dor[i].getDataDor();
		}
		
		return s;
	}
}
