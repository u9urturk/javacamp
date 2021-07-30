package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.SystemWorkerService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.SystemWorker;

@RestController
@RequestMapping("/api/systemworkers")
public class SystemWorkersController {

	private SystemWorkerService systemWorkerService;

	@Autowired
	public SystemWorkersController(SystemWorkerService systemWorkerService) {
		super();
		this.systemWorkerService = systemWorkerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SystemWorker>> getAll(){
		
		return this.systemWorkerService.getAll();
	}
	
	@GetMapping("/getbysystemworkerid")
	public DataResult<SystemWorker> getBySystemWorkerId(int systemWorkerId){
		return this.systemWorkerService.getBySystemWorkerId(systemWorkerId);
	}
	
	
	 @PostMapping("/add")
	 public Result add(SystemWorker systemWorker) {
		 return this.systemWorkerService.add(systemWorker);
	 }
	 
	 @PostMapping("/delete")
	 public Result delete(SystemWorker systemWorker) {
		 return this.systemWorkerService.delete(systemWorker);
	 }
	 
	 @PostMapping("/update")
	 public Result update(SystemWorker systemWorker) {
		 return this.systemWorkerService.update(systemWorker);
	 }
}
