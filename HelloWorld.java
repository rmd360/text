import java.util.*;
public class HelloWorld 
{
	public static void main(String args[])
	{
		System.out.println("enter name");
		Scanner in=new Scanner(System.in);
		String name;
		name=in.nextLine();
		System.out.println(name);
	}
}