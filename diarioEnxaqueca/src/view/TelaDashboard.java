/**
 * Um mini-Dashboard a respeito de todas as dores de cabeça do usuário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package view;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDashboard {
	
	final Font numero = new Font("Arial", Font.BOLD, 28);
	final Font texto = new Font("Arial", Font.PLAIN, 18);
	
	final String diasSemDor = "10";
	final String doresEsteMes = "02";
	final String doresMesPassado = "03";
	final String mediaDuracao = "03";
	final String mediaPontuacao = "04";
	
	private JFrame frameDashboard = new JFrame("Dashboard");
	
	private JLabel numeroSemDor = new JLabel(diasSemDor);
	private JLabel textoSemDor = new JLabel("Dias sem dores de cabeça");
	
	private JLabel numeroEsteMes = new JLabel(doresEsteMes);
	private JLabel textoEsteMes = new JLabel("Dores de cabeça este mês");
	
	private JLabel numeroMesPassado = new JLabel(doresMesPassado);
	private JLabel textoMesPassado = new JLabel("Dores de cabeça no mês passado");
	
	private JLabel numeroDuracaoMedia = new JLabel(mediaDuracao);
	private JLabel textoDuracaoMedia = new JLabel("Duração média");
	
	private JLabel numeroPontuacaoMedia = new JLabel(mediaPontuacao);
	private JLabel textoPontuacaoMedia = new JLabel("Pontuação média de dor");
	
	/**
	 * Cria uma tela com 5 métricas, baseadas em todas as dores de cabeça cadastradas.
	 */
	
	public TelaDashboard() {
		
		frameDashboard.setLayout(null);
		
		frameDashboard.setSize(500, 375);
		
		numeroSemDor.setFont(numero);
		textoSemDor.setFont(texto);
		
		numeroEsteMes.setFont(numero);
		textoEsteMes.setFont(texto);
		
		numeroMesPassado.setFont(numero);
		textoMesPassado.setFont(texto);
		
		numeroDuracaoMedia.setFont(numero);
		textoDuracaoMedia.setFont(texto);
		
		numeroPontuacaoMedia.setFont(numero);
		textoPontuacaoMedia.setFont(texto);
		
		numeroSemDor.setBounds(5, 5, 50, 30);
		textoSemDor.setBounds(60, 5, 300, 30);

		numeroEsteMes.setBounds(5, 40, 50, 30);
		textoEsteMes.setBounds(60, 40, 300, 30);
		
		numeroMesPassado.setBounds(5, 75, 50, 30);
		textoMesPassado.setBounds(60, 75, 300, 30);
		
		numeroDuracaoMedia.setBounds(5, 110, 50, 30);
		textoDuracaoMedia.setBounds(60, 110, 300, 30);
		
		numeroPontuacaoMedia.setBounds(5, 145, 50, 30);
		textoPontuacaoMedia.setBounds(60, 145, 300, 30);

		frameDashboard.add(numeroSemDor);
		frameDashboard.add(textoSemDor);
		
		frameDashboard.add(numeroEsteMes);
		frameDashboard.add(textoEsteMes);
		
		frameDashboard.add(numeroMesPassado);
		frameDashboard.add(textoMesPassado);
		
		frameDashboard.add(numeroDuracaoMedia);
		frameDashboard.add(textoDuracaoMedia);
		
		frameDashboard.add(numeroPontuacaoMedia);
		frameDashboard.add(textoPontuacaoMedia);
		
		frameDashboard.setVisible(true);
	}
}
