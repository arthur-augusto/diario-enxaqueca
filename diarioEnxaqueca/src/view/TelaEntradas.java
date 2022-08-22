package view;

import javax.swing.*;

public class TelaEntradas {
	
	public JFrame frameEntradas = new JFrame("Entradas");
	
	public static JButton adicionarEntrada = new JButton("ADICIONAR ENTRADA");
	
	public TelaEntradas () {
		
		frameEntradas.setLayout(null);
		
		frameEntradas.setSize(400, 300);
		
		adicionarEntrada.setBounds(5, 5, 160, 30);
		
		frameEntradas.add(adicionarEntrada);
		
		frameEntradas.setVisible(true);
	}

}
