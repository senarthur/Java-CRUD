package model;

import enumSet.TipoRelogio;

public class Relogio extends Produto {
	private String marca;
	private TipoRelogio tipo;
	
	public Relogio(int id, int codigo, String descricao, float preco, int quantidade, String marca, TipoRelogio tipo) {
		super(id, codigo, descricao, preco, quantidade);
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public TipoRelogio getTipo() {
		return tipo;
	}
	
}
