package customsorting;

import java.util.*;

public class MainSolution {

	public static void main(String[] args) {
		Employee e1=new Employee("D",20.0);
		Employee e2=new Employee("A",30.0);
		Employee e3=new Employee("B",10.8);
		
		Map<Integer,Employee>m1=new LinkedHashMap<Integer,Employee>();
		m1.put(3, e1);
		m1.put(1, e2);
		m1.put(4, e3);
		
		Set<Integer>k=m1.keySet();
		ArrayList<Employee>l1=new ArrayList<Employee>();
		for(int key:k)
		{
			l1.add(m1.get(key));
			System.out.println(m1.get(key));
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1:Sort By name\n:Sort By Salary");
		System.out.println("Enter choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1: Collections.sort(l1,new SortEmployeeOnName());
		for(Employee e:l1)
		{
			System.out.println(e);
		}
		break;
		
		case 2:Collections.sort(l1,new SortEmployeeOnSalary());
		for(Employee e:l1)
		{
			System.out.println(e);
		}
		break;
		default: System.out.println("Invalid choice");
		}
	

	}

}
