import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String answer;
        do{
            System.out.println("enter numbers of cups");
            int n=sc.nextInt();
            
            System.out.println("enter price");
            double d=sc.nextDouble();
            
            double ans=n*d;
            
            System.out.println("the amount id"+ans);
            
            System.out.println("Do you want another time ..enter YES // NO");
            
            answer = sc.next();
            
            
        }
        while(answer.equals("YES"));
    }
}
