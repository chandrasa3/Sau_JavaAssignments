package package6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilehandlingA1
{
	public void ReadData(int a)throws IOException
	{
		File f=new File("..//Project2/src/package5/Filehandling.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int linenumber=0;
		while((s=br.readLine())!=null)
		{
			linenumber=linenumber+1;
			if (linenumber==a)
			{
				System.out.println(s);
				break;
			}
		}
		
		
	}
	public static void main(String[] args) throws IOException
	{
		
		FilehandlingA1 fh=new FilehandlingA1();
		System.out.println("Enter the row number to read: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		fh.ReadData(a);
			
				
	}
}
