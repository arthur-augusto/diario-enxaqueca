package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDashboard {

	public static void main(String args[]) {

		// Constantes
		final int diasSemDor = 10;
		final int doresEsteMes = 2;
		final int doresMesPassado = 3;
		final int mediaDuracao = 3;
		final int mediaPontuacao = 4;

		// Criando componentes
		JFrame frame = new JFrame("Diário de Dor de Cabeça");
		JLabel semDor = new JLabel(diasSemDor + " Dias sem dores de cabeça");
		JLabel esteMes = new JLabel(doresEsteMes + " Dores de cabeça este mês");
		JLabel mesPassado = new JLabel(doresMesPassado + " Dores de cabeça no mês passado");
		JLabel duracao = new JLabel(mediaDuracao + " Duração média");
		JLabel pontuacao = new JLabel(mediaPontuacao + " Pontuação média de dor");
		JButton addEntrada = new JButton("ADICIONAR ENTRADA");

		// Adicionando componentes
		frame.add(semDor);
		frame.add(esteMes);
		frame.add(mesPassado);
		frame.add(duracao);
		frame.add(pontuacao);
		frame.add(addEntrada);

		// Configurando o JFrame
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
