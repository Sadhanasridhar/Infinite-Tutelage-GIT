package demoprojects;
import java.util.Scanner;
public class WhileLoopDemo {

	public static void main(String[] args) {
		
		Scanner object= new Scanner(System.in);
		int var= object.nextInt();
		System.out.println("Enter the number");
		
		
		int i=1;
		while(i <=var)
		{
			if(i%2!=0)
			System.out.println(i);
			i++;
		}
	}
}
