package business;

import java.util.ArrayList;

import interfaces.IDao;

public class BaseBusiness<Classe> {
	protected IDao<Classe> dao;
	
	public BaseBusiness(IDao<Classe> dao) { 
		this.dao = dao;
	}
	
	public void create(Classe objeto) throws Exception{ 
		dao.create(objeto);
	}
	
	public ArrayList<Classe> read() {
		return dao.read();
	}
	
	public Classe read(int id) throws Exception{ 
		return dao.read(id); 
	}
	
	public void update(Classe objeto) throws Exception { 
		dao.update(objeto); 
	}
}
