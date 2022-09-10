/**
 * Uma tela para visualizar e gerenciar as entradas no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class TelaEntradas implements ActionListener, ListSelectionListener {
	
	private JFrame frameEntradas;
	
	private JList<String> listaEntradas;
	
	String datas[] = {"05-09-2022", "06-09-2022", "07-09-2022", "08-09-2022", "09-09-2022"};
	
	private static JButton adicionarEntrada;
	
	/**
	 * Cria uma tela com uma lista de dores de cabeça e um botão para adicionar entradas. 
	 * Nessa tela também é possível editar e remover as entradas.
	 */
	
	public TelaEntradas () {
		frameEntradas = new JFrame("Entradas");
		listaEntradas = new JList<String>(datas);
		adicionarEntrada = new JButton("ADICIONAR ENTRADA");
		
		frameEntradas.setLayout(null);
		
		frameEntradas.setSize(400, 300);
		
		adicionarEntrada.setBounds(120, 195, 160, 30);
		listaEntradas.setBounds(20, 50, 350, 120);
		listaEntradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEntradas.setVisibleRowCount(10);
		
		frameEntradas.add(adicionarEntrada);
		frameEntradas.add(listaEntradas);
		
		frameEntradas.setVisible(true);
		
		listaEntradas.addListSelectionListener(this);
		adicionarEntrada.addActionListener(this);
	}

	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			new TelaDetalheEntrada().AdicionarOuEditar(1);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == adicionarEntrada) {
			new TelaDetalheEntrada().AdicionarOuEditar(0);
		}
	}
}
