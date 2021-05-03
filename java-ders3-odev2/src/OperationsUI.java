
public class OperationsUI {
	
	public void add(UserManager manager,User user) {
		System.out.println("Ana katman çalıştı");
		
		manager.add(user);
		
	}
	
	public void update(UserManager manager,User user) {
		System.out.println("Ana katman çalıştı");
		
		manager.update(user);
		
	}
	
	public void delete(UserManager manager,User user) {
		System.out.println("Ana katman çalıştı");
		
		manager.delete(user);
		
	}
}
