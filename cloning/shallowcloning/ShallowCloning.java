package cloning.shallowcloning;

public class ShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student st1 = new Student();
		System.out.println("Actual Object Before cloning "+ st1.name);
		System.out.println("Actual Object Before cloning  empName"+ st1.emp1.empName);
		
		Student st2 = (Student) st1.clone();
		
		System.out.println("Cloned Object st2 before changing "+st2.name);
		System.out.println("Cloned Object st2 before changing empName "+st2.emp1.empName);
		
		System.out.println("Actual Object after cloning without any change in cloned object "+st1.name);
		
		st2.name = "AKS";
		st2.emp1.empName = "Arrow";
        System.out.println("Cloned Object st2   After changing name "+st2.name);
        System.out.println("Cloned Object st2 After changing empName "+st2.emp1.empName);
		
		System.out.println("Actual Object after cloning  with change in cloned object "+st1.name);
		System.out.println("Actual Object after cloning  with change in cloned object  empName "+st1.emp1.empName);
		
	}

}
