package student;

public class Student11 {
	
	//field / variable
	
	private int studentRollNo;
	private String studentName;
	private String studentAddress;
	private String studentMailId;
	private long studentContactNo;
	
// constructor
	
	public Student11()  // default/ no parameters
	
	{
	studentRollNo=21;
	 studentName = "Radha";
	 studentAddress = "pune";
	studentMailId = "radharaut@gmail.com";
	 studentContactNo = 8010707619L;
	}
	 
	 public Student11(int studentRollNo , String studentName, String studentAddress,
			 String studentMailId, long studentContactNo ) // Parameterized constructor
	 
	 { 
		 this.studentRollNo = studentRollNo;
			this.studentName = studentName;
			this.studentAddress = studentAddress;
			this.studentMailId = studentMailId;
			this.studentContactNo = studentContactNo;
	}
	 //method
	 public void displayStudentInformation() {
		 System.out.println(studentRollNo);
		 System.out.println(studentName);
		 System.out.println(studentAddress);
		 System.out.println(studentMailId);
		 System.out.println(studentContactNo);
	 }
}
