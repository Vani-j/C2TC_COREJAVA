
public class LogicalOperator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isTrue = true, isFalse = false;

		boolean andResult = isTrue && isFalse; // Logical AND
		boolean orResult = isTrue || isFalse;  // Logical OR
		boolean notResult = !isTrue;           // Logical NOT

		System.out.println("andResult: " + andResult);
		System.out.println("orResult: " + orResult);
		System.out.println("notResult: " + notResult);


	}

}