/**
 * Uma tela para visualizar e gerenciar as informações sobre a dor no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.*;

import java.awt.event.*;

public class TelaInformacoesDor implements ActionListener, ListSelectionListener{
	
	private JFrame frameInformacoesDor;
	
	private static ControleDados dados;
	
	private JList<String> listaInformacoes;
	
	private String[] listaNomes = new String[40];
	
	private JButton adicionarInformacao;
	
	private String infoSelecionada;
	
	/**
	 * Cria uma tela para visualizar e gerenciar informações sobre a dor
	 * @param info indica qual informação será visualizada
	 */
	
	public TelaInformacoesDor(String info, ControleDados d) {
		
		infoSelecionada = info;
		dados = d;
		
		if(info == "Sintoma") {
			listaNomes = new ControleSintomaDor(dados).getNomesSintomas();
		}
		
		if(info == "Gatilho") {
			listaNomes = new ControleGatilhoDor(dados).getNomesGatilhos();
		}
		
		if(info == "Medicação") {
			listaNomes = new ControleMedicacaoUtilizada(dados).getNomesMedicacoes();
		}
		
		frameInformacoesDor = new JFrame(info);
		listaInformacoes = new JList<String>(listaNomes);
		adicionarInformacao = new JButton("ADICIONAR " + info.toUpperCase());
		
		frameInformacoesDor.setLayout(null);
		frameInformacoesDor.setSize(500, 375);
		
		listaInformacoes.setBounds(20, 50, 445, 180);
		listaInformacoes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaInformacoes.setVisibleRowCount(15);
		
		adicionarInformacao.setBounds(165, 260, 170, 30);
		
		frameInformacoesDor.add(listaInformacoes);
		frameInformacoesDor.add(adicionarInformacao);
		
		frameInformacoesDor.setVisible(true);
		
		listaInformacoes.addListSelectionListener(this);
		adicionarInformacao.addActionListener(this);
		
	}
	
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			new TelaDetalheInformacaoDor().adicionarOuEditarInformacao(
					infoSelecionada, dados, 1, listaInformacoes.getSelectedIndex());
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == adicionarInformacao) {
			new TelaDetalheInformacaoDor().adicionarOuEditarInformacao(infoSelecionada, dados, 0, 0);
		}
	}
}