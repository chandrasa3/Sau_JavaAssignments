package package5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling
{
 public static void main(String[] args) throws IOException
 {
	File f=new File("..//Project2/src/package5/Filehandling.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String s;
	while ((s=br.readLine())!=null)
	{
		System.out.println(s);
	}
	//fr.close();
 
}
}
