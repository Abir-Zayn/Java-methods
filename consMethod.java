package ConstructorsMethod;

/*
  *Point to study:
  In constructors method , the constructors name should be same as class name with no return type.
  	when creating the object of constructors class,call the methods within the constructor class,
  		it automatic will be printed constructors first then remain the methods that has called.
  *
*/

class customer{
	public customer() {
		System.out.println("Welcome to DarazBD.");
	}
	
	public void getName(String name) {
		System.out.println("Customer is "+name);
		System.out.println();
	}
}

public class consMethod {

	
	public static void main(String[] args) {
		customer custo=new customer();
		custo.getName("6674-2sasc");
		
		
		customer custo2=new customer();
		custo2.getName("666-cao2b1");
	}

}
