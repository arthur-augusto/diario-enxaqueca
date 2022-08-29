/**
 * Informações sobre os sintomas associados à dor de cabeça.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class SintomaDor extends InformacaoDor {

	public String duracao_sintoma;

	/**
	 * Cria um tipo de sintoma, que pode estar associado a uma ou várias dores de cabeça
	 * @param nome	nome da informação.
	 * @param descricao	informações adicionais.
	 * @param duracao_sintoma duração do sintoma em horas.
	 */
	public SintomaDor(String nome, String descricao, String duracao_sintoma) {
		super(nome, descricao);
		this.duracao_sintoma = duracao_sintoma;
	}

	public String getDuracao_sintoma() {
		return duracao_sintoma;
	}

	public void setDuracao_sintoma(String duracao_sintoma) {
		this.duracao_sintoma = duracao_sintoma;
	}

}
