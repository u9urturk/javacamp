package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.Employer;
import Kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
	 DataResult<List<JobSeeker>> getAll();
	
	 DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId);
	 
	 DataResult<JobSeeker> getByNationalIdentity(String NationalIdentity);
	 

	 
	
	
	 Result add(JobSeeker jobSeeker);
	
	 Result delete(JobSeeker jobSeeker);
	
	 Result update (JobSeeker jobSeeker);
}
