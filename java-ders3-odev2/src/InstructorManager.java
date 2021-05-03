
public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("Sisteme " + user.getFirstName() + " isimli e�itmen eklendi.");
	}
	
	public void delete(User user) {
		System.out.println("Sistemden " + user.getFirstName() + " isimli e�itmen silindi.");
	}
	
	public void update(User user) {
		System.out.println("Sistemde " + user.getFirstName() + " isimli e�itmen ile ilgili g�ncelleme ger�ele�ti.");
	}
	
	public void createInstruction(Instructor instructor) {
		System.out.println("Olu�turulan e�itim : " + instructor.getInstraction());
	}
}
