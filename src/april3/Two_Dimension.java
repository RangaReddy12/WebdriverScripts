package april3;

public class Two_Dimension {
//datatype variable[][]=new datatype[row size][column size];
	//String str[][] = {{"User1","Password1"},{"User2","Password2"},{"User3","Password3"}};
	public static void main(String[] args) {
	String str[][]=new String[3][2];	
str[0][0]="user1";
str[0][1]="test123";

str[1][0]="Admin";
str[1][1]="test";

str[2][0]="akhi";
str[2][1]="test1234";
for(int i=0;i<str.length;i++)
{
	for(int j=0;j<str[i].length;j++)
	{
	System.out.print("\t"+str[i][j]);	
	}
	System.out.println();
	
}
	}

}
