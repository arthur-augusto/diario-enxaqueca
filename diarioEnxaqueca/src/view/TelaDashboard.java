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
	
	final String totalDores = "10";
	final String mediaDuracao = "03";
	final String mediaPontuacao = "04";
	final String gatilhoMaisComum = "estresse";
	
	private JFrame frameDashboard = new JFrame("Dashboard");
	
	private JLabel numeroDores = new JLabel(totalDores);
	private JLabel textoDores = new JLabel("Total de dores de cabeça");
	
	private JLabel nomeGatilho = new JLabel(gatilhoMaisComum);
	private JLabel textoGatilho = new JLabel("Gatilho mais comum");
	
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
		
		numeroDores.setFont(numero);
		textoDores.setFont(texto);
		
		nomeGatilho.setFont(numero);
		textoGatilho.setFont(texto);
		
		numeroDuracaoMedia.setFont(numero);
		textoDuracaoMedia.setFont(texto);
		
		numeroPontuacaoMedia.setFont(numero);
		textoPontuacaoMedia.setFont(texto);
		
		numeroDores.setBounds(15, 5, 50, 30);
		textoDores.setBounds(60, 5, 300, 30);
		
		numeroDuracaoMedia.setBounds(15, 35, 50, 30);
		textoDuracaoMedia.setBounds(60, 35, 300, 30);
		
		numeroPontuacaoMedia.setBounds(15, 65, 50, 30);
		textoPontuacaoMedia.setBounds(60, 65, 300, 30);

		nomeGatilho.setBounds(15, 95, 1000, 30);
		textoGatilho.setBounds(15, 120, 300, 30);
		
		frameDashboard.add(numeroDores);
		frameDashboard.add(textoDores);
		
		frameDashboard.add(nomeGatilho);
		frameDashboard.add(textoGatilho);
		
		frameDashboard.add(numeroDuracaoMedia);
		frameDashboard.add(textoDuracaoMedia);
		
		frameDashboard.add(numeroPontuacaoMedia);
		frameDashboard.add(textoPontuacaoMedia);
		
		frameDashboard.setVisible(true);
	}
}
