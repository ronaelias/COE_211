import java.util.Scanner;
public class EntryPoint {
	public static void main(String[] args){
		
Scanner scan = new Scanner(System.in);
System.out.println("Please input the employee's first name: ");
String fName = scan.nextLine();

System.out.println("Please input the employee's last name: ");
String lName = scan.nextLine();

System.out.println("Please input the employee's age: ");
int age = scan.nextInt();

System.out.println("Please input the employee's monthly salary: ");
double monthlySalary = scan.nextDouble();

Employee emp = new Employee(fName, lName, age, monthlySalary);
System.out.println("Employee information: " + emp.FirstName + " " + emp.LastName + ", " + emp.Age + ", " + emp.MonthlySalary);
		
	}
}