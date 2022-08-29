/**
 * Informações sobre as possiveis causas da dor de cabeça.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class GatilhoDor extends InformacaoDor{

	public String recorrencia_gatilho;
	
	/**
	 * Cria um tipo de gatilho, que pode estar associado a uma ou várias dores de cabeça.
	 * @param nome	nome da informação.
	 * @param descricao	informações adicionais.
	 * @param recorrencia_gatilho	como o gatilho se repete.
	 */
	
	public GatilhoDor(String nome, String descricao, String recorrencia_gatilho) {
		super(nome, descricao);
		this.recorrencia_gatilho = recorrencia_gatilho;
	}


	public String getRecorrencia_gatilho() {
		return recorrencia_gatilho;
	}

	public void setRecorrencia_gatilho(String recorrencia_gatilho) {
		this.recorrencia_gatilho = recorrencia_gatilho;
	}

}
