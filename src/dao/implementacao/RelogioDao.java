package dao.implementacao;

import java.util.ArrayList;
import java.util.stream.Collectors;

import model.Relogio;

public class RelogioDao extends ProdutoDao<Relogio> {
	ProdutoDao<Relogio> daoProduto = new ProdutoDao<Relogio>();
	
	
	public ArrayList<Relogio> getRelogiosByMarca(String marca) {
		ArrayList<Relogio> relogios = super.read();
		var encontrados = relogios.stream()
	               .filter(relogio -> relogio.getMarca().equals(marca))
	               .collect(Collectors.toList());
		ArrayList<Relogio> relogiosEncontrados = new ArrayList<Relogio>();
		relogiosEncontrados.addAll(encontrados);
		return relogiosEncontrados;	
	}

}
