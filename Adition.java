//ADDITION OF n NUMBERS

import java.util.Scanner;

public class Main

{
  
   
     public static void main(String []args)

     {
    
	     Scanner sc=new Scanner(System.in);

      	     System.out.println("ENTER THE NUMBER");

       	     int n =sc.nextInt();

             int sum=0;
    
             sum=n*(n+1)/2;
      
             System.out.println("ADDITION OF THE n NUMBERS  :"+sum);

             sc.close();
 
    }

}