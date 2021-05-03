
public class StudentManager extends UserManager {
	
	public void add(Student  student) {
	
		System.out.println("Sisteme " + student.getFirstName() + " isimli öðrenci eklendi.");
		System.out.println("Öðrenilen ders : " + student.getMyLesson());
	}
	
	public void delete(Student  student) {
		System.out.println("Sistemden " + student.getFirstName() + " isimli Öðrenci silindi.");
	}
	
	public void update(Student  student) {
		System.out.println("Sistemde " + student.getFirstName() + " isimli Öðrenci ile ilgili güncelleme gerçekleþti.");
	}
	
	public void selectLesson(Student  student) {
		System.out.println("Seçilen ders : " + student.getMyLesson());
	}
}
