package com.coding;

public class SimplePrograms {
	
	public static void main(String args[])
	{
		String a="[%CompaniesintheIndexusingeachMetricGroupREVENUEEARNINGSEVACASHFLOWRETURNSTSRINDIVIDUALOTHER43%78%1%25%13%0%35%null%19%47%2%12%29%54%2%18%ShortTermIncentivesLongTermIncentives]";
		
		
		PalindromeCHeck("madams");
	}
	
	public static void removeChar(String name, String removeChar) {
		
		String rep=name.replace(removeChar, "");
		System.out.println(rep);
		
	}
	
	 public static void checkMinMax(int[] number)
	 {
		 for (int i = 0; i < number.length; i++)
		 {
			if(number[i]>=number[0])
			{
				number[0]=number[i];
			}
			
		}
		 System.out.println("Max: "+number[0]);
	 }
	
	static void PalindromeCHeck(String s) {
		
		String rev="";
		for (int i = s.length()-1; i >= 0; i--) {
			
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palin");
		}else {
			System.out.println("Not Palin");
		}
	}
	
		 static int n1=0,n2=1,n3=0;  
		
		 static void printFibo(int count)
	     {   
	        if(count>0){      
	             n3 = n1 + n2;      
	             n1 = n2;      
	             n2 = n3;      
	             System.out.print(" "+n3);     
	             printFibo(count-1);      
	         } 
	     }
	
	static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }    

	
	public static boolean compareString(String a, String b)
	{
		if(a==null || b==null)
		{
			return false;
		}
		
		if(a.length()!=b.length())
		{
			return false;
		}
		
		for (int i = 0; i < a.length(); i++) {
			
			if(a.charAt(i)!=b.charAt(i))
				return false;
		}
		
		return true;
		
	}
	
	public static void armstrong(int n)
	{
		int c=0,a,temp;
		temp=n;
		while(n>0)
		{
 			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("Arms Number");
		else
			System.out.println("Not Arms Number");
	}
	
	
	
	public static void rev() {
		
		String a="This is interview";
		String rep=a.replace(" ", "");
		System.out.println(rep.length());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
