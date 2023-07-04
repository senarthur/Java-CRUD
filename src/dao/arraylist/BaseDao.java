package dao.arraylist;

import java.util.ArrayList;

import interfaces.IDao;
import model.BaseModel;

public class BaseDao<Classe extends BaseModel> implements IDao<Classe>{
	private ArrayList<Classe> lista; 
	
	public BaseDao() {
		lista = new ArrayList<Classe>(); 
	}
	
	public void create(Classe objeto) throws Exception{
		lista.add(objeto); 
	}
	
	public ArrayList<Classe> read() {
		return lista;
	}
	
	public Classe read(int id) throws Exception {
		return find(id);
	}
	
	private Classe find(int id) throws Exception{
		for(Classe aux : lista) { 
			if(id == aux.getId()) { 
				return aux;
			}
		}
		
		throw new Exception("Id inexistente");			
	}
	
	public void update(Classe objeto) throws Exception {
		Classe obj = find(objeto.getId()); 
		obj = objeto; 
	}
	
	public void delete(int id) throws Exception{
		Classe obj = find(id); 
		lista.remove(obj); 
	}
	
	
	
	
	
	
}
