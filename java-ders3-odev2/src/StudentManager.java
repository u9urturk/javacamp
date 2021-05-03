
public class StudentManager extends UserManager {
	
	public void add(User user) {
	
		System.out.println("Sisteme " + user.getFirstName() + " isimli ��renci eklendi.");
	}
	
	public void delete(User user) {
		System.out.println("Sistemden " + user.getFirstName() + " isimli ��renci silindi.");
	}
	
	public void update(User user) {
		System.out.println("Sistemde " + user.getFirstName() + " isimli ��renci ile ilgili g�ncelleme ger�ele�ti.");
	}
	
	public void selectLesson(Student student) {
		System.out.println("Se�ilen ders : " + student.getMyLesson());
	}
}
