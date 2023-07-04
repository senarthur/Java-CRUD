package model;

public class Livro extends Produto {
	private String autor;
	private String genero;
	
	public Livro(int id, int codigo, String descricao, float preco, int quantidade, String autor, String genero) {
		super(id, codigo, descricao, preco, quantidade);
		this.autor = autor;
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public String getGenero() {
		return genero;
	}

}
