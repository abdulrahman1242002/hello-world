import java.util.Scanner;
public class lect5
{
public static void main(String[]ar)
{
Scanner in= new Scanner (System.in);

double a= in.nextDouble();
double b= in.nextDouble();
double c= in.nextDouble();

if (a>=80 && a<=100)
{
System.out.println("Perfect");
}
 else if (b>=50 && b<80)
{
System.out.println("Normal");
}
else
{
 System.out.println("Bad");
}


}
}