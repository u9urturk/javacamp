package Kodlamaio.hrms.core.validators.abstracts;

import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.JobSeeker;
import Kodlamaio.hrms.entities.concretes.User;

public interface ValidatorsService {
	
	Result isEmailValid(User user);
	
	Result isNationalityIdentityVerification(JobSeeker jobSeeker);
}
