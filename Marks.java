//4. Take a grade character (A, B, C, D, F) as input and print a message:

//A = Excellent
//B = Good
//C =  Average
//D = Poor
//F = Fail

public class Marks {
	public static void main(String[] args) {
		char grade ='D';
		switch(grade) {
		
		case 'A' :
			System.out.println("Marks : 90 - 100, Grade : A"); 
			break;
			
		case 'B' :
			System.out.println("Marks : 80 - 89, Grade : B"); 
			break;
			
		case 'C' :
			System.out.println("Marks : 70 - 79 , Grade : C"); 
			break;
			
		case 'D':
			System.out.println("Marks : 60 - 69, Grade : D"); 
			break;
			
		case 'E' :
			System.out.println("Marks : 0 - 59, Grade : E"); 
			break;
			
			default:
			 System.out.println("Invaid Input");
			
		
		
		
	}

}
}