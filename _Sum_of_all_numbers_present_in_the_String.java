import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String s =sc.nextLine();
        for(int i=0; i<s.length(); i++) {
        char ch = s.charAt(i);
        if (Character.isDigit(ch)) {
        int b = Integer.parseInt(String.valueOf(ch));
        sum=sum+b;
        }
       }
       System.out.println(sum);
    }
}