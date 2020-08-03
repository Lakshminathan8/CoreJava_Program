import java.util.Scanner;


public class if_else_switch {
	public int its_my_birth_month(String month)
	{
//Always use equals operator to compare string, == does not work with strings
	if(month.equals("Jan"))
	{
		System.out.println(month + " is my birth month " + "\"nidhi\"");
		return 1;
	}
	else
	{
		System.out.println("Not my birth month");
		return 0;
	}
	}

	public void switch_example(){
		Scanner month = new Scanner(System.in);
		System.out.println("enter a month like Jan/Feb etc");
		String month_str = month.nextLine();
		System.out.println("month given is " + month_str);
		switch(its_my_birth_month(month_str))
		{
		case 0:
			System.out.println("In case 0 as its not my birth month, feed another month");
			break;
		case 1:
			System.out.println("Yay its my birth month");
			break;
		}
	}
	public static void main(String[] args) {
		if_else_switch obj1 = new if_else_switch();
		obj1.switch_example();
		// TODO Auto-generated method stub

	}

}
