package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	 DataResult<List<Employer>> getAll();
	
	 DataResult<Employer> getByEmployerId(int employerId);
	
	
	 Result add(Employer employer);
	
	 Result delete(Employer employer);
	
	 Result update (Employer employer);
}
