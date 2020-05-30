package april3;

public class Switch_Statement {

	public static void main(String[] args) {
		//check courses in qedge
String course="manual";
switch(course.toUpperCase())
{
case"MANUAL":
System.out.println("COurse is Avialiable::"+course);
break;
case"SELENIUM":
System.out.println("COurse is Avialiable::"+course);
break;
case"JAVA":
System.out.println("COurse is Avialiable::"+course);
break;
case"DATASCIENCE":
System.out.println("COurse is Avialiable::"+course);
break;
default:
	System.out.println("course is not found::"+course);
}
}
}
