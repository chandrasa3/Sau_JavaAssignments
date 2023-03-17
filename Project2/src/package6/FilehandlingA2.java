package package6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilehandlingA2
{
public void ReadDataofRange(int x, int y) throws IOException
{
File f=new File("..//Project2/src/package6/Filehandling.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String s;
int linenumber=0;
while((s=br.readLine())!=null)
{
	linenumber=linenumber+1;
	if ((linenumber>=x)&&(linenumber<=y))
	{
		System.out.println(s);
		//break;
	}
}


}
public static void main(String[] args) throws IOException
{

FilehandlingA2 fh=new FilehandlingA2();
System.out.println("Enter the first and last row number to read: ");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
fh.ReadDataofRange(x,y);


}
}
