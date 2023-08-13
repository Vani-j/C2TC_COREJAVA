public class TypeCasting {
	//Java is the process of converting a
	//value of one data type into another data type.
	 public static void main(String[] args) {
	        int intValue = 500;
	        long longValue = intValue; 
	        // Implicit casting from int to long
	        
	        System.out.println("intValue: " + intValue);
	        System.out.println("longValue: " + longValue);

	        double doubleValue = 3.14159;
	        int intvalue = (int) doubleValue;
	        // Explicit casting from double to int
	                
	        System.out.println("doubleValue: " + doubleValue);
	        System.out.println("intValue: " + intvalue);
	         }
}

