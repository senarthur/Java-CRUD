package interfaces;

import java.util.ArrayList;

public interface IDao<Classe> {
	void create(Classe objeto) throws Exception;
	ArrayList<Classe> read();
	Classe read(int id) throws Exception;
	void update(Classe objeto) throws Exception;
	void delete(int id) throws Exception;
}
