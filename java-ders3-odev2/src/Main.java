
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Uður");
		student.setLastName("Türk");
		student.setEmail("ugur@mail.com");
		student.setBornDate(1998);
		student.setMyLesson("C#");
		
		Instructor instructor = new  Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@mail.com");
		instructor.setBornDate(1986);
		instructor.setEducation("Java");
		
		
		OperationsUI operationsUI1 = new OperationsUI();
		
		operationsUI1.add(new StudentManager(),student);
		operationsUI1.update(new StudentManager(), student);
		operationsUI1.delete(new StudentManager(), student);
		
		System.out.println("*************************************************************");
		
		operationsUI1.add(new InstructorManager(), instructor);
		operationsUI1.update(new InstructorManager(), instructor);
		operationsUI1.delete(new InstructorManager(), instructor);
		

	}

}
