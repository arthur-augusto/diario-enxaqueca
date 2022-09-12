/**
 * Informações sobre os sintomas associados à dor de cabeça.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class SintomaDor extends InformacaoDor {

	public String duracaoSintoma;

	/**
	 * Cria um tipo de sintoma, que pode estar associado a uma ou várias dores de cabeça
	 * @param nome	nome da informação.
	 * @param descricao	informações adicionais.
	 * @param duracaoSintoma duração do sintoma em horas.
	 */
	public SintomaDor(String nome, String descricao, String duracaoSintoma) {
		super(nome, descricao);
		this.duracaoSintoma = duracaoSintoma;
	}

	public String getDuracaoSintoma() {
		return duracaoSintoma;
	}

	public void setDuracaoSintoma(String duracaoSintoma) {
		this.duracaoSintoma = duracaoSintoma;
	}
}
