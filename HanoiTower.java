import java.util.Scanner;

public class HanoiTower 
{
	public static String moveDisk(int n, int StartRod, int EndRod)
	{
		if ( n == 1)
		{
			return StartRod + " to " + EndRod ;
		}
		else
		{
			String Step1, Step2, Step3;
			int RestRod = 6 - StartRod - EndRod;
			
			Step1 = moveDisk(n-1, StartRod, RestRod);
			Step2 = StartRod + " to " + EndRod;
			Step3 = moveDisk(n-1, RestRod, EndRod);
			
			return Step1 + "\n" + Step2 + "\n" + Step3 ;
		}
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Please input number of disk: ");
		int n = sc.nextInt();
		
		String Steps = moveDisk(n, 1, 3);
		System.out.println(Steps);
		System.out.println("A stack of " + n + " disks requires " + (int)(Math.pow(2, n)-1) + " moves");
		
	}
	
}
