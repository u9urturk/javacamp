package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.ConfirmationHistory;

public interface ConfirmationHistoryService {
	
	DataResult<List<ConfirmationHistory>> getAll();
	
	Result create(ConfirmationHistory confirmationHistory);
	
	Result remove(ConfirmationHistory confirmationHistory);
	
	Result update (ConfirmationHistory confirmationHistory);
}
