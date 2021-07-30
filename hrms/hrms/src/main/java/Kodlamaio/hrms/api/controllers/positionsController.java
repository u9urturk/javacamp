package Kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import Kodlamaio.hrms.business.abstracts.PositionService;
import Kodlamaio.hrms.core.utilities.results.DataResult;
import Kodlamaio.hrms.core.utilities.results.Result;
import Kodlamaio.hrms.entities.concretes.Position;


@RestController
@RequestMapping("/api/positions")
public class positionsController {
	
	private PositionService positionService;
	
	@Autowired
	public positionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Position>> getAll(){
		
		return this.positionService.getAll();
	}
	
	@GetMapping("/getbypositionid")
	public DataResult<Position> getByPositionId(int positionId){
		return this.positionService.getByPositionId(positionId);
	}
	
	
	@PostMapping("/add")
	public Result add(Position position) {
		return this.positionService.add(position);
	}
	
	@PostMapping("/delete")
	public Result delete(Position position) {
		return this.positionService.delete(position);
	}
	
	@PostMapping("update")
	public Result update(Position position) {
		return this.positionService.update(position);
	}
	
}
