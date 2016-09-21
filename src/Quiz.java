
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Quiz quiz=new Quiz();
		 double sqrt=quiz.SquareRoot(123.4);
		 System.out.println(sqrt);
		 double sqrt1=quiz.func(123);
		 System.out.println(sqrt1);
	
	
	
	
	
	
	}
	public double SquareRoot(double value) throws ArithmeticException {
		
		if (value>=0) return Math.sqrt(value);
		else throw new ArithmeticException();
	}
	public double func(int x){
		double y=(double) x;
		try{
			y=SquareRoot(y);
		}catch (ArithmeticException e){
			y=0;
		}
		finally{
			--y;
		}
		return y;
		
	}

}
