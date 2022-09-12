/**
 * Uma tela para adicionar e editar as entradas no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;
import java.awt.event.*;
import control.*;

public class TelaDetalheEntrada implements ActionListener {

	private JFrame frameDetalheEntrada;
	
	private JLabel labelComeco;
	private JLabel labelData;
	private JTextField valorDia;
	private JTextField valorMes;
	private JTextField valorAno;
	private JLabel labelHora;
	private JTextField valorHora;
	
	private JLabel labelDuracao;
	private JTextField valorDuracao;
	
	private JLabel labelPontuacao;
	private JTextField valorPontuacao;
	
	private JLabel labelLocal;
	private JTextField valorLocal;
	
	private JLabel labelSintoma;
	private JButton butaoSintoma;
	private JLabel valorSintoma;
	
	private JLabel labelGatilho;
	private JButton butaoGatilho;
	private JLabel valorGatilho;
	
	private JLabel labelMedicacao;
	private JButton butaoMedicacao;
	private JLabel valorMedicacao;
	
	private JLabel labelNotas;
	private JTextField valorNotas;
	
	private JButton butaoSalvar;
	private JButton butaoExcluir;
	
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	
	private String[] novoDado = new String[10];
	
	private String titulo;
	
	/**
	 * Cria uma tela para adicionar ou alterar entradas
	 * @param op indica se é pra adicionar ou editar
	 */
	public void adicionarOuEditarEntrada (int op, ControleDados d, int pos) {
		
		dados = d;
		opcao = op;
		posicao = pos;
		
		if (op == 0) titulo = "Adicionar Entrada";
		if (op == 1) titulo = "Editar Entrada";
		
		frameDetalheEntrada = new JFrame(titulo);
		
		frameDetalheEntrada.setLayout(null);
		
		frameDetalheEntrada.setSize(500, 375);
		
		if (op == 0) {
			
			labelComeco = new JLabel("A dor de cabeça começou em:");
			labelData = new JLabel("Data:");
			valorDia = new JTextField(2);
			valorMes = new JTextField(2);
			valorAno = new JTextField(4);
			labelHora = new JLabel("Hora:");
			valorHora = new JTextField(5);
			
			labelDuracao = new JLabel("Quantas horas durou a dor de cabeça?");
			valorDuracao = new JTextField(2);
			
			labelPontuacao = new JLabel("Em uma escala de 1 a 10, o quão intensa é a dor?");
			valorPontuacao = new JTextField(2);
			
			labelLocal = new JLabel("Onde está localizada a dor?");
			valorLocal = new JTextField(100);
			
			labelSintoma = new JLabel("Sintoma:");
			butaoSintoma = new JButton("+");
			
			labelGatilho = new JLabel("Gatilho:");
			butaoGatilho = new JButton("+");
			
			labelMedicacao = new JLabel("Medicação:");
			butaoMedicacao = new JButton("+");
			
			labelNotas = new JLabel("Notas:");
			valorNotas = new JTextField(100);
			
			butaoSalvar = new JButton("SALVAR");
			
			labelComeco.setBounds(10, 10, 175, 25);
			labelData.setBounds(190, 10, 30, 25);
			valorDia.setBounds(225, 10, 30, 25);
			valorMes.setBounds(260, 10, 30, 25);
			valorAno.setBounds(295, 10, 40, 25);
			labelHora.setBounds(345, 10, 30, 25);
			valorHora.setBounds(380, 10, 45, 25);
			
			labelDuracao.setBounds(10, 45, 225, 25);
			valorDuracao.setBounds(240, 45, 30, 25);
			
			labelPontuacao.setBounds(10, 80, 280, 25);
			valorPontuacao.setBounds(295, 80, 30, 25);
			
			labelLocal.setBounds(10, 115, 160, 25);
			valorLocal.setBounds(175, 115, 200, 25);
			
			labelSintoma.setBounds(10, 150, 50, 25);
			butaoSintoma.setBounds(414, 150, 41, 25);
			
			labelGatilho.setBounds(10, 185, 50, 25);
			butaoGatilho.setBounds(414, 185, 41, 25);
			
			labelMedicacao.setBounds(10, 220, 65, 25);
			butaoMedicacao.setBounds(414, 220, 41, 25);
			
			labelNotas.setBounds(10, 255, 40, 25);
			valorNotas.setBounds(55, 255, 400, 25);
			
			butaoSalvar.setBounds(116, 290, 100, 30);
			
			frameDetalheEntrada.add(labelComeco);
			frameDetalheEntrada.add(labelData);
			frameDetalheEntrada.add(valorDia);
			frameDetalheEntrada.add(valorMes);
			frameDetalheEntrada.add(valorAno);
			frameDetalheEntrada.add(labelHora);
			frameDetalheEntrada.add(valorHora);
			
			frameDetalheEntrada.add(labelDuracao);
			frameDetalheEntrada.add(valorDuracao);
			
			frameDetalheEntrada.add(labelPontuacao);
			frameDetalheEntrada.add(valorPontuacao);
			
			frameDetalheEntrada.add(labelLocal);
			frameDetalheEntrada.add(valorLocal);
			
			frameDetalheEntrada.add(labelSintoma);
			frameDetalheEntrada.add(butaoSintoma);
			
			frameDetalheEntrada.add(labelGatilho);
			frameDetalheEntrada.add(butaoGatilho);
			
			frameDetalheEntrada.add(labelMedicacao);
			frameDetalheEntrada.add(butaoMedicacao);
			
			frameDetalheEntrada.add(labelNotas);
			frameDetalheEntrada.add(valorNotas);
			
			frameDetalheEntrada.add(butaoSalvar);
			
			butaoSintoma.addActionListener(this);
			butaoGatilho.addActionListener(this);
			butaoMedicacao.addActionListener(this);
			
			butaoSalvar.addActionListener(this);
		}
		
		if (op == 1) {
			
			labelComeco = new JLabel("A dor de cabeça começou em:");
			labelData = new JLabel("Data:");
			valorDia = new JTextField(dados.getDoresDeCabeca()[pos].getDataDor().substring(0, 2));
			valorMes = new JTextField(dados.getDoresDeCabeca()[pos].getDataDor().substring(3, 5));
			valorAno = new JTextField(dados.getDoresDeCabeca()[pos].getDataDor().substring(6, 10));
			labelHora = new JLabel("Hora:");
			valorHora = new JTextField(dados.getDoresDeCabeca()[pos].getHoraInicio());
			
			labelDuracao = new JLabel("Quantas horas durou a dor de cabeça?");
			valorDuracao = new JTextField(String.valueOf(dados.getDoresDeCabeca()[pos].getDuracaoDor()));
			
			labelPontuacao = new JLabel("Em uma escala de 1 a 10, o quão intensa é a dor?");
			valorPontuacao = new JTextField(String.valueOf(dados.getDoresDeCabeca()[pos].getPontuacaoDor()));
			
			labelLocal = new JLabel("Onde está localizada a dor?");
			valorLocal = new JTextField(dados.getDoresDeCabeca()[pos].getLocalDor());
			
			labelSintoma = new JLabel("Sintoma:");
			butaoSintoma = new JButton("+");
			valorSintoma  = new JLabel(dados.getDoresDeCabeca()[pos].getSintomaDor().getNome());
			
			labelGatilho = new JLabel("Gatilho:");
			butaoGatilho = new JButton("+");
			valorGatilho = new JLabel(dados.getDoresDeCabeca()[pos].getGatilhoDor().getNome());
			
			labelMedicacao = new JLabel("Medicação:");
			butaoMedicacao = new JButton("+");
			valorMedicacao = new JLabel(dados.getDoresDeCabeca()[pos].getMedicacaoUtilizada().getNome());
			
			labelNotas = new JLabel("Notas:");
			valorNotas = new JTextField(dados.getDoresDeCabeca()[pos].getNotas());
			
			butaoSalvar = new JButton("SALVAR");
			butaoExcluir = new JButton("EXCLUIR");
			
			labelComeco.setBounds(10, 10, 175, 25);
			labelData.setBounds(190, 10, 30, 25);
			valorDia.setBounds(225, 10, 30, 25);
			valorMes.setBounds(260, 10, 30, 25);
			valorAno.setBounds(295, 10, 40, 25);
			labelHora.setBounds(345, 10, 30, 25);
			valorHora.setBounds(380, 10, 45, 25);
			
			labelDuracao.setBounds(10, 45, 225, 25);
			valorDuracao.setBounds(240, 45, 30, 25);
			
			labelPontuacao.setBounds(10, 80, 280, 25);
			valorPontuacao.setBounds(295, 80, 30, 25);
			
			labelLocal.setBounds(10, 115, 160, 25);
			valorLocal.setBounds(175, 115, 200, 25);
			
			labelSintoma.setBounds(10, 150, 50, 25);
			butaoSintoma.setBounds(414, 150, 41, 25);
			valorSintoma.setBounds(65, 150, 300, 25);
			
			labelGatilho.setBounds(10, 185, 50, 25);
			butaoGatilho.setBounds(414, 185, 41, 25);
			valorGatilho.setBounds(65, 185, 300, 25);
			
			labelMedicacao.setBounds(10, 220, 65, 25);
			butaoMedicacao.setBounds(414, 220, 41, 25);
			valorMedicacao.setBounds(80, 220, 300, 25);
			
			labelNotas.setBounds(10, 255, 40, 25);
			valorNotas.setBounds(55, 255, 400, 25);
			
			butaoSalvar.setBounds(116, 290, 100, 30);
			butaoExcluir.setBounds(266, 290, 100, 30);
			
			frameDetalheEntrada.add(labelComeco);
			frameDetalheEntrada.add(labelData);
			frameDetalheEntrada.add(valorDia);
			frameDetalheEntrada.add(valorMes);
			frameDetalheEntrada.add(valorAno);
			frameDetalheEntrada.add(labelHora);
			frameDetalheEntrada.add(valorHora);
			
			frameDetalheEntrada.add(labelDuracao);
			frameDetalheEntrada.add(valorDuracao);
			
			frameDetalheEntrada.add(labelPontuacao);
			frameDetalheEntrada.add(valorPontuacao);
			
			frameDetalheEntrada.add(labelLocal);
			frameDetalheEntrada.add(valorLocal);
			
			frameDetalheEntrada.add(labelSintoma);
			frameDetalheEntrada.add(butaoSintoma);
			frameDetalheEntrada.add(valorSintoma);
			
			frameDetalheEntrada.add(labelGatilho);
			frameDetalheEntrada.add(butaoGatilho);
			frameDetalheEntrada.add(valorGatilho);
			
			frameDetalheEntrada.add(labelMedicacao);
			frameDetalheEntrada.add(butaoMedicacao);
			frameDetalheEntrada.add(valorMedicacao);
			
			frameDetalheEntrada.add(labelNotas);
			frameDetalheEntrada.add(valorNotas);
			
			frameDetalheEntrada.add(butaoSalvar);
			frameDetalheEntrada.add(butaoExcluir);
			
			butaoSintoma.addActionListener(this);
			butaoGatilho.addActionListener(this);
			butaoMedicacao.addActionListener(this);
			
			butaoSalvar.addActionListener(this);
			butaoExcluir.addActionListener(this);
		}
		
		frameDetalheEntrada.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == butaoSintoma) {
			new TelaInformacoesDor("Sintoma", dados);
		}
		
		if(src == butaoGatilho) {
			new TelaInformacoesDor("Gatilho", dados);
		}
		
		if(src == butaoMedicacao) {
			new TelaInformacoesDor("Medicação", dados);
		}
		
		if(src == butaoSalvar) {
			
			if(opcao == 0) {
				novoDado[0] = Integer.toString(dados.getQtdDoresDeCabeca());
			}
			else {
				novoDado[0] = Integer.toString(posicao);
			}
			
			novoDado[1] = valorDia.getText() + "-" + valorMes.getText() + "-" + valorAno.getText();
			novoDado[2] = valorHora.getText();
			novoDado[3] = valorDuracao.getText();
			novoDado[4] = valorPontuacao.getText();
			novoDado[5] = valorLocal.getText();
			novoDado[9] = valorNotas.getText();
			
			dados.inserirAtualizarEntrada(novoDado);
			frameDetalheEntrada.dispose();
		}
		
		if(src == butaoExcluir) {
			
		}
	}
	
}
