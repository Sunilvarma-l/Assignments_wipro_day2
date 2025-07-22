package basics;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		int maths;
		int physics;
		int chem;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your marks:");
		maths=sc.nextInt();
		
		System.out.println("you entered:"+ maths);
		
		physics=sc.nextInt();
		chem=sc.nextInt();
		int total=maths+ physics + chem;
		System.out.println(total);
		
		
	}

}
