package customsorting;

import java.util.Comparator;

public class SortingOnAge implements Comparator<Student>{
	@Override
	public int compare(Student x,Student y)
	{
		return x.age-y.age;
	}

}
/*   X -> Object to be inserted.
 *   Y -> Already Existing Object.
 */
