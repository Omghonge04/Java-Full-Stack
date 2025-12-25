// Accept two numbers and an operator (+, -, *, /) from the user and perform the operation using a switch case.
public class Calc{
	public static void main(String[] args) {
		
		
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        char op = args[2].charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid operator");
	
	
	
	
	
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

