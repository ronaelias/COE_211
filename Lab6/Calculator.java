import java.util.Scanner;

public class Calculator {


    public Calculator() {
}

        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
	int num1 = scanCalc.nextInt();
	System.out.println("Enter the operator: ");
	String operator = scanCalc.nextLine();
	System.out.println("Enter the second number: ");
	int num2 = scanCalc.nextInt();


public String add(int num1,int num2){
return num1 + "+" + num2 + "=" + (num1+num2); }


public String substract(int num1,int num2){
return num1 + "-" + num2 + "=" + (num1-num2); }


public String multiply(int num1,int num2){
return num1 + "*" + num2 + "=" + (num1*num2); }


public String divide(int num1,int num2){
return num1 + "/" + num2 + "=" + (num1/num2); }
	
if(operator == "+") {
add(num1,num2);
}

if(operator == "-") {
substract(num1,num2); }

if(operator == "*") {
multiply(num1,num2); }

if(operator == "/") {
divide(num1,num2); }

}