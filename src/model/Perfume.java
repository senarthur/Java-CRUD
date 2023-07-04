package model;

public class Perfume extends Produto {
	private String marca;
	private int qtdeMilimetros;
	
	public Perfume(int id, int codigo, String descricao, float preco, int quantidade, String marca, int qtdeMilimetros) {
		super(id, codigo, descricao, preco, quantidade);
		this.marca = marca;
		this.qtdeMilimetros = qtdeMilimetros;
	}

	public String getMarca() {
		return marca;
	}

	public int getQtdeMilimetros() {
		return qtdeMilimetros;
	}
	
}
