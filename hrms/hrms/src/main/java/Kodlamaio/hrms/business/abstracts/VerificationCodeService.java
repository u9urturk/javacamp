package Kodlamaio.hrms.business.abstracts;

import java.util.List;

import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.User;
import Kodlamaio.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	DataResult<List<VerificationCode>> getAll();

	DataResult<VerificationCode> getByVerificationCodeId(int verificationCodeId);

	Result add(VerificationCode verificationCode);

	Result delete(VerificationCode verificationCode);

	Result update(VerificationCode verificationCode);
}
