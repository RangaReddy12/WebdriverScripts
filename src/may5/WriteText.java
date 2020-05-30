package may5;

import java.io.*;

public class WriteText {

	public static void main(String[] args)throws Throwable {
		File f=new File("g://selenium.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("iam learning java");
		bw.newLine();
		bw.write("iam leaning selenium");
		bw.newLine();
		bw.write("iam learning testing tools");
		bw.flush();
		bw.close();

	}

}
