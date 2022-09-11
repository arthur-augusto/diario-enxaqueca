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
	private static JButton entradas = new JButton("Entradas");
	private static JButton relatorio = new JButton("Relatório");

	/**
	 * Cria a tela principal com um título e três butões.
	 */

	public TelaPrincipal() {
		
		framePrincipal.setLayout(null);
		
		framePrincipal.setSize(500, 375);
		
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		titulo.setFont(new Font("Arial", Font.BOLD, 32));
		
		titulo.setBounds(62, 50, 375, 35);
		entradas.setBounds(200, 172, 100, 30);
		relatorio.setBounds(200, 212, 100, 30);

		framePrincipal.add(titulo);
		framePrincipal.add(entradas);
		framePrincipal.add(relatorio);

		framePrincipal.setVisible(true);
	}
	
	/**
	 * Usa o método getSource() para saber onde o usuário clicou, e abre a respectiva tela.
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
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
		
		entradas.addActionListener(janelaPrincipal);
		relatorio.addActionListener(janelaPrincipal);
	}
}
