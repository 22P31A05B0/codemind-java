import java.util.Scanner;
public class Even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int z;
            z=Math.abs(a-b);
            if(z>=a||a==b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}    