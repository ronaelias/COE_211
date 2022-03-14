import java.util.Scanner;
	public class Employee {
		public void information() {


	Scanner scan = new Scanner(System.in);
	System.out.println("Please input employee first name: ");
	String firstN = scan.nextLine();

	System.out.println("Please input employee last name: ");
	String lastN = scan.nextLine();

	System.out.println("Please input employee age: ");
	int age = scan.nextInt();


	System.out.println("Please input employee salary: ");
	double salary = scan.nextDouble();

	System.out.println("Employee information: "+ firstN  + ", " + lastN + ", " + age + ", " + salary);

	}
}