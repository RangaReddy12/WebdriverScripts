package april3;

public class Single_Dimension {
//data type variable[]=new datatype[array size]
	// int a[] = {10,12,48,17,5,49};
	//for each: when ever we want to get collection of values from array variable
	/*for(datatype variable:arrayname)
	{
		statement
	}*/
	public static void main(String[] args) {
		int x[]=new int[5];
		x[0]=100;
		x[1]=300;
		x[2]=400;
		x[3]=500;
		x[4]=600;
		System.out.println(x[4]);
	for(int each:x)	
	{
	System.out.println(each);	
	}

	}

}
