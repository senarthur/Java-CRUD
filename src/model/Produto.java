package model;

public abstract class Produto extends BaseModel {
	private int codigo;
	private String descricao;
	private float preco;
	private int quantidade;
	
	public Produto(int id, int codigo, String descricao, float preco, int quantidade) {
		super(id);
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
}
