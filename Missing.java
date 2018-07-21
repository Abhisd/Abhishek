class Missing
{
       static int missed(int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }
      
    /* program to test above function */
    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int miss = missed(a,5);
        System.out.println("missed number from array is "+miss);   
    }
}