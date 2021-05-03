
public class StudentManager extends UserManager {
	
	public void add(User user) {
	
		System.out.println("Sisteme " + user.getFirstName() + " isimli öðrenci eklendi.");
	}
	
	public void delete(User user) {
		System.out.println("Sistemden " + user.getFirstName() + " isimli Öðrenci silindi.");
	}
	
	public void update(User user) {
		System.out.println("Sistemde " + user.getFirstName() + " isimli Öðrenci ile ilgili güncelleme gerçeleþti.");
	}
	
	public void selectLesson(Student student) {
		System.out.println("Seçilen ders : " + student.getMyLesson());
	}
}
