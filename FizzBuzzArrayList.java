
import java.util.*;
public class FizzBuzzArrayList {
   
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> result=new ArrayList();
        String fizzBuzzList;
        
        for(int i=1;i<=A;i++){
            fizzBuzzList="";
            if(i%15==0){
                fizzBuzzList=fizzBuzzList+"FizzBuzz";
            }
             else if(i%3==0)
            {
                fizzBuzzList=fizzBuzzList+"Fizz";
                
            }
            else if(i%5==0)
            {
                fizzBuzzList=fizzBuzzList+"Buzz";
            }
           
            else
                fizzBuzzList=Integer.toString(i);
            result.add(fizzBuzzList);
            
            
        }
        return result;
        
        
    }
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int n=sc.nextInt();
    FizzBuzzArrayList f=new FizzBuzzArrayList();
    f.fizzBuzz(n);
    
    
    }
}















