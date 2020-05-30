package may5;

import java.io.*;

public class ReadData {

	public static void main(String[] args)throws Throwable {
		FileReader fr=new FileReader("G://selenium.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
br.close();
	}

}
