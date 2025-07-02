package BasicProgram;

import org.testng.annotations.Test;

public class testprogram {

	
	@Test
	public void stringrev()
	{
		String revmain = "";
		String rev = "";
		String str ="My Name Is Bhagwan";
		
		String a[] = str.split(" ");
		
		for(int i =0 ; i<a.length;i++)
		{
			rev = a[i];
			for(int j=rev.length()-1;j>=0;j--)
			{
				revmain = revmain+rev.charAt(j);
			}
			revmain = revmain +" ";
		}
		System.out.println(revmain +" ");
		
	}
}
