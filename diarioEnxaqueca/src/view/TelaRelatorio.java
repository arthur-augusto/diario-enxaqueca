/**
 * Uma tela com um relatório sobre as dores de cabeça de um período específico.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;

public class TelaRelatorio {
	
	private JFrame frameRelatorio;
	
	/**
	 * Cria uma tela com 4 métricas de um período, que o usuário seleciona de uma lista.
	 */
	
	public TelaRelatorio() {
		frameRelatorio = new JFrame("Relatório");
		
		frameRelatorio.setLayout(null);
		
		frameRelatorio.setSize(400, 300);
		
		frameRelatorio.setVisible(true);
	}
}
