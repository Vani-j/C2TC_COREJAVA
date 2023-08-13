
public class Identifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In Java, an identifier is a name used to identify a 
		//variable,
		//method, class, package
		//or other user-defined element.
		Person person = new Person();  
		// 'Person' is a class identifier
        person.name = "Vani";
        person.introduce();
	}
}
class Person
{
	String name;
	// 'name' is a variable identifier
	void introduce()
	{ 
	// 'introduce' is a method identifier
	System.out.println("My name is " + name);
	}
}