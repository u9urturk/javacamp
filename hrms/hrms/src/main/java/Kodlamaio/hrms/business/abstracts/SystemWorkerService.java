package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.Employer;
import Kodlamaio.hrms.entities.concretes.SystemWorker;

public interface SystemWorkerService {
	
	DataResult<List<SystemWorker>> getAll();
	
	DataResult<SystemWorker> getBySystemWorkerId(int systemWorkerId);
	
	
	Result add(SystemWorker systemWorker);
	
	Result delete(SystemWorker systemWorker);
	
	Result update (SystemWorker systemWorker);
}
