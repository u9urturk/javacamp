
public class StudentManager extends UserManager {
	
	public void add(Student  student) {
	
		System.out.println("Sisteme " + student.getFirstName() + " isimli ��renci eklendi.");
		System.out.println("��renilen ders : " + student.getMyLesson());
	}
	
	public void delete(Student  student) {
		System.out.println("Sistemden " + student.getFirstName() + " isimli ��renci silindi.");
	}
	
	public void update(Student  student) {
		System.out.println("Sistemde " + student.getFirstName() + " isimli ��renci ile ilgili g�ncelleme ger�ekle�ti.");
	}
	
	public void selectLesson(Student  student) {
		System.out.println("Se�ilen ders : " + student.getMyLesson());
	}
}
