package Instatnce;



/*
 * Points to study:
 *  If there is no static in secondary class then its known as instanceMethod.
	 In static method ,we don't have to create an object to call but in the case of 
	 	instance we have to call the object and call the other class method. 
	 
 */
class information{
	
	public void student(String name) {
		System.out.println("name is "+name);
	}
	
	public void studentRes(double cgpa) {
		System.out.println("Result is "+cgpa);
	}
}




public class InstanceMethod {

	
	public static void main(String[] args) {
		information in=new information();
		in.student("Abir");
		in.studentRes(4.5);
		
		in.student("maria");
		in.studentRes(2.6);
	}

}
