
public class InstructorManager extends UserManager {
	public void add(User user) {
		System.out.println("Sisteme " + user.getFirstName() + " isimli eðitmen eklendi.");
	}
	
	public void delete(User user) {
		System.out.println("Sistemden " + user.getFirstName() + " isimli eðitmen silindi.");
	}
	
	public void update(User user) {
		System.out.println("Sistemde " + user.getFirstName() + " isimli eðitmen ile ilgili güncelleme gerçeleþti.");
	}
	
	public void createInstruction(Instructor instructor) {
		System.out.println("Oluþturulan eðitim : " + instructor.getInstraction());
	}
}
