/**
 * Uma tela para adicionar e editar as entradas no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import javax.swing.*;

public class TelaDetalheEntrada {

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
			
			labelComeco.setBounds(113, 10, 175, 25);
			labelData.setBounds(88, 40, 40, 25);
			valorDia.setBounds(113, 40, 30, 25);
			valorMes.setBounds(148, 40, 30, 25);
			valorAno.setBounds(183, 40, 40, 25);
			valorHora.setBounds(243, 40, 45, 25);
			
			labelDuracao.setBounds(10, 75, 225, 25);
			valorDuracao.setBounds(240, 75, 30, 25);
			
			frameDetalheEntrada.add(labelComeco);
			frameDetalheEntrada.add(labelData);
			frameDetalheEntrada.add(valorDia);
			frameDetalheEntrada.add(valorMes);
			frameDetalheEntrada.add(valorAno);
			frameDetalheEntrada.add(valorHora);
			
			frameDetalheEntrada.add(labelDuracao);
			frameDetalheEntrada.add(valorDuracao);
		}
		
		frameDetalheEntrada.setLayout(null);
		
		frameDetalheEntrada.setSize(400, 300);
		
		frameDetalheEntrada.setVisible(true);
		
	}
	
}
