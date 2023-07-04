package model;

public abstract class Dvd extends Produto {
	private int registroDv;

	public Dvd(int id, int codigo, String descricao, float preco, int quantidade, int registroDv) {
		super(id, codigo, descricao, preco, quantidade);
		this.registroDv = registroDv;
	}

	public int getRegistroDv() {
		return registroDv;
	}
	
}
