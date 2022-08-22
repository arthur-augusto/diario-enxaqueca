package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaPrincipal implements ActionListener {
	
	// Criando componentes da tela
	private JFrame framePrincipal = new JFrame("Diário de Dor de Cabeça");
	
	private JLabel titulo = new JLabel("Diário de Dor de Cabeça");
	private static JButton dashboard = new JButton("Dashboard");
	private static JButton entradas = new JButton("Entradas");
	private static JButton relatorio = new JButton("Relatório");

	// Construtor da TelaPrincipal
	public TelaPrincipal() {
		
		framePrincipal.setLayout(null);
		
		framePrincipal.setSize(400, 300);
		
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		titulo.setFont(new Font("Arial", Font.BOLD, 32));
		
		// Posicionando e definindo o tamanho dos componentes
		titulo.setBounds(5, 5, 380, 30);
		dashboard.setBounds(150, 50, 100, 30);
		entradas.setBounds(150, 90, 100, 30);
		relatorio.setBounds(150, 130, 100, 30);

		// Adicionando componentes
		framePrincipal.add(titulo);
		framePrincipal.add(dashboard);
		framePrincipal.add(entradas);
		framePrincipal.add(relatorio);

		// Tornando o framePrincipal visivel
		framePrincipal.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		// Origem do clique
		Object src = e.getSource();
		
		// Se o butao dashboard for clicado, entao crie uma tela de dashboard
		if(src == dashboard)
			new TelaDashboard();
		
		// Se o butao entradas for clicado, entao crie uma tela de entradas
		if(src == entradas)
			new TelaEntradas();
		
		// Se o butao de relatorio for clicado, entao crie uma tela de relatorio
		if(src == relatorio)
			new TelaRelatorio();
	}
	
	public static void main(String args[]) {
		// Ao iniciar o programa crie uma tela principal
		TelaPrincipal janelaPrincipal = new TelaPrincipal();
		
		// Adicionando listeners na janelaPrincipal para cada butao
		dashboard.addActionListener(janelaPrincipal);
		entradas.addActionListener(janelaPrincipal);
		relatorio.addActionListener(janelaPrincipal);
	}
}
