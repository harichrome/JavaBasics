
public class ArgLength {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 1; i < 3; i++) {
			System.out.println("i= "+i);
			
			  for(int j = 3; j > i; j--){
				  System.out.println("j= "+j);
			     assert i!=j;
		System.out.println("i= "+i +" "+"j= "+j);
		System.out.println("-----------");
			  }}*/
		
		int arr[][] = new int[5][5]; 
		int []arr1[] = new int[5][5]; 
		int[][] arr11 = new int[5][5]; 
		
		 int []a = {1,2,3,4,5,6};
		     int i = a.length - 1;
		     
		     while(i>=0){
		       System.out.print(a[i]);
		       i--;
		     } 
		     
		     int aa[] = { 1,2,3,4};
		     System.out.print(aa instanceof Object);
		     
		     
		     int a1[] = { 1,2,053,4};
		         int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
		         
		         System.out.print(a1[3]==b[0][2] );
		         System.out.print(a1[3]+" "+b[0][2] );
		         System.out.print(" " + (a1[2]==b[2][1]));
		         System.out.print(" " + (a1[3]+" "+b[2][1]));

	}

}
