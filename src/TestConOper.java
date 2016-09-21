
public class TestConOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Conditional Operator ( ? : )
		variable x = (expression) ? value if true : value if false
		 * This operator consists of three operands and is used to evaluate 
		 * Boolean expressions. The goal of the operator is to decide which 
		 * value should be assigned to the variable
		 * 		 * 
		 */

		int a, b;
	      a = 10;
	      b = (a == 1) ? 20: 10;
	      System.out.println( "Value of b is : " +  b );

	      b = (a == 10) ? 20: 30;
	      System.out.println( "Value of b is : " + b );
		
	}

}
