package model;

public class DvdSoftware extends Dvd {
	private int versao;
	private String requisitosSistema;
	
	public DvdSoftware(int id, int codigo, String descricao, float preco, int quantidade, int registroDv, int versao,
			String requisitosSistema) {
		super(id, codigo, descricao, preco, quantidade, registroDv);
		this.versao = versao;
		this.requisitosSistema = requisitosSistema;
	}

	public int getVersao() {
		return versao;
	}

	public String getRequisitosSistema() {
		return requisitosSistema;
	}
}
