import java.util.Scanner;

public class Calculator {


    public Calculator() {


        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
	int num1 = scanCalc.nextInt();
	System.out.println("Enter the operator: ");
	char operator = scanCalc.next().charAt(0);
	System.out.println("Enter the second number: ");
	int num2 = scanCalc.nextInt();



	
if(operator == '+') {
//add(num1,num2);
System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
}

if(operator == '-') {
//substract(num1,num2);
System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
}

if(operator == '*') {
//multiply(num1,num2); 
System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
}

if(operator == '/') {
//divide(num1,num2); 
System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
}
}
}

