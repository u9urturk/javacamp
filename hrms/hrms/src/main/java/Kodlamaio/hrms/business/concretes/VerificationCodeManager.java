package Kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.hrms.business.abstracts.VerificationCodeService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.core.utilities.results.SuccessResult;
import Kodlamaio.hrms.dataAccess.abstracts.VerificationCodeDao;
import Kodlamaio.hrms.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService {
	
	private VerificationCodeDao verificationCodeDao;
	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}
	
	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>( this.verificationCodeDao.findAll(),"OK");
	}

	@Override
	public DataResult<VerificationCode> getByVerificationCodeId(int verificationCodeId) {
		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.getOne(verificationCodeId));
	}

	@Override
	public Result add(VerificationCode verificationCode) {
		this.verificationCodeDao.save(verificationCode);
		return new SuccessResult(true,"Doğrulama kodu oluşturuldu");
	}

	@Override
	public Result delete(VerificationCode verificationCode) {
		this.verificationCodeDao.delete(verificationCode);
		return new SuccessResult(true,"Doğrulama kodu kaldırıldı");
	}

	@Override
	public Result update(VerificationCode verificationCode) {
		this.verificationCodeDao.save(verificationCode);
		return new SuccessResult(true,"Doğrulama kodu güncellendi");
	}

}
