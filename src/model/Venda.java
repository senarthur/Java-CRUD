package model;

public class Venda extends BaseModel {
	private Produto produto;
	private Cliente cliente;
	private float totalVendas;
	
	public Venda(int id, Produto produto, Cliente cliente, float totalVendas) {
		super(id);
		this.produto = produto;
		this.cliente = cliente;
		this.totalVendas = totalVendas;
	}
	
}
