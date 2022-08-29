/**
 * Uma tela para visualizar e gerenciar as entradas no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;

public class TelaEntradas {
	
	public JFrame frameEntradas = new JFrame("Entradas");
	
	public static JButton adicionarEntrada = new JButton("ADICIONAR ENTRADA");
	
	/**
	 * Cria uma tela com uma lista de dores de cabeça e um botão para adicionar entradas. 
	 * Nessa tela também é possível editar e remover as entradas.
	 */
	
	public TelaEntradas () {
		
		frameEntradas.setLayout(null);
		
		frameEntradas.setSize(400, 300);
		
		adicionarEntrada.setBounds(5, 5, 160, 30);
		
		frameEntradas.add(adicionarEntrada);
		
		frameEntradas.setVisible(true);
	}

}
