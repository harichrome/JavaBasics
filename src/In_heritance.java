
public class In_heritance extends Super_Class{


	int num=30;
	
	public void display(){
		System.out.println("Inside Sub Clas...s"+num);
	}
	

	public void my_method(){
		
		In_heritance sub=new In_heritance();
		sub.display();
		super.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		In_heritance obj=new In_heritance();
		obj.my_method();
		
	}

}
