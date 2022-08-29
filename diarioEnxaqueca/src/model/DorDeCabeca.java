/**
 * Uma entrada no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class DorDeCabeca {
	
	private String data_dor;
	private String hora_inicio;
	private int duracao_dor;
	private int pontuacao_dor;
	private String nota;
	private String local_dor;
	private SintomaDor sintoma_dor;
	private GatilhoDor gatilho_dor;
	private MedicacaoUtilizada medicacao_utilizada;
	
	/**
	 * Cria uma entrada no diário com uma data e hora de inicio, pontuação, etc..
	 * @param data_dor	data do começo da dor.
	 * @param hora_inicio	hora de início da dor.
	 * @param duracao_dor	duração da dor em horas.
	 * @param pontuacao_dor	pontuação da dor, de 1 a 10.
	 * @param nota	anotações breves sobre a dor
	 * @param local_dor	parte da cabeça em que a dor ocorreu.
	 */
	
	public DorDeCabeca(String data_dor, String hora_inicio, int duracao_dor, int pontuacao_dor, String nota,
			String local_dor) {
		super();
		this.data_dor = data_dor;
		this.hora_inicio = hora_inicio;
		this.duracao_dor = duracao_dor;
		this.pontuacao_dor = pontuacao_dor;
		this.nota = nota;
		this.local_dor = local_dor;
	}
	
	public String getData_dor() {
		return data_dor;
	}

	public void setData_dor(String data_dor) {
		this.data_dor = data_dor;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public int getDuracao_dor() {
		return duracao_dor;
	}

	public void setDuracao_dor(int duracao_dor) {
		this.duracao_dor = duracao_dor;
	}

	public int getPontuacao_dor() {
		return pontuacao_dor;
	}

	public void setPontuacao_dor(int pontuacao_dor) {
		this.pontuacao_dor = pontuacao_dor;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getLocal_dor() {
		return local_dor;
	}

	public void setLocal_dor(String local_dor) {
		this.local_dor = local_dor;
	}

	public SintomaDor getSintoma_dor() {
		return sintoma_dor;
	}

	public void setSintoma_dor(SintomaDor sintoma_dor) {
		this.sintoma_dor = sintoma_dor;
	}

	public GatilhoDor getGatilho_dor() {
		return gatilho_dor;
	}

	public void setGatilho_dor(GatilhoDor gatilho_dor) {
		this.gatilho_dor = gatilho_dor;
	}

	public MedicacaoUtilizada getMedicacao_utilizada() {
		return medicacao_utilizada;
	}

	public void setMedicacao_utilizada(MedicacaoUtilizada medicacao_utilizada) {
		this.medicacao_utilizada = medicacao_utilizada;
	}
}