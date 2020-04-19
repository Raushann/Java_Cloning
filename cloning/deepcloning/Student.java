package cloning.deepcloning;

public class Student implements Cloneable {
	int stId;
	String name; 
	Employee emp1; 
	public Student(int stId, String name, Employee emp1) {
		this.stId =stId;
		this.name = name;
		this.emp1 = emp1;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		if(this instanceof Cloneable) {
			Employee emp = new Employee(this.emp1.empId, this.emp1.empName);
			Student st = new Student(this.stId, this.name, emp);
			return st;
		} else {
			throw new CloneNotSupportedException("clone not supported");
		}
	}
}
