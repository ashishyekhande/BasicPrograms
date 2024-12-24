package BasicProgram;

import java.util.Scanner;


public class ProgrammClass {
	public static Scanner sc ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		Programs  p = new Programs();
		sc = new Scanner(System.in);
		System.out.println("Which programm you want?");
		System.out.println("1.swapingWithoutTemp");
		System.out.println("2.Reverse Number and Palindrome");
		System.out.println("3.String reverse and Plinmdrome");
		System.out.println("4.String reverse without chaning sequence");
		System.out.println("5.fibonacci");
		System.out.println("6.Prime Number");
		System.out.println("7.Armstriong Number");
		System.out.println("8.Duplicate_element_Array");
		System.out.println("9.Occurance_in_string");
		System.out.println("10.Sort arrey");
		System.out.println("11.Splits a given string into four parts: uppercase letters, lowercase letters, digits, and special characters. ");
		System.out.println("12.Maximum out of arrey");
		System.out.println("13.Reverse arrey ans sum of all elements" );
		System.out.println("14.count of element in array" );
		System.out.println("15.count occurance of element in array" );
		System.out.println("16.k-th lagestet element in array" );
		System.out.println("17.Print Only unique element in array" );
		System.out.println("18.Count vowels" );
		System.out.println("19.Count vowels hashmap" );
		
		System.out.println();
		i =sc.nextInt();

		switch (i) 
		{
			case 1: p.swapingWithoutTemp();
			break;
			case 2: p.ReverseNumber();
			break;
			case 3: p.ReverseString();
			break;
			case 4: p.ReverseStringwithoutChangesequence();
			break;
			case 5: p.fibonacii();
			break;
			case 6: p.primeNumber();
			break;
			case 7: p.armstrongNumber();
			break;
			case 8: p.Duplicate_element_Array();
			break;
			case 9: p.Occurance_in_string();
			break;
			case 10: p.SortArrey();
			break;
			case 11: p.SplitIntoUpperLowerDIgitSpecial();
			break;
			case 12: p.LargestOFArray();
			break;
			case 13: p.ReversArray();
			break;
			case 14: p.OccaranceInArray();
			break;
			case 15: p.countOccuranceInArray();
			break;
			case 16: p.kthLargest();
			break;
			case 17: p.OnlyUnique_in_Array();
			break;
			case 18: p.countVowels();
			break;
			case 19: p.countvowelsHashMap();
			break;
			
			
		default: System.out.println("Programm number not in above list");
			break;
		}
	}

}
