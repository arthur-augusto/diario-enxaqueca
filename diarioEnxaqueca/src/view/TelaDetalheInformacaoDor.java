/**
 * Uma tela para adicionar e editar as informações sobre a dor 
 * (sintomas, gatilhos e medicações utilizadas) no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;
import java.awt.event.*;

import control.*;

public class TelaDetalheInformacaoDor implements ActionListener{
	
	private JFrame frameDetalheInformacao;
	
	private static ControleDados dados;
	
	private JLabel labelNome;
	private JTextField valorNome;
	
	private JLabel labelDescricao;
	private JTextField valorDescricao;
	
	private JLabel labelDuracaoSintoma;
	private JTextField valorDuracaoSintoma;
	
	private JLabel labelRecorrenciaGatilho;
	private JTextField valorRecorrenciaGatilho;
	
	private JLabel labelDosagem;
	private JTextField valorDosagem;
	
	private JLabel labelEficacia;
	private JTextField valorEficacia;
	
	private JButton butaoSalvar;
	private JButton butaoExcluir;
	
	private String titulo;
	
	public void adicionarOuEditarInformacao(String info, ControleDados d, int op, int pos) {
		
		dados = d;
		
		if (op == 0) titulo = "Adicionar ";
		if (op == 1) titulo = "Editar ";
		
		if(info == "Sintoma") titulo += "Sintoma";
		if(info == "Gatilho") titulo += "Gatilho";
		if(info == "Medicação") titulo += "Medicação";
		
		frameDetalheInformacao = new JFrame(titulo);
		
		frameDetalheInformacao.setLayout(null);
		
		frameDetalheInformacao.setSize(500, 375);
		
		if(op == 0) {
			
			labelNome = new JLabel("Nome:");
			valorNome = new JTextField(100);
			
			labelDescricao = new JLabel("Descrição:");
			valorDescricao = new JTextField(100);
			
			labelNome.setBounds(10, 10, 40, 25);
			valorNome.setBounds(55, 10, 200, 25);
			
			labelDescricao.setBounds(10, 45, 65, 25);
			valorDescricao.setBounds(80, 45, 370, 25);
			
			frameDetalheInformacao.add(labelNome);
			frameDetalheInformacao.add(valorNome);
			
			frameDetalheInformacao.add(labelDescricao);
			frameDetalheInformacao.add(valorDescricao);
			
			if(info == "Sintoma") {
				
				labelDuracaoSintoma = new JLabel("Quantas horas durou o sintoma?");
				valorDuracaoSintoma = new JTextField(2);
				
				labelDuracaoSintoma.setBounds(10, 75, 188, 25);
				valorDuracaoSintoma.setBounds(203, 75, 30, 25);
				
				frameDetalheInformacao.add(labelDuracaoSintoma);
				frameDetalheInformacao.add(valorDuracaoSintoma);
			}
			
			if(info == "Gatilho") {
				
				labelRecorrenciaGatilho = new JLabel("Com que frequência o gatilho se repete?");
				valorRecorrenciaGatilho = new JTextField(100);
				
				labelRecorrenciaGatilho.setBounds(10, 75, 243, 25);
				valorRecorrenciaGatilho.setBounds(248, 75, 202, 25);
				
				frameDetalheInformacao.add(labelRecorrenciaGatilho);
				frameDetalheInformacao.add(valorRecorrenciaGatilho);
			}
			
			if(info == "Medicação") {
				
				labelDosagem = new JLabel("Qual foi a dosagem do remédio?");
				valorDosagem = new JTextField(100);
				
				labelEficacia = new JLabel("O quão eficiente foi o medicamento?");
				valorEficacia = new JTextField(100);
				
				labelDosagem.setBounds(10, 75, 193, 25);
				valorDosagem.setBounds(208, 75, 200, 25);
				
				labelEficacia.setBounds(10, 105, 212, 25);
				valorEficacia.setBounds(227, 105, 200, 25);
				
				frameDetalheInformacao.add(labelDosagem);
				frameDetalheInformacao.add(valorDosagem);
				
				frameDetalheInformacao.add(labelEficacia);
				frameDetalheInformacao.add(valorEficacia);
			}
			
			butaoSalvar = new JButton("SALVAR");
			butaoExcluir = new JButton("EXCLUIR");
			
			butaoSalvar.setBounds(116, 290, 100, 30);
			
			frameDetalheInformacao.add(butaoSalvar);
			
			butaoSalvar.addActionListener(this);
		}
		
		if(op == 1) {
			
			if(info == "Sintoma") {
				labelNome = new JLabel("Nome:");
				valorNome = new JTextField(dados.getSintomas()[pos].getNome());
				
				labelDescricao = new JLabel("Descrição:");
				valorDescricao = new JTextField(dados.getSintomas()[pos].getDescricao());
				
				labelNome.setBounds(10, 10, 40, 25);
				valorNome.setBounds(55, 10, 200, 25);
				
				labelDescricao.setBounds(10, 45, 65, 25);
				valorDescricao.setBounds(80, 45, 370, 25);
				
				frameDetalheInformacao.add(labelNome);
				frameDetalheInformacao.add(valorNome);
				
				frameDetalheInformacao.add(labelDescricao);
				frameDetalheInformacao.add(valorDescricao);
				
				labelDuracaoSintoma = new JLabel("Quantas horas durou o sintoma?");
				valorDuracaoSintoma = new JTextField(dados.getSintomas()[pos].getDuracaoSintoma());
				
				labelDuracaoSintoma.setBounds(10, 75, 188, 25);
				valorDuracaoSintoma.setBounds(203, 75, 30, 25);
				
				frameDetalheInformacao.add(labelDuracaoSintoma);
				frameDetalheInformacao.add(valorDuracaoSintoma);
			}
			
			if(info == "Gatilho") {
				labelNome = new JLabel("Nome:");
				valorNome = new JTextField(dados.getGatilhos()[pos].getNome());
				
				labelDescricao = new JLabel("Descrição:");
				valorDescricao = new JTextField(dados.getGatilhos()[pos].getDescricao());
				
				labelNome.setBounds(10, 10, 40, 25);
				valorNome.setBounds(55, 10, 200, 25);
				
				labelDescricao.setBounds(10, 45, 65, 25);
				valorDescricao.setBounds(80, 45, 370, 25);
				
				frameDetalheInformacao.add(labelNome);
				frameDetalheInformacao.add(valorNome);
				
				frameDetalheInformacao.add(labelDescricao);
				frameDetalheInformacao.add(valorDescricao);
				
				labelRecorrenciaGatilho = new JLabel("Com que frequência o gatilho se repete?");
				valorRecorrenciaGatilho = new JTextField(dados.getGatilhos()[pos].getRecorrencia_gatilho());
				
				labelRecorrenciaGatilho.setBounds(10, 75, 243, 25);
				valorRecorrenciaGatilho.setBounds(248, 75, 202, 25);
				
				frameDetalheInformacao.add(labelRecorrenciaGatilho);
				frameDetalheInformacao.add(valorRecorrenciaGatilho);
			}
			
			if(info == "Medicação") {
				
				labelNome = new JLabel("Nome:");
				valorNome = new JTextField(dados.getMedicacoes()[pos].getNome());
				
				labelDescricao = new JLabel("Descrição:");
				valorDescricao = new JTextField(dados.getMedicacoes()[pos].getDescricao());
				
				labelNome.setBounds(10, 10, 40, 25);
				valorNome.setBounds(55, 10, 200, 25);
				
				labelDescricao.setBounds(10, 45, 65, 25);
				valorDescricao.setBounds(80, 45, 370, 25);
				
				frameDetalheInformacao.add(labelNome);
				frameDetalheInformacao.add(valorNome);
				
				frameDetalheInformacao.add(labelDescricao);
				frameDetalheInformacao.add(valorDescricao);
				
				labelDosagem = new JLabel("Qual foi a dosagem do remédio?");
				valorDosagem = new JTextField(dados.getMedicacoes()[pos].getDosagem());
				
				labelEficacia = new JLabel("O quão eficiente foi o medicamento?");
				valorEficacia = new JTextField(dados.getMedicacoes()[pos].getEficacia_medicacao());
				
				labelDosagem.setBounds(10, 75, 193, 25);
				valorDosagem.setBounds(208, 75, 200, 25);
				
				labelEficacia.setBounds(10, 105, 212, 25);
				valorEficacia.setBounds(227, 105, 200, 25);
				
				frameDetalheInformacao.add(labelDosagem);
				frameDetalheInformacao.add(valorDosagem);
				
				frameDetalheInformacao.add(labelEficacia);
				frameDetalheInformacao.add(valorEficacia);
			}
			
			butaoSalvar = new JButton("SALVAR");
			butaoExcluir = new JButton("EXCLUIR");
			
			butaoSalvar.setBounds(116, 290, 100, 30);
			butaoExcluir.setBounds(266, 290, 100, 30);
			
			frameDetalheInformacao.add(butaoSalvar);
			frameDetalheInformacao.add(butaoExcluir);
			
			butaoSalvar.addActionListener(this);
			butaoExcluir.addActionListener(this);
		}
		
		frameDetalheInformacao.setVisible(true);	
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}
