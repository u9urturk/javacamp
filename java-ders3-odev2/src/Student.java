
public class Student extends User {
	private String myLesson;
	private String firstName;
	private String lastName;
	
	public Student() {
		
	}

	public String getMyLesson() {
		return myLesson;
	}

	public void setMyLesson(String myLesson) {
		this.myLesson = myLesson;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
