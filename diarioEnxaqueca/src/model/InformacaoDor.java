/**
 * Conjunto de informações sobre uma dor de cabeça.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public abstract class InformacaoDor {

	public String nome;
	public String descricao;

	/**
	 * Construtor da classe abstrata para que as filhas possam usá-lo em seus respectivos contrutores.
	 * @param nome nome da informação.
	 * @param descricao informações adicionais.
	 */
	
	public InformacaoDor(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
