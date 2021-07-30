package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.JobSeekerService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import Kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekersDao jobSeekerDao;
	@Autowired
	public JobSeekerManager(JobSeekersDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}
	@Override
	public SuccessDataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Ok");
	}
	@Override
	public DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getOne(jobSeekerId));
	}
	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult(true,"İş arayan eklendi.");
	}
	@Override
	public Result delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.delete(jobSeeker);
		return new SuccessResult(true, "İş arayan silindi.");
		
	}
	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult(true, "İş arayan güncellendi");
	}
	@Override
	public DataResult<JobSeeker> getByNationalIdentity(String NationalIdentity) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByNationalIdentity(NationalIdentity));
				
	}
	
	
	

}
