package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.EmployerService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
		
	}
	
	@GetMapping("/getbyemployerid")
	public DataResult<Employer> getByEmployerId(int employerId){
		return this.employerService.getByEmployerId(employerId);
	}
	
	@PostMapping("/add")
	public Result add(Employer employer) {
		return this.employerService.add(employer);
		
	}
	
	@PostMapping("/delete")
	public Result delete(Employer employer) {
		return this.employerService.delete(employer);
		
	}
	
	@PostMapping("/update")
	public Result update(Employer employer) {
		
		return this.employerService.update(employer);
	}
}
