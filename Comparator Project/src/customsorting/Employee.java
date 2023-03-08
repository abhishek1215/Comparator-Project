package customsorting;

public class Employee {
	String name;
	Double salary;  //Wrapper class Declaration
	public Employee(String name,Double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString()
	{
		return "Salary of "+name+" is "+salary+"LPA";
	}

}
