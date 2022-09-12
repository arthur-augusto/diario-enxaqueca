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
import control.*;

public class TelaEntradas implements ActionListener, ListSelectionListener {
	
	private JFrame frameEntradas;
	
	private static ControleDados dados;
	
	private JList<String> listaEntradas;
	
	private String[] listaNomes = new String[40];
	
	private JButton adicionarEntrada;
	private JButton refreshEntrada;
	
	/**
	 * Cria uma tela com uma lista de dores de cabeça e um botão para adicionar entradas. 
	 * Nessa tela também é possível editar e remover as entradas.
	 */
	
	public TelaEntradas(ControleDados d) {
		
		dados = d;
		
		frameEntradas = new JFrame("Entradas");
		listaNomes = new ControleDorDeCabeca(dados).getNomesDores();
		listaEntradas = new JList<String>(listaNomes);
		adicionarEntrada = new JButton("ADICIONAR ENTRADA");
		refreshEntrada = new JButton("REFRESH");
		
		frameEntradas.setLayout(null);
		frameEntradas.setSize(500, 375);
		
		listaEntradas.setBounds(20, 50, 445, 180);
		listaEntradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaEntradas.setVisibleRowCount(20);
		
		adicionarEntrada.setBounds(60, 290, 160, 30);
		refreshEntrada.setBounds(280, 290, 160, 30);

		frameEntradas.add(listaEntradas);
		frameEntradas.add(adicionarEntrada);
		frameEntradas.add(refreshEntrada);
		
		frameEntradas.setVisible(true);
		
		listaEntradas.addListSelectionListener(this);
		adicionarEntrada.addActionListener(this);
		refreshEntrada.addActionListener(this);
	}

	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			new TelaDetalheEntrada().adicionarOuEditarEntrada(1, dados, listaEntradas.getSelectedIndex());
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == adicionarEntrada) {
			new TelaDetalheEntrada().adicionarOuEditarEntrada(0, dados, 0);
		}
		
		if (src == refreshEntrada) {
			listaEntradas.setListData(new ControleDorDeCabeca(dados).getNomesDores());			
			listaEntradas.updateUI();
		}
	}
}
