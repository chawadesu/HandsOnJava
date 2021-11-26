import java.util.Scanner;

public class IsFat {

	public static void main(String[] args) 
	{
		double weight, height, BMI;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please input your weight (kg) :");
		weight = sc.nextDouble();
		
		//System.out.println("Please input your height (cm) :");
		height = sc.nextDouble();
		height = height / 100;
		
		BMI = weight / (height*height);
		if (BMI < 20)
		{
			System.out.println("Thin");
		}
		else
		{
			if (BMI > 25)
			{
				System.out.println("Fat");
			}
			else
			{
				System.out.println("Normal");
			}
		}
		sc.close();
	
	}

}
