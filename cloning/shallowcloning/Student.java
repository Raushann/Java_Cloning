package cloning.shallowcloning;

public class Student implements Cloneable {
	int a=10;
	String name="RKS"; // it is immutable class that's why
					// when you assign new value it will take different memory
	long mobNo = 7726996566L;
	Employee emp1 = new Employee(); //this object can't be cloned as it is not Cloneable
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
