package BasicProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Programs extends ProgrammClass
{
	

	public void swapingWithoutTemp() {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		System.out.println();
		int n1= sc.nextInt();
		int n2= sc.nextInt();		
		
		n1= n1+n2;
		n2=n1-n2;
		n1=n1-n2;
				
		System.out.println("reverse numbers " + n1 +" ," +n2);
		
		
	}

	public void ReverseNumber() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		System.out.println();
		int n= sc.nextInt();
		int tochekPalindrome= n;
		int rev =0 ; int n1;
  		while(n>0) //356
		{
			n1=n%10;
			rev =rev*10+n1; 
			n= n/10;
			
		}
		System.out.println("Reverse Number "+rev);
		
		if(rev==tochekPalindrome)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
	
	public void ReverseString() {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		System.out.println();
		String s = sc.next();
		String checkpalindrome =s;
		String rev="";
		for(int i =s.length()-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);
		}
		
		System.out.println("Reverse String " +rev);
		
		if(rev.equalsIgnoreCase(checkpalindrome))
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
	
	public void ReverseStringwithoutChangesequence() {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		System.out.println();
		sc.nextLine();
		String s = sc.nextLine();
		String rev="";
		//System.out.println(s);
		for(int i=0 ;i<s.split(" ").length;i++)
		{    
			String n = s.split(" ")[i];
			
			for(int j=n.length()-1 ;j>=0;j--  )
			{
				rev =rev+n.charAt(j);
			}
			rev = rev+ " ";
			
			
		}
		System.out.println("Reveres string is ==> "+rev);
		
		
	}

	public void fibonacii() {
		// TODO Auto-generated method stub
		System.out.println("Till which no you want fibonciii");
		int n= sc.nextInt();
		int n1 =0, n2=1, n3;
		System.out.print("fibonacii " +n1 +" " +n2 );
	
		for(int i =2 ;i<=n ;i++)
		{
			n3= n1+n2;
			
			n1=n2;
			n2=n3;
			
			if(n3>n) // if value is more than enterd number then it will break
			{
				break;
			}
			System.out.print ("  "+n3);
		}
	
		
	}

	public void primeNumber() {
		// TODO Auto-generated method stub
	
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int count = 0 ;
		int i=1;
		
		while(n>=i)
		{
			if(n%i==0)
			{
				count++;
			}
			
			i++;
		}

		if(count==2)
		{
			System.out.println("Number is prime number");
		}
		else {
			System.out.println("Number is not prime");
		}
		
		
	}

	public void armstrongNumber() {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int tocheckaramstrong =n;
		int sum=0,d;
		while(n>0)
		{
			d = n%10;
			sum = sum +(d*d*d);
			n= n/10;			
		}
		
		if(tocheckaramstrong==sum)
		{
			System.out.println("Number is armstrong Number");
		}
		else
		{
			System.out.println("Number is not armstrong number");
		}
		
	}

	public void Duplicate_element_Array() 
	{
		int a[] =initializeArray();
		System.out.println();
		System.out.println("Duplicate number is ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i] +" " );
					break;
				}
				
			}
			
		}	
		
	}

	public void Occurance_in_string() {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		String input = sc.next();
		
		 int count = 1;   //aabbccc
		 for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == input.charAt(i-1)) {
	                count++;
	            } else {
	                System.out.print(count + "" + input.charAt(i - 1));
	                count = 1;
	            }
	        }
		 
		 // Print the last character sequence
		 System.out.print(count + "" + input.charAt(input.length() - 1));
	}

	public void SortArrey()
	{	
		int a[] =initializeArray();
		for(int i=0;i<a.length;i++)
		{
			int min =i;
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[j]<a[min])
				{
					min =j;
				}
				
			}
			
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
			
		}
		System.out.println();
		System.out.print("Sorted arrey is ");
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");	
		}
			
	}

	public void SplitIntoUpperLowerDIgitSpecial() {
		// TODO Auto-generated method stub
		
		StringBuilder upper = new StringBuilder();
		StringBuilder lower = new StringBuilder();
		StringBuilder digit = new StringBuilder();
		StringBuilder special = new StringBuilder();
		
		System.out.println("Enter the string");
		String str= sc.next();
		
		for(Character ch :str.toCharArray())
		{
			if(Character.isUpperCase(ch)){  
				upper.append(ch);
			}else if (Character.isLowerCase(ch)) {
				lower.append(ch);
			}else if (Character.isDigit(ch)) {
				digit.append(ch);
			}else {
				special.append(ch);
			}
			
		}
		System.out.println("Upper cases ==> " + upper);
		System.out.println("lower cases ==> " + lower);
		System.out.println("digit cases ==> " + digit);
		System.out.println("special cases ==> " + special);
		
		
		
		
		
	}

	public void LargestOFArray() {
		int a[] =initializeArray();
		int max =0 ;
		
		max =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
		}
		
		System.out.println();
		System.out.println(" max number is =>"+max );
		
	}

	public void ReversArray() {
		int a[] =initializeArray();
		System.out.print("reverser array is ==>");
	
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.print("  "+ a[i]);
		}
		
		int sum =0;
		System.out.println();
		System.out.print("Sum of all elements");
		for(int i=a.length-1; i>=0;i--)
		{
			sum =sum+a[i];
		}
		System.out.print( "==> " +sum);
	}

	public void OccaranceInArray() {
		// TODO Auto-generated method stub
		int a[]= initializeArray();
		System.out.println("which no. you want to count");
		int n = sc.nextInt();
		int count =0;
		for(int num :a)
		{
			if(num==n)
			{
				count++;
			}
		}
		System.out.println(" count of number "+n +" ==>"+count);
			
	}
	
	public void countOccuranceInArray()
	{
	
		 int a[]= initializeArray();
		 Arrays.sort(a);
		 System.out.println("Sorted array "+a);
	        boolean[] visited = new boolean[a.length];

	        System.out.println("Occurrences of each element in the array:");
	        for (int i = 0; i < a.length; i++) {
	            if (visited[i])
	            	{continue; // Skip already counted elements
	            	}
	            int count = 1;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    count++;
	                    visited[j] = true; // Mark as counted
	                }
	            }
	            System.out.println(a[i] + " -> " + count);
	        }
		
		
	}

	
	public void kthLargest()
	{
		int a[]= initializeArray();
		System.out.println("Which largest element you want");
        int k = sc.nextInt(); // K value

        // Sort the array
        Arrays.sort(a);

        // Find Kth smallest and largest
        int kthSmallest = a[k - 1];
        int kthLargest = a[a.length - k];

        // Print the results
        System.out.println("The " + k + "-th smallest element is: " + kthSmallest);
        System.out.println("The " + k + "-th largest element is: " + kthLargest);
	}
	
	
	public void OnlyUnique_in_Array()
	{
		int a []= initializeArray();
		System.out.print("Unique eleemnt in arry => ");
		for(int i =0;i<a.length;i++)
		{
			boolean isunique =true;
			for(int j=0;j<a.length;j++)
			{
				if(i != j && a[i]==a[j])
				{
					isunique = false;
					break;
				}
				
			}
			if(isunique)
			{
				System.out.print( a[i]+ " ");
			}
			
			
		}
				
		
	}
	
	
	public int[] initializeArray()
	{
		System.out.println("How big array you want");
		int n = sc.nextInt();
		System.out.println( "enter array");
		int a[]= new int[n];
		
		for(int i = 0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("array is        ==>");
		for(int i = 0;i<n;i++)
		{
			System.out.print("  "+ a[i]);
		}
		System.out.println();
		return a;
		
	}
	
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	    public  void countVowels() {
	       
	    	sc.nextLine(); // added to consuem e=leftover extra line when selecting nnumber
	    	System.out.println("Enter yourt text");
	    	String str =sc.nextLine();
	    	System.out.println(str);
	    	
	       int a = 0,e = 0,i = 0,o = 0,u = 0;
	        
	        for(int j=0;j<str.length();j++)
	        {
	        	char ch = str.charAt(j);
	            if(Character.toLowerCase(ch)=='a')
	            {
	                a++;
	            }
	            if(Character.toLowerCase(ch)=='e')
	            {
	                e++;
	            }if(Character.toLowerCase(ch)=='i')
	            {
	                i++;
	            }if(Character.toLowerCase(ch)=='o')
	            {
	                o++;
	            }
	            if(Character.toLowerCase(ch)=='u')
	            {
	                u++;
	            }
	            
	            
	            
	        }
	        
	        System.out.println("a =>"+a);
	        System.out.println("e =>"+e);
	        System.out.println("i =>"+i);
	        System.out.println("o =>"+o);
	        System.out.println("u =>"+u);
	    }
	
	public void countvowelsHashMap()
	{
		sc.nextLine();
		System.out.println("enter line");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		map.put('A', 0);
		map.put('E', 0);
		map.put('I', 0);
		map.put('O', 0);
		map.put('U', 0);
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			
		}
		
		for(char vc: map.keySet())
		{
			int count = map.get(vc);
			
			System.out.println(vc + ": " + count);
		}
		 
		
	}
	
	
}
