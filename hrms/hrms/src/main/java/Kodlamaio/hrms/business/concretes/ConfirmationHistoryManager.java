package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.ConfirmationHistoryService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.dataAccess.abstracts.ConfirmationHistoryDao;
import Kodlamaio.hrms.entities.concretes.ConfirmationHistory;

@Service
public class ConfirmationHistoryManager implements ConfirmationHistoryService {
	
	private ConfirmationHistoryDao confirmationHistoryDao;

	@Autowired
	public ConfirmationHistoryManager(ConfirmationHistoryDao confirmationHistoryDao) {
		super();
		this.confirmationHistoryDao = confirmationHistoryDao;
	}
	@Override
	public DataResult<List<ConfirmationHistory>> getAll() {
		
		return new  SuccessDataResult<List<ConfirmationHistory>>
		(this.confirmationHistoryDao.findAll(),"OK");
	}
	@Override
	public Result create(ConfirmationHistory confirmationHistory) {
		
		this.confirmationHistoryDao.save(confirmationHistory);
		return new SuccessResult(true, "Onaylama geçmişi oluşturuldu");
	}
	@Override
	public Result remove(ConfirmationHistory confirmationHistory) {
		this.confirmationHistoryDao.delete(confirmationHistory);
		return new SuccessResult(true,"Onaylama geçmişi kaldırıldı");
	}
	@Override
	public Result update(ConfirmationHistory confirmationHistory) {
		this.confirmationHistoryDao.save(confirmationHistory);
		return new SuccessResult(true, "Onaylama geçmişi güncellendi");
	}

}
