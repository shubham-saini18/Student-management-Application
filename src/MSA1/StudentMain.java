package MSA1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		StudentRecord studentRecord = new StudentRecord();
		Scanner scanner = new Scanner(System.in);
		Integer choice;
		do {

			System.out.println("Press 1:Display All Student Data");
			System.out.println("Press 2:Display All Student Data in NameWise(Descending Order)");
			System.out.println("Press 3:Display Updated Student Data Based on RollNo.(Update Marks)");
			System.out.println("Press 4:Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println(studentRecord.toString());
				break;
			case 2:
				StudentRecord record = new StudentRecord();
				System.out.println("All Student Data in NameWise(Descending Order)");
				List<Student> list = studentRecord.getStudentList().stream()
						.sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
				record.setStudentList(list);
				System.out.println(record.toString());
				break;
			case 3:
				try {
					System.out.println("Enter the Student RollNo.=");
					int rollNo = scanner.nextInt();
					System.out.println("Enter the Marks=");
					Double marks = scanner.nextDouble();
					System.out.println("After Update:" + studentRecord.updateStudentMarks(rollNo, marks));
				} catch (StudentException exception) {
					System.out.println(exception.getMessage());
				}

			}

		} while (choice != 4);
	}

}
