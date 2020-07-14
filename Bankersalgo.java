import java.io.*;
import java.util.*;
public class Bankersalgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of proccess and resources");
		int no_prcs=sc.nextInt();
		int no_resrc=sc.nextInt();
		int available[]=new int[no_resrc];
		int maximum[][]=new int[no_prcs][no_resrc];
		int allocated[][]=new int[no_prcs][no_resrc];
		int needed[][]=new int[no_prcs][no_resrc];
		int request[]=new int[no_resrc];
		int i=0,j=0,k=0,l=0;
		System.out.println("enter the maximum instances of resources and process ");
		for( i=0;i<no_prcs;i++)
		{
			for( j=0;j<no_resrc;j++)
			{
				maximum[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the allocated instances of resources and process ");
		for( i=0;i<no_prcs;i++)
		{
			for( j=0;j<no_resrc;j++)
			
			{
				allocated[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the available instances of resources  ");
		for( i=0;i<no_resrc;i++)
		{
			available[i]=sc.nextInt();
		}
		
		System.out.println("remaining resources needs of each process ");
		for( i=0;i<no_prcs;i++)
		{
			for( j=0;j<no_resrc;j++)
			{
				needed[i][j]=maximum[i][j]-allocated[i][j];
				//System.out.println("\t"+needed[i][j]);
				
			}
		}
		
		for( i=0;i<no_prcs;i++)
		{
			for( j=0;j<no_resrc;j++)
			{
				
				System.out.print("\t"+needed[i][j]+"\n");
				
			}
		}
		
		
		int temp[]= new int[j];
		//int flag=0;
		for( k=0;k<j;k++)
		{	
			temp[k]=0;
			for( l=0;l<i;l++)
			{	
				temp[k]= temp[k] + allocated[l][k];
			}
		}
		
		for(i=0;i<no_resrc;i++)
		{
			request[i]=available[i]-temp[i];
		}
		
		System.out.println("instances of resources :");
		for(i=0;i<no_resrc;i++)
		{
			System.out.print(request[i]);
		}
		
	}

}
