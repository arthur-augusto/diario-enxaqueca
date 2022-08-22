package view;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDashboard {
	
	// Fontes para as metricas
	final Font numero = new Font("Arial", Font.BOLD, 28);
	final Font texto = new Font("Arial", Font.PLAIN, 18);
	
	// Dados provisorios
	final String diasSemDor = "10";
	final String doresEsteMes = "02";
	final String doresMesPassado = "03";
	final String mediaDuracao = "03";
	final String mediaPontuacao = "04";
	
	// Criando componentes da TelaDashboard
	public JFrame frameDashboard = new JFrame("Dashboard");
	
	public JLabel numeroSemDor = new JLabel(diasSemDor);
	public JLabel textoSemDor = new JLabel("Dias sem dores de cabeça");
	
	public JLabel numeroEsteMes = new JLabel(doresEsteMes);
	public JLabel textoEsteMes = new JLabel("Dores de cabeça este mês");
	
	public JLabel numeroMesPassado = new JLabel(doresMesPassado);
	public JLabel textoMesPassado = new JLabel("Dores de cabeça no mês passado");
	
	public JLabel numeroDuracaoMedia = new JLabel(mediaDuracao);
	public JLabel textoDuracaoMedia = new JLabel("Duração média");
	
	public JLabel numeroPontuacaoMedia = new JLabel(mediaPontuacao);
	public JLabel textoPontuacaoMedia = new JLabel("Pontuação média de dor");
	
	// Construtor da TelaDashboard
	public TelaDashboard() {
		
		// Configurando o JFrame
		frameDashboard.setLayout(null);
		
		frameDashboard.setSize(400, 300);
		
		// Configurando as fontes das JLabels
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
		
		// Posicionando e definindo o tamanho dos componentes
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

		// Adicionando componentes
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
		
		// Tornando o frameDashboard visivel
		frameDashboard.setVisible(true);
	}
	
}
