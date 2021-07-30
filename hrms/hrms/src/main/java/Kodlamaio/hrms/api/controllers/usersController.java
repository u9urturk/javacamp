package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.hrms.business.abstracts.UserService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")

public class usersController {
	
	private UserService userService;
	
	@Autowired
	public usersController(UserService userService) {
		super();
		this.userService = userService;
	}


	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	
	@GetMapping("/getbyuserid")
	public DataResult<User> getByUserId(int userId){
		return this.userService.getByUserId(userId);
	}
	
	@GetMapping("/test")
	public DataResult<User> test(String email){
		return this.userService.getByEmail(email);
	}
	
	
	@PostMapping("/add")
	public Result add(User user) {
		return this.userService.add(user);
	}
	
	@PostMapping("/delete")
	public Result delete(User user) {
		return this.userService.delete(user);
	}
	
	@PostMapping("/update")
	public Result update(User user) {
		return this.userService.update(user);
	}
}		
