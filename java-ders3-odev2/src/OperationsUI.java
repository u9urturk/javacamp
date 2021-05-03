
public class OperationsUI {
	
	public void add(UserManager manager,User user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.add(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void add(UserManager manager,Student user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.add(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void add(UserManager manager,Instructor user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.add(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	
	
	public void update(UserManager manager,User user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.update(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void update(UserManager manager,Student user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.update(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void update(UserManager manager,Instructor user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.update(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void delete(UserManager manager,User user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.delete(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void delete(UserManager manager,Student user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.delete(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
	
	public void delete(UserManager manager,Instructor user,Logger logger) {
		System.out.println("Ana katman çalýþtý");
		
		manager.delete(user);
		logger.log();
		System.out.println("******************************************************************");
		
	}
}
