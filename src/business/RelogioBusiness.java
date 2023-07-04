package business;

import interfaces.IDao;
import model.Relogio;

public class RelogioBusiness extends BaseBusiness<Relogio> {

	public RelogioBusiness(IDao<Relogio> dao) {
		super(dao);
	}

}
