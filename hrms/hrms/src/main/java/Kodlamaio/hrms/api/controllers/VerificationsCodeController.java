 package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.VerificationCodeService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.VerificationCode;

@RestController
@RequestMapping("/api/verificationcodes")
public class VerificationsCodeController {
	
	private VerificationCodeService verificationCodeService;
	
	@Autowired
	public VerificationsCodeController(VerificationCodeService verificationCodeService) {
		super();
		this.verificationCodeService = verificationCodeService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<VerificationCode>> getAll(){
		
		return this.verificationCodeService.getAll();
	}
	
	@GetMapping("/getbyverificationcodeid")
	public DataResult<VerificationCode> getByVerificationCodeId(int verificationCodeId){
		return this.verificationCodeService.getByVerificationCodeId(verificationCodeId);
	}
	
	
	@PostMapping("/add")
	public Result add(VerificationCode verificationCode) {
		return this.verificationCodeService.add(verificationCode);
	}
	
	@PostMapping("/delete")
	public Result delete(VerificationCode verificationCode) {
		return this.verificationCodeService.delete(verificationCode);
	}
	
	@PostMapping("/update")
	public Result update(VerificationCode verificationCode) {
		return this.verificationCodeService.update(verificationCode);
	}
}
