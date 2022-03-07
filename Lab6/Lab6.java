import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args){

	BasicWeek basic = new BasicWeek();

	System.out.println("Which service would you like to use?" + "\n" + "[1]: Basic week visualizer" + 
	"\n" + "[2]: Advanced week visualizer" + "\n" + "[3]: Basic calculator" + "\n" + "[4]: Employee repertoire");

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number of th service: ");
	int service = scan.nextInt();

	if(service == 1){
	basic.printDays(); 
	} 

	if(service == 2){
	printAdvancedDays(); 
	} 


	





	}
}