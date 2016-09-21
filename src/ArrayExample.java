import java.util.Date;




public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] myList={1.5,2.6,3.5,4.2,6.2};
		
		for (int i=0;i< myList.length;i++)
			
		{
			System.out.println("Array Contents "+myList[i]+"\n");
			
		}
		double total=0;
		for (int i=0;i< myList.length;i++){
			total=total+myList[i];
			
		}
		System.out.println("Total = "+total);
		
		double max=myList[0];
		for (int i=1;i< myList.length;i++)
		{
			if (myList[i] > max) max=myList[i];
		}
		System.out.println("MAx is  "+ max);
		
		for (double title: myList) {
	         System.out.println(title);
	      }
		
		Date date=new Date();
		String str=String.format("current date: %tD",date);
		System.out.println(str);
	}

}
