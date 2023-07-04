package model;

public class DvdShow extends Dvd {
	private String artista;
	private int numeroMusicas;
	
	public DvdShow(int id, int codigo, String descricao, float preco, int quantidade, int registroDv, String artista,
			int numeroMusicas) {
		super(id, codigo, descricao, preco, quantidade, registroDv);
		this.artista = artista;
		this.numeroMusicas = numeroMusicas;
	}

	public String getArtista() {
		return artista;
	}

	public int getNumeroMusicas() {
		return numeroMusicas;
	}
	
}
