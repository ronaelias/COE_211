import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) {

	String name;
	String purchase;
	double pay;
	String answer;
  
    try {
      	FileWriter fw = new FileWriter(new File("expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outToFile = new PrintWriter(bw);

	Scanner scan = new Scanner(System.in);

	do{
	System.out.print("Input your name: ");
	name = scan.nextLine();

	System.out.print("What did you purchase: ");
	purchase = scan.nextLine();

	System.out.print("How much did you pay? (in USD) ");
	pay = scan.nextDouble();	

	scan.nextLine();
	
	outToFile.println(name + " purchased " + purchase + " for " + pay + " US Dollars");
	outToFile.close();	
	
	System.out.print("Would you like to log another purchase? (y/n)");
	answer = scan.nextLine();


	} while(answer.equals("y"));
	if(answer.equals("n")){
		System.out.print("Get off of ZoodMall!");
		
		System.out.print("Would you like to read a summary of your purchases? (y/n) ");
		String ans = scan.nextLine();
		scan.close();
		
		if(ans.equals("y")){
			Scanner fileScan = new Scanner(new File("expenses.txt"));
			String url;
			url = fileScan.nextLine();
			System.out.println(url); 
			
		}
	}
        

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
	
  }
}