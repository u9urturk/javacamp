package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.PositionService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import Kodlamaio.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {
	
	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getAll() {
		
		return new SuccessDataResult<List<Position>>(this.positionDao.findAll(),"OK");
	}

	@Override
	public DataResult<Position> getByPositionId(int positionId) {
		
		return new SuccessDataResult<Position>(this.positionDao.getOne(positionId));
	}

	@Override
	public Result add(Position position) {
		this.positionDao.save(position);
		return new SuccessResult(true, "Pozisyon eklendi.");
	}

	@Override
	public Result delete(Position position) {
		this.positionDao.delete(position);
		return new SuccessResult(true, "Pozisyon silindi.");
		
	}

	@Override
	public Result update(Position position) {
		this.positionDao.save(position);
		return new SuccessResult(true, "Pozisyon güncellendi");
	}

}
