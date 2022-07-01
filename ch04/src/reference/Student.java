package reference;

public class Student {
	//필드
	public int studentID;  //학번
	public String studentName; //이름
	public Subject korean;
	public Subject math;
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	//수업 과목 추가하는 매서드
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생의 정보
	public void showInfo() {
		System.out.println(studentName + "의 국어 점수는 " + korean.getScorePoint()
				+ "점이고, 수학 점수는 " + math.getScorePoint() + "점입니다.");
	}
}








