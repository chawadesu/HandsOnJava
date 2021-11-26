import java.util.Scanner;
public class Studenttest 
{

	public static void main(String[] args) 
	{
	Student [] s = new Student[10];
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < s.length; i++)
	{
		s[i] = new Student();
		System.out.print(" Please input score, name, and surname");
		s[i].name = sc.nex tLine();
		s[i].surname = sc.nextLine();
		s[i].score = sc.nextInt();
		sc.nextLine();
	}
	Student max;
	max = s[0];
	for (int i=0; i < score.length;i++)
	{
		if ( max.score < s[i].score)
		{
			max = s[i];
		}
	}
	System.out.println(max.name + max.surname);

	}

}
