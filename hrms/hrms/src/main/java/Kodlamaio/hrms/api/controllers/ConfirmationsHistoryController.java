package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.ConfirmationHistoryService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import Kodlamaio.hrms.entities.concretes.ConfirmationHistory;

@RestController
@RequestMapping("/api/confirmationshistory")
public class ConfirmationsHistoryController {
	
	private ConfirmationHistoryService confirmationHistoryService;
	
	@Autowired
	protected ConfirmationsHistoryController(ConfirmationHistoryService confirmationHistoryService) {
		super();
		this.confirmationHistoryService = confirmationHistoryService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ConfirmationHistory>>getAll(){
		
		return this.confirmationHistoryService.getAll();
		
	}
	
	@PostMapping("/create")
	public Result Create(ConfirmationHistory confirmationHistory) {
		
		return this.confirmationHistoryService.create(confirmationHistory);
	}
	
	@PostMapping("remove")
	public Result Remove(ConfirmationHistory confirmationHistory) {
		
		return this.confirmationHistoryService.remove(confirmationHistory);
		
	}
	
	@PostMapping("update")
	public Result Update(ConfirmationHistory confirmationHistory) {
			return this.confirmationHistoryService.update(confirmationHistory);
	}
}
