import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Enter 1 for multiply.");
		System.out.println("Enter 2 for addition");
		System.out.println("Enter 3 for substract");
		System.out.println("Enter 4 for divide");
		
		
		System.out.print("Enter operator you want to use: ");
		String UserInput = scanner.next(); 
		
			switch(UserInput) {
				case "1": {
					System.out.print("Enter first number: ");
					int numberOne = scanner.nextInt();
					
					System.out.print("Enter second number: ");
					int numberTwo = scanner.nextInt();
					
					int multiply = numberOne * numberTwo;
					
					System.out.println("The result is " + multiply);
					break;
				}
					case "2": {
						System.out.print("Enter first number: ");
						int numberOne = scanner.nextInt();
						
						System.out.print("Enter second number: ");
						int numberTwo = scanner.nextInt();
						
						int Addition = numberOne + numberTwo;
						
						System.out.println("The result is " + Addition);
						break;
					}
						case "3": {
							System.out.print("Enter first number: ");
							int numberOne = scanner.nextInt();
							
							System.out.print("Enter second number: ");
							int numberTwo = scanner.nextInt();
							
							int Substract = numberOne - numberTwo;
							
							System.out.println("The result is " + Substract);
							break;
						}
							case "4": {
								System.out.print("Enter first number: ");
								int numberOne = scanner.nextInt();
								
								System.out.print("Enter second number: ");
								int numberTwo = scanner.nextInt();
								
								int Divide = numberOne / numberTwo;
								
								System.out.println("The result is " + Divide);
							}
				
				
			}
		
	}

}
