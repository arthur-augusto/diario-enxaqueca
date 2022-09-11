/**
 * Uma tela com um relatório sobre as dores de cabeça de um período específico.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class TelaRelatorio {
	
	
	final String doresTotais = "10";
	final String mediaPontuacao = "02";
	final String mediaDuracao = "03";
	final String gatilhoMaisComum = "atividade física";
	final String dorMaisComum = "enxaqueca";
	
	
	
	private JFrame frameRelatorio;
	
	private JLabel labelDataInicial;
	private JLabel labelDataFinal;
	
	private JTextField valorDiaInicial;
	private JTextField valorMesInicial;
	private JTextField valorAnoInicial;
	
	private JTextField valorDiaFinal;
	private JTextField valorMesFinal;
	private JTextField valorAnoFinal;
	
	private String titulo;
	private static JButton mostrarRelatorio;

	
	/**
	 * Cria uma tela com 4 métricas de um período, que o usuário seleciona de uma lista.
	 */
	
	public TelaRelatorio() {
		
		mostrarRelatorio = new JButton("GERAR RELATÓRIO");

		titulo = "Relatório";
		frameRelatorio = new JFrame("Relatório");
		frameRelatorio.setLayout(null);	
		frameRelatorio.setSize(500, 375);
		
		labelDataInicial = new JLabel("Informe a data inicial:");
		valorDiaInicial = new JTextField(2);
		valorMesInicial = new JTextField(2);
		valorAnoInicial = new JTextField(4);
		
		labelDataFinal = new JLabel("Informe a data final");
		valorDiaFinal = new JTextField(2);
		valorMesFinal = new JTextField(2);
		valorAnoFinal = new JTextField(4);
		
		
		labelDataInicial.setBounds(10, 10, 175, 25);
		valorDiaInicial.setBounds(225, 10, 30, 25);
		valorMesInicial.setBounds(260, 10, 30, 25);
		valorAnoInicial.setBounds(295, 10, 40, 25);
		
		labelDataFinal.setBounds(10, 50, 225, 25);
		valorDiaFinal.setBounds(225, 50, 30, 25);
		valorMesFinal.setBounds(260, 50, 30, 25);
		valorAnoFinal.setBounds(295, 50, 40, 25);
		
		mostrarRelatorio.setBounds(10, 90, 160, 20);

		
		frameRelatorio.add(labelDataInicial);
		frameRelatorio.add(valorDiaInicial);
		frameRelatorio.add(valorMesInicial);
		frameRelatorio.add(valorAnoInicial);
		
		frameRelatorio.add(labelDataFinal);
		frameRelatorio.add(valorDiaFinal);
		frameRelatorio.add(valorMesFinal);
		frameRelatorio.add(valorAnoFinal);
		frameRelatorio.add(mostrarRelatorio);
				
		frameRelatorio.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == mostrarRelatorio) {
			
		}
	}
}
