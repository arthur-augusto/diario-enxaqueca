/**
 * Tela de menu principal da aplicação.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaPrincipal implements ActionListener {
	
	private JFrame framePrincipal = new JFrame("Diário de Dor de Cabeça");
	
	private JLabel titulo = new JLabel("Diário de Dor de Cabeça");
	private static JButton dashboard = new JButton("Dashboard");
	private static JButton entradas = new JButton("Entradas");
	private static JButton relatorio = new JButton("Relatório");

	/**
	 * Cria a tela principal com um título e três butões.
	 */

	public TelaPrincipal() {
		
		framePrincipal.setLayout(null);
		
		framePrincipal.setSize(400, 300);
		
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		titulo.setFont(new Font("Arial", Font.BOLD, 32));
		
		titulo.setBounds(5, 5, 380, 30);
		dashboard.setBounds(150, 50, 100, 30);
		entradas.setBounds(150, 90, 100, 30);
		relatorio.setBounds(150, 130, 100, 30);

		framePrincipal.add(titulo);
		framePrincipal.add(dashboard);
		framePrincipal.add(entradas);
		framePrincipal.add(relatorio);

		framePrincipal.setVisible(true);
	}
	
	/**
	 * Usa o método getSource() para saber onde o usuário clicou, e abre a respectiva tela.
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == dashboard)
			new TelaDashboard();
		
		if(src == entradas)
			new TelaEntradas();
		
		if(src == relatorio)
			new TelaRelatorio();
	}
	
	/**
	 * Inicia a aplicação gerando uma tela de menu principal.
	 */
	public static void main(String args[]) {
		TelaPrincipal janelaPrincipal = new TelaPrincipal();
		
		dashboard.addActionListener(janelaPrincipal);
		entradas.addActionListener(janelaPrincipal);
		relatorio.addActionListener(janelaPrincipal);
	}
}
