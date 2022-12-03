import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your choice");
        System.out.println("1.ADD||2.SUBTRACT||3.MULTIPLY||4.DIVISION");
        int choice =sc.nextInt();
        
        System.out.println("Enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(choice==1)
        {
            System.out.println(add(a,b));
        }
        else if(choice==2)
        {
            System.out.println(subtract(a,b));
        }
        else if(choice==3)
        {
            System.out.println(multiply(a,b));
        }
        else if(choice==4)
        {
            System.out.println(division(a,b));
        }
        
        
        
    }
    
    public static int add(int a,int b)
    {
        System.out.println("Addition is ");
        return a+b ;
    }
    
    public static int subtract(int a,int b)
    {
        System.out.println("Subtraction is");
        return a-b;
    }
    
    public static int multiply(int a,int b)
    {
        System.out.println("multiplication is");
        return a*b;
    }
    
    public static float division(int a ,int b)
    {
        System.out.println("Division is ");
        return a/b;
    }
    
}
