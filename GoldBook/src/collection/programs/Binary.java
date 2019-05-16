package collection.programs;

public class Binary 
{
public void tobinary(int n1 ,int n2)
{
int count1=0;
int count2=0;
	 while(n1 > 0 )
     {
        int  a = n1 % 2;
         if(a == 1)
         {
             count1++;
         }
         System.out.println("first number n1: "+count1);
     }
	 while(n2>0)
	 {
		 int  b = n2 % 2;
         if(b == 1)
         {
             count1++;
         }
         System.out.println("second number n2: "+count2);
	 }
}
	public static void main(String[] args)
	{
		
		

	}

}
