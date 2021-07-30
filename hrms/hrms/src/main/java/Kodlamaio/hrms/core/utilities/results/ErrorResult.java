package Kodlamaio.hrms.core.utilities.results;

public class ErrorResult extends Result{

	public ErrorResult(boolean success, String message) {
		super(false, message);
		
	}
	
	public ErrorResult() {
		super(false);
		
	}

}
