/**
 * Uma entrada no diário.
 * @author Ana Letícia Melo Pereira & Arthur Augusto Rezende da Paixão
 * @since 2022
 * @version 1.0
 */

package model;

public class DorDeCabeca {
	
	private String dataDor;
	private String horaInicio;
	private int duracaoDor;
	private int pontuacaoDor;
	private String notas;
	private String localDor;
	private SintomaDor sintomaDor;
	private GatilhoDor gatilhoDor;
	private MedicacaoUtilizada medicacaoUtilizada;

	/**
	 * Cria uma entrada vazia no diário.
	 */
	
	public DorDeCabeca() {
		super();
	}
	
	/**
	 * Cria uma entrada no diário com uma data e hora de inicio, pontuação, etc..
	 * @param dataDor	data do começo da dor.
	 * @param horaInicio	hora de início da dor.
	 * @param duracaoDor	duração da dor em horas.
	 * @param pontuacaoDor	pontuação da dor, de 1 a 10.
	 * @param nota	anotações breves sobre a dor
	 * @param localDor	parte da cabeça em que a dor ocorreu.
	 * @param sintomaDor sintoma associado a dor de cabeça.
	 * @param gatilhoDor gatilhos da dor de cabeça.
	 * @param medicacaoUtilizada remédio usado para tratar a dor de cabeça.
	 */
	
	public DorDeCabeca(String dataDor, String horaInicio, int duracaoDor, int pontuacaoDor, String notas,
			String localDor, SintomaDor sintomaDor, GatilhoDor gatilhoDor, MedicacaoUtilizada medicacaoUtilizada) {
		super();
		this.dataDor = dataDor;
		this.horaInicio = horaInicio;
		this.duracaoDor = duracaoDor;
		this.pontuacaoDor = pontuacaoDor;
		this.notas = notas;
		this.localDor = localDor;
		this.sintomaDor = sintomaDor;
		this.gatilhoDor = gatilhoDor;
		this.medicacaoUtilizada = medicacaoUtilizada;
	}

	public String getDataDor() {
		return dataDor;
	}

	public void setDataDor(String dataDor) {
		this.dataDor = dataDor;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getDuracaoDor() {
		return duracaoDor;
	}

	public void setDuracaoDor(int duracaoDor) {
		this.duracaoDor = duracaoDor;
	}

	public int getPontuacaoDor() {
		return pontuacaoDor;
	}

	public void setPontuacaoDor(int pontuacaoDor) {
		this.pontuacaoDor = pontuacaoDor;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getLocalDor() {
		return localDor;
	}

	public void setLocalDor(String localDor) {
		this.localDor = localDor;
	}

	public SintomaDor getSintomaDor() {
		return sintomaDor;
	}

	public void setSintomaDor(SintomaDor sintomaDor) {
		this.sintomaDor = sintomaDor;
	}

	public GatilhoDor getGatilhoDor() {
		return gatilhoDor;
	}

	public void setGatilhoDor(GatilhoDor gatilhoDor) {
		this.gatilhoDor = gatilhoDor;
	}

	public MedicacaoUtilizada getMedicacaoUtilizada() {
		return medicacaoUtilizada;
	}

	public void setMedicacaoUtilizada(MedicacaoUtilizada medicacaoUtilizada) {
		this.medicacaoUtilizada = medicacaoUtilizada;
	}
}