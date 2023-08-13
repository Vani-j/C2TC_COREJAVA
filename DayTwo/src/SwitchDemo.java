public class SwitchDemo 
{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			char x='a';
			switch(x) {
				case 'l':
				case 'L':
					System.out.println("x is a letter");
					break;
				case 'b':
				case 'B':
					System.out.println("y is a letter");
					break;
					
				default:
					System.out.println("Not a letter");
			}
		}

}
