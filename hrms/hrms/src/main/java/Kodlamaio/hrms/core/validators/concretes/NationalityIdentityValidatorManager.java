package Kodlamaio.hrms.core.validators.concretes;

import Kodlamaio.hrms.business.abstracts.JobSeekerService;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.core.validators.abstracts.ValidatorsService;
import Kodlamaio.hrms.entities.concretes.JobSeeker;
import Kodlamaio.hrms.entities.concretes.User;

public class NationalityIdentityValidatorManager implements ValidatorsService {
	
	private JobSeekerService jobSeekerService;
	
	protected NationalityIdentityValidatorManager(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}

	@Override
	public Result isEmailValid(User user) {
		// TODO Auto-generated method stub
		return new SuccessResult();
	}

	@Override
	public Result isNationalityIdentityVerification(JobSeeker jobSeeker) {
			
			if(this.jobSeekerService.getByNationalIdentity(jobSeeker.getNationalIdentity()) != null) {
				
				//System.out.println("Belirtilen kimlik numarasına ait bir kullanıcı mevcut");
				
				
				return new SuccessResult(false, "Belirtilen kimlik numarasına ait bir kullanıcı mevcut");
			}
			
			return new  SuccessResult();
	}

}
