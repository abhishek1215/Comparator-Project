package customsorting;

public class Student {
	int age;
	Student(int age)
	{
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "age:"+age;
	}
}
/*Rules:
 * ---------
 * 1.Create a new class which implements comparator interface & import from java.util package
 * 2.Specify Generics.
 * 3.Override compare().
 *       syntax:public int compare(Element e1,Element e2);
 * 4.Create an Object of the sorting logic class && pass it to the Constructor of TreeSet.      
 * 
 */
