
public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("Sisteme " + instructor.getFirstName() + " isimli e�itmen eklendi.");
		System.out.println("Bran� : " + instructor.getEducation());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Sistemden " + instructor.getFirstName() + " isimli e�itmen silindi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println("Sistemde " + instructor.getFirstName() + " isimli e�itmen ile ilgili g�ncelleme ger�ekle�ti.");
	}
	
	public void createInstruction(Instructor instructor) {
		System.out.println("Olu�turulan e�itim : " + instructor.getEducation());
	}
}
