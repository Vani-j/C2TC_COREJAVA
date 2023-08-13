public class DecrementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//post decrement
		int x = 8;
		int y = x--; 
		// y is assigned the value of x (8)
		//then x is decremented to 7
		System.out.println("x: " + x);  
		System.out.println("y: " + y);  
		
		//pre decrement
		int a = 15;
		int b = --a; 
		// a is decremented to 14
		//then b is assigned the value of a (14)

		System.out.println("a: " + a);  
		System.out.println("b: " + b); 

	}

}