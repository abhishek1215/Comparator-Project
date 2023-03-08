package customsorting;

import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) 
	{

		TreeSet<Student> t1 =new TreeSet<Student>(new SortingOnAge());
		t1.add(new Student(40));
		t1.add(new Student(30));
		t1.add(new Student(10));

		for(Student i:t1)
		{
			System.out.println(i);
		}



	}

}
