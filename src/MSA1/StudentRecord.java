package MSA1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRecord 
{
	private List<Student> studentList;

	public StudentRecord() 
	{
		studentList = new ArrayList<>();
		studentList.add(new Student(201, "Jennie Pouisher", 90.9, 16));
		studentList.add(new Student(202, "Poonam Jeph", 79.00, 17));
		studentList.add(new Student(203, "Nikita Sai", 90.89, 15));
		studentList.add(new Student(204, "Himanshu Singh", 99.99, 18));
		studentList.add(new Student(205, "Sourabh Kumar", 91.56, 16));
		studentList.add(new Student(206, "Rabin Sharma", 97.69, 14));
		studentList.add(new Student(207, "Robin Singh", 72.5, 16));
		studentList.add(new Student(208, "Tim Carter", 55.55, 20));
		studentList.add(new Student(209, "Ankita Mehta", 98.67, 16));
		studentList.add(new Student(210, "Ritika Mahajan", 85.69, 16));
	}

	public Student updateStudentMarks(Integer rollNo, Double marks) throws StudentException 
	{
		List<Student> list = studentList.stream().filter(e -> e.getRollNo() == rollNo).collect(Collectors.toList());
		if (list.size() < 1 || list.isEmpty()) 
		{
			throw new StudentException("invalid user ID");
		}
		Student student = list.get(0);
		student.setMarks(marks);
		studentList.remove(student);
		return student;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "StudentRecord " + studentList;
	}
}
