package may7;

public class Demo {
public static void division(double x,double y)
{
double z=x/y;
System.out.println(z);
}
public static String verifyString(String str1,String str2)
{
	String res="";
	if(str1.equals(str2))
	{
		res="Strings are equal";
	}
	else
	{
		res="Strings are not eqaul";
	}
	return res;
	
}
	public static void main(String[] args) {
		Demo.division(654, 78);
String result=Demo.verifyString("Hello", "Hello");
System.out.println(result);
	}

}
