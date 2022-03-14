import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args){

	BasicWeek basic = new BasicWeek();
	AdvancedWeek advanced = new AdvancedWeek();
	Employee emp = new Employee();
	
	boolean execute = true;
	while(execute == true) {
	System.out.println("Which service would you like to use?" + "\n" + "[1]: Basic week visualizer" + 
	"\n" + "[2]: Advanced week visualizer" + "\n" + "[3]: Basic calculator" + "\n" + "[4]: Employee repertoire");

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number of the service: ");
	int service = scan.nextInt();

	if(service == 1){
	basic.printDays(); 
	} 

	else if(service == 2){
	advanced.printAdvancedDays(); 
	} 

	else if(service == 3){
	Calculator calc = new Calculator();
	}
	
	else if(service == 4){
	emp.information();}

     else{ 
	System.out.println("Please make sure you pick a number between 1 and 4");
	

	System.out.println("Which service would you like to use?" + "\n" + "[1]: Basic week visualizer" + 
	"\n" + "[2]: Advanced week visualizer" + "\n" + "[3]: Basic calculator" + "\n" + "[4]: Employee repertoire");

	Scanner scan1 = new Scanner(System.in);
	System.out.print("Enter the number of th service: ");
	service = scan1.nextInt();

	if(service == 1){
	basic.printDays(); 
	} 

	else if(service == 2){
	advanced.printAdvancedDays(); 
	} 

	else if(service == 3){
	Calculator calc = new Calculator();
	}
	
	else if(service == 4){
	emp.information();
	}
	 
	
	}
	


	 
		
	System.out.println("Would you like to perform another operation? (y/n)");
	Scanner scan2 = new Scanner(System.in);	
	char answer = scan2.next().charAt(0);
	if(answer == 'y'){
	execute = true; }
	 else{
	execute = false; }
	}



	
}
}