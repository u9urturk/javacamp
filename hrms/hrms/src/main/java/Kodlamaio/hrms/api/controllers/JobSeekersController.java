package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.JobSeekerService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		
		return this.jobSeekerService.getAll();
	}
	
	@GetMapping("/getbyjopseekerid")
	public DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId){
		return this.jobSeekerService.getByJobSeekerId(jobSeekerId);
	}
	
	
	@PostMapping("/add")
	public Result add(JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	
	@PostMapping("/delete")
	public Result delete(JobSeeker jobSeeker) {
		return this.jobSeekerService.delete(jobSeeker);
	}
	
	@PostMapping("/update")
	public Result update(JobSeeker jobSeeker) {
		return this.jobSeekerService.update(jobSeeker);
	}
	
}
