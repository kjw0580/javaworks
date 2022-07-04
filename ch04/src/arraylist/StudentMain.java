package arraylist;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1001, "이양파");
		Student s2 = new Student(1002, "박마늘");
		 
		s1.addSubject("국어", 95);
		s1.addSubject("수학", 85);
		
		s2.addSubject("Java", 85);
		s2.addSubject("JavaScript", 55);
		
		s1.showStudentInfo();
		s2.showStudentInfo();
	}

}
