package main;

import dao.implementacao.RelogioDao;
import enumSet.TipoRelogio;
import model.Relogio;

public class Main {
	public static void main(String[] args) {
		Relogio rel1 = new Relogio(1, 2540, "Cassio Basic", 154.2f, 45, "Cassio", TipoRelogio.ANALOGICO);
		Relogio rel2 = new Relogio(2, 2560, "Cassio Extreme", 280.2f, 100, "Cassio", TipoRelogio.DIGITAL);
		Relogio rel3 = new Relogio(3, 4140, "Rolex", 10102f, 50, "Rolex", TipoRelogio.DIGITAL);
		
		RelogioDao dao = new RelogioDao();
		try {
			dao.create(rel1);
			dao.create(rel2);
			dao.create(rel3);
			var relogioTeste1 = dao.getRelogiosByMarca("Cassio");
			System.out.println(relogioTeste1);
			var relogioTeste2 = dao.getProdutoByCodigo(2540);
			System.out.println(relogioTeste2.getDescricao());
		} catch (Exception e) {
			System.out.println("Erro");
		}
		
		
	}
}
