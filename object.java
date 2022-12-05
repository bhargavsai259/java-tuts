public class Main{
     static int h;
    public static void main(String args[])
    {
        Main obj = new Main();
        h=obj.add(2,8);
        System.out.println(h);
    }
    
    public int add(int a,int b)
    {
        return a+b;
    }
}
