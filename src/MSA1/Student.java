package MSA1;

public class Student {
    private int rollNo;
    private String name;
    private Double marks;
    private int age;
    
	public Student() {
		super();
		
	}

	public Student(int rollNo, String name, Double marks, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " \nStudent RollNo=" + rollNo 
				+ ",Student Name=" + name 
				+ ", Marks=" + marks 
				+ ", Age=" + age ;
	}
    
}
