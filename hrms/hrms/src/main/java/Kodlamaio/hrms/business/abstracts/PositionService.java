package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.Position;



public interface PositionService {
	
	 DataResult<List<Position>> getAll();
	
	 DataResult<Position> getByPositionId(int positionId);
	
	
	 Result add(Position position);
	
	 Result delete(Position position);
	
	 Result update(Position position);
}
