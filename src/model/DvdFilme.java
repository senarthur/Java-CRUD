package model;

public class DvdFilme extends Dvd {
	private String diretor;
	private int anoLancamento;
	
	public DvdFilme(int id, int codigo, String descricao, float preco, int quantidade, int registroDv, String diretor,
			int anoLancamento) {
		super(id, codigo, descricao, preco, quantidade, registroDv);
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
	}

	public String getDiretor() {
		return diretor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}
	
}
