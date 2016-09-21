
public class Employee {

	String name;
	int age;
	private String designation;
	double salary;
	
	public Employee(String fname) {
		this.name=fname;
	}
	
	public void empAge(int eage) {
		age=eage;
	}
	
	public void empDesg(String desg){
		
		designation=desg;
	}
	
	public void printEmp() {
		
		System.out.println("Name...."+ name);
		System.out.println("Age....."+ age);
		System.out.println("Designation..."+ designation);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Java App");
		Employee emp1=new Employee("Sunil");
		
		emp1.empAge(40);
		emp1.empDesg("SW engineer");
		emp1.printEmp();
		
	}

}
