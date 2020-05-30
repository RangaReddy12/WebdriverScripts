package april3;

public class Using_Object {
//object array: when ever we want store different types of data types of multiple values
	//Object variable[][]=new Object[rowsize][columnsize];
	//Object variable[][]={{},{}};
	public static void main(String[] args) {
		Object login[][]={{"admin",23000},{"akhi","Testing"},{"test",4000}};
		for(int i=0;i<login.length;i++)
		{
			for(int j=0;j<login[i].length;j++)
			{
				System.out.print("\t"+login[i][j]);
			}
			System.out.println();
		}

	}

}
