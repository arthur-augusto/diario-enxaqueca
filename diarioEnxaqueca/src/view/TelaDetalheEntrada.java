/**
 * Uma tela para adicionar e editar as entradas no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

// Sono muito curto ou muito longo

package view;

import javax.swing.*;
import java.awt.event.*;

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
	
	private JLabel labelGatilho;
	private JButton butaoGatilho;
	
	private JLabel labelMedicacao;
	private JButton butaoMedicacao;
	
	private JLabel labelNotas;
	private JTextField valorNotas;
	
	private String titulo;
	
	/**
	 * Cria uma tela para adicionar ou alterar entradas
	 */
	public void AdicionarOuEditar (int op) {
		
		if (op == 0) titulo = "Adicionar Entrada";
		if (op == 1) titulo = "Editar Entrada";
		
		frameDetalheEntrada = new JFrame(titulo);
		
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
			valorLocal = new JTextField(200);
			
			labelSintoma = new JLabel("Sintoma");
			butaoSintoma = new JButton("+");
			
			labelGatilho = new JLabel("Gatilho");
			butaoGatilho = new JButton("+");
			
			labelMedicacao = new JLabel("Medicação");
			butaoMedicacao = new JButton("+");
			
			labelNotas = new JLabel("Notas:");
			valorNotas = new JTextField(200);
			
			labelComeco.setBounds(10, 10, 175, 25);
			labelData.setBounds(190, 10, 30, 25);
			valorDia.setBounds(225, 10, 30, 25);
			valorMes.setBounds(260, 10, 30, 25);
			valorAno.setBounds(295, 10, 40, 25);
			labelHora.setBounds(345, 10, 30, 25);
			valorHora.setBounds(380, 10, 45, 25);
			
			labelDuracao.setBounds(10, 50, 225, 25);
			valorDuracao.setBounds(240, 50, 30, 25);
			
			labelPontuacao.setBounds(10, 90, 280, 25);
			valorPontuacao.setBounds(295, 90, 30, 25);
			
			labelLocal.setBounds(10, 130, 160, 25);
			valorLocal.setBounds(175, 130, 200, 25);
			
			labelSintoma.setBounds(10, 170, 50, 25);
			butaoSintoma.setBounds(414, 170, 41, 25);
			
			labelGatilho.setBounds(10, 210, 50, 25);
			butaoGatilho.setBounds(414, 210, 41, 25);
			
			labelMedicacao.setBounds(10, 250, 65, 25);
			butaoMedicacao.setBounds(414, 250, 41, 25);
			
			labelNotas.setBounds(10, 290, 40, 25);
			valorNotas.setBounds(55, 290, 400, 25);
			
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
			
			butaoSintoma.addActionListener(this);
			butaoGatilho.addActionListener(this);
			butaoMedicacao.addActionListener(this);
		}
		
		frameDetalheEntrada.setLayout(null);
		
		frameDetalheEntrada.setSize(500, 375);
		
		frameDetalheEntrada.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
}
