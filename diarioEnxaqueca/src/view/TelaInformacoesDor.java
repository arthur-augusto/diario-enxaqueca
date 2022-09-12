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
	private JButton adicionarNovaInformacao;
	private JButton refreshInformacao;
	
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
		adicionarNovaInformacao = new JButton("ADICIONAR NOVO " + info.toUpperCase());
		refreshInformacao = new JButton("REFRESH");
		
		frameInformacoesDor.setLayout(null);
		frameInformacoesDor.setSize(500, 375);
		
		listaInformacoes.setBounds(20, 50, 445, 180);
		listaInformacoes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaInformacoes.setVisibleRowCount(15);
		
		adicionarInformacao.setBounds(165, 240, 170, 30);
		adicionarNovaInformacao.setBounds(66, 280, 200, 30);
		refreshInformacao.setBounds(332, 280, 100, 30);
		
		frameInformacoesDor.add(listaInformacoes);
		frameInformacoesDor.add(adicionarInformacao);
		frameInformacoesDor.add(adicionarNovaInformacao);
		frameInformacoesDor.add(refreshInformacao);
		
		frameInformacoesDor.setVisible(true);
		
		listaInformacoes.addListSelectionListener(this);
		adicionarInformacao.addActionListener(this);
		adicionarNovaInformacao.addActionListener(this);
		refreshInformacao.addActionListener(this);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			new TelaDetalheInformacaoDor().adicionarOuEditarInformacao(
					infoSelecionada, dados, 1, listaInformacoes.getSelectedIndex());
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == adicionarNovaInformacao) {
			new TelaDetalheInformacaoDor().adicionarOuEditarInformacao(infoSelecionada, dados, 0, 0);
		}
		
		if (src == refreshInformacao) {
			
			if (infoSelecionada == "Sintoma") {
				listaInformacoes.setListData(new ControleSintomaDor(dados).getNomesSintomas());			
			}
			
			if(infoSelecionada == "Gatilho") {
				listaInformacoes.setListData(new ControleGatilhoDor(dados).getNomesGatilhos());			
			}
			
			if(infoSelecionada == "Medicação") {
				listaInformacoes.setListData(new ControleMedicacaoUtilizada(dados).getNomesMedicacoes());			
			}
			
			listaInformacoes.updateUI();
		}
		
		
	}
}
