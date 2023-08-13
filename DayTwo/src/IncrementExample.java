public class IncrementExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//post increment
		int x = 5;
		int y = x++;
		// y is assigned the value of x (5)
		//then x is incremented to 6
		System.out.println("x: " + x);  
		System.out.println("y: " + y); 
		
		
		//pre increment
		int a = 10;
		int b = ++a; 
		// a is incremented to 11, then b is assigned the value of a (11)

		System.out.println("a: " + a);  
		System.out.println("b: " + b);  
	}

}