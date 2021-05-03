
public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("Sisteme " + instructor.getFirstName() + " isimli eðitmen eklendi.");
		System.out.println("Branþ : " + instructor.getEducation());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Sistemden " + instructor.getFirstName() + " isimli eðitmen silindi.");
	}
	
	public void update(Instructor instructor) {
		System.out.println("Sistemde " + instructor.getFirstName() + " isimli eðitmen ile ilgili güncelleme gerçekleþti.");
	}
	
	public void createInstruction(Instructor instructor) {
		System.out.println("Oluþturulan eðitim : " + instructor.getEducation());
	}
}
