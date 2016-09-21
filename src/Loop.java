
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		while(x < 20){
			System.out.println("Checking While Loop...."+x);
			x++;
			if (x==15){
					break;
			}	}
		System.out.println("..............");	
		for(int y=0;y < 20;y++){
			
						
			if (y == 15){
				
				continue;
			}
			System.out.println("Checking For Loop...."+y);
				
			
		}
		System.out.println("Outside For Loop....");	
	}

}
