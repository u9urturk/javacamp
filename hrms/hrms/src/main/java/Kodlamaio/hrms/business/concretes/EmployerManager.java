package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.EmployerService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import Kodlamaio.hrms.entities.concretes.Employer;

 @Service
public class EmployerManager implements EmployerService{
	
	 private EmployerDao employerDao;
	 
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"OK");
	}


	@Override
	public DataResult<Employer> getByEmployerId(int employerId) {
		
		return new SuccessDataResult<Employer>(this.employerDao.getOne(employerId));
	}


	@Override
	public Result add(Employer employer) {
		
		this.employerDao.save(employer);
		return new SuccessResult(true, "İş veren eklendi.");
	}


	@Override
	public Result delete(Employer employer) {
		this.employerDao.delete(employer);
		return new SuccessResult(true, "İş veren silindi.");
	}


	@Override
	public Result update(Employer employer) {
		 this.employerDao.save(employer);
		 return new SuccessResult(true, "İş veren güncellendi.");
	}

}
