package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.SystemWorkerService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.dataAccess.abstracts.SystemWorkerDao;
import Kodlamaio.hrms.entities.concretes.SystemWorker;

@Service
public class SystemWorkerManager implements SystemWorkerService {
	
	private SystemWorkerDao systemWorkerDao;
	
	@Autowired
	public SystemWorkerManager(SystemWorkerDao systemWorkerDao) {
		super();
		this.systemWorkerDao = systemWorkerDao;
	}
	@Override
	public DataResult<List<SystemWorker>> getAll() {
		
		return new SuccessDataResult<List<SystemWorker>>(this.systemWorkerDao.findAll(),"OK");
	}
	@Override
	public DataResult<SystemWorker> getBySystemWorkerId(int systemWorkerId) {
		return new SuccessDataResult<SystemWorker>(this.systemWorkerDao.getOne(systemWorkerId));
	}
	@Override
	public Result add(SystemWorker systemWorker) {
		this.systemWorkerDao.save(systemWorker);
		return new SuccessResult(true, "Sistem çalışanı eklendi");
	}
	@Override
	public Result delete(SystemWorker systemWorker) {
		this.systemWorkerDao.delete(systemWorker);
		return new SuccessResult(true,"Sistem çalışanı silindi");
	}
	@Override
	public Result update(SystemWorker systemWorker) {
		this.systemWorkerDao.save(systemWorker);
		return new SuccessResult(true, "Sistem çalışanı güncellendi");
	}

}
