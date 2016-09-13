import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Calculator ñalc = new Calculator();
	
		try {
		 System.out.println("number 1");
		 Scanner scan = new Scanner(System.in);
		 Integer s = scan.nextInt();
		 
		 System.out.println("number 2");
		 Integer s1 = scan.nextInt();
		 
		 System.out.println("1) + " + " 2) - " + "3) / " + "4) *"); 
		 Integer s2 = scan.nextInt();
		
		 switch(s2) {
			 case 1: System.out.println("== " + ñalc.plus(s, s1));
			 		break;
			 case 2: System.out.println("== " + ñalc.minus(s, s1));
			 		break;
			 case 3: System.out.println("== " + ñalc.divide(s, s1));
			 		break;
			 case 4: System.out.println("== " + ñalc.multiply(s, s1));
			 		break;
			 default:  System.out.println("Error 404");
		 }
		} catch (Exception e) { 
		 System.out.println("Ïğîèçîøëà îøèáêà"); 
		 }
		
	}

}
