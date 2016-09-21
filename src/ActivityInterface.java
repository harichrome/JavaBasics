
public class ActivityInterface implements Activity{

	
	public void run(){
		System.out.print("Run Method\n");
	};
	public void walk(){
		System.out.println("Walk Method");
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActivityInterface ai=new ActivityInterface();
		ai.run();
		ai.walk();		
	}

}
