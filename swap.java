import java.util.Scanner;
class first
{
   public static void main(String args[])
   {
    //hello sai this is sandeep
     Scanner s=new Scanner(System.in);
     System.out.println("enter any two numbers : ");
    int b1=s.nextInt(),b2=s.nextInt(),b3=0;
    System.out.println("Before Swap");
    System.out.println("b1 is "+b1);
    System.out.println("b2 is "+b2);
    b2=b1+b2;
    b1=b2-b1;
    b2=b2-b1;
    System.out.println("After Swap");
    System.out.println("b1 is "+b1);
    System.out.println("b2 is "+b2);

   }
}