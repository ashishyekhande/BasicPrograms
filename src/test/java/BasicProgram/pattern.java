package BasicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pattern {

	//@Test
	public void patterntest()
	{
		int n = 4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	@Test
	public void stringpattern()
	{
		String str = "ashish";
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
}
