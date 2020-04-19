package cloning.deepcloning;

public class DeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(10, "Rahul");
		Student st1 = new Student(20, "Ram", emp1);
		
		System.out.println("Actual Object Before cloning sName "+ st1.name);
		System.out.println("Actual Object Before cloning  empName "+ st1.emp1.empName);
		System.out.println("-------------------------------------");
		
		Student st2 = (Student) st1.clone();
		
		System.out.println("Cloned Object st2 before changing sname  "+st2.name);
		System.out.println("Cloned Object st2 before changing empName "+st2.emp1.empName);
		System.out.println("-------------------------------------");
		
		
		st2.name = "AKS";
		st2.emp1.empName = "Arrow";
        System.out.println("Cloned Object st2   After changing sname "+st2.name);
        System.out.println("Cloned Object st2 After changing empName "+st2.emp1.empName);
        System.out.println("-------------------------------------");
		
		System.out.println("Actual Object after cloning  with change in cloned object sname "+st1.name);
		System.out.println("Actual Object after cloning  with change in cloned object  empName "+st1.emp1.empName);
		
	}

}
