import java.util.Scanner;
class Prime
{
   public static void main(String args[])
   {		
	int temp;
	boolean flag=true;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number:");
	int num=sc.nextInt();
        sc.close();
	for(int i=2;i<=num/2;i++)
	{
         temp=num%i;
	   if(temp==0)
	   {
	      flag=false;
	      break;
	   }
	}
		if(flag)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}