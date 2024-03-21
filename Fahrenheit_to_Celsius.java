import java.util.Scanner;
public class Celsius
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        double c=0.5555555556*(f-32);
        System.out.printf("%.2f",c);
    }
}