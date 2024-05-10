package student;

public class Testclass1 {

	public static void main(String[] args) {
	
		Student11 student1 = new Student11();

		Student11 student2 = new Student11();

		student1.displayStudentInformation();
		
		System.out.println("---------------------------------------------------------------");

		student2.displayStudentInformation();

		System.out.println("------------parameterized constructor------------------------");
		
		Student11 student3 = new Student11(20, "Tushar", "Pune", "tp@gmail.com", 9090908989L);
		Student11 student4 = new Student11(21, "pratiksha", "Pune", "pk@gmail.com", 8090908989L);
		Student11 student5 = new Student11(22, "ishika", "Pune", "ip@gmail.com", 9099908989L);
		Student11 student6 = new Student11(22, "vyanki", "Pune", "vr@gmail.com", 9099908909L);
	
		student3.displayStudentInformation();
		System.out.println("--------------------------------------------------------------------------------");
		student4.displayStudentInformation();
		System.out.println("--------------------------------------------------------------------------------");
		student5.displayStudentInformation();
		System.out.println("--------------------------------------------------------------------------------");
		student6.displayStudentInformation();
		
		


	}

}
