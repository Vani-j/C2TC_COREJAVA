import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=sc.next();
		System.out.println("Enter your Income:");
		int income=sc.nextInt();
		System.out.println("Enter your Gender:");
		String gender=sc.next();
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		
		
		Person p = new Person();
		p.setName(name);
		p.setIncome(income);
		p.setGender(gender);
		p.setAge(age);
		
		System.out.println("Before tax calculation:");
		System.out.println(p);
		
		
		
		TaxCalculation calc=new TaxCalculation();
        calc.TaxCalculation(p);
        System.out.println("Tax after calculation: $" + p.getTax()); 
		
	}

	
}
