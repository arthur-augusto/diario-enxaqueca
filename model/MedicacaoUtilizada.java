/**
 * Informações sobre a medicação utilizada para tratar a dor de cabeça.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class MedicacaoUtilizada extends InformacaoDor {

	public String dosagem;
	public String eficacia_medicacao;
	
	/**
	 * Cria um tipo de medicamento, que pode estar associado a uma ou várias dores de cabeça.
	 * @param nome	nome da informação.
	 * @param descricao	informações adicionais.
	 * @param dosagem dosagem da medicação.
	 * @param eficacia_medicacao diz o quão bem a medicação funcionou.
	 */
	
	public MedicacaoUtilizada(String nome, String descricao, String dosagem, String eficacia_medicacao) {
		super(nome, descricao);
		this.dosagem = dosagem;
		this.eficacia_medicacao = eficacia_medicacao;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getEficacia_medicacao() {
		return eficacia_medicacao;
	}

	public void setEficacia_medicacao(String eficacia_medicacao) {
		this.eficacia_medicacao = eficacia_medicacao;
	}
}
