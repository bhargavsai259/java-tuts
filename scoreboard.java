import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    
    int totalscore=0;
    int score;
	    
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter score to add up or -1 to stop");
	score=sc.nextInt();
	
	while(score!=-1 )
	{
	    totalscore+=score;
	    System.out.println("enter the score to add up or -1 to stop");
	    score=sc.nextInt();
	}
	
	    System.out.println("total score is "+totalscore);
	}
}
