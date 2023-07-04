package dao.implementacao;

import java.util.ArrayList;
import dao.arraylist.BaseDao;
import model.Produto;

public class ProdutoDao<Classe extends Produto> extends BaseDao<Classe> {
	
	public Classe getProdutoByCodigo(int codigo) {
		
		ArrayList<Classe> produtos = super.read();
		
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCodigo() == codigo) {
				return produtos.get(i);
			}
		}
		
		return null;
	}
	
}
