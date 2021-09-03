import java.util.Scanner;

public class ex1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("hi");
			System.out.print("ilove: ");
			int str = scan.nextInt();
			if(str==0) break;	
		}
	}
}