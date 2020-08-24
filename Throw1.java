class Throw1
{
	static void Check(int age,int marks)
	 {
		 if(age<12&&marks<40)
		 {
			 throw new ArithmeticException("Student is not Eligible");
		 }
		 else
		 {
			 System.out.println("Student Entry id Valid");
		 }
	 }
	 public static void main(String[] args) 
	 {
		 System.out.println("Welcome to ");
		 Check(15,49);
		 System.out.println("Have a Nice Day");
	 }
}