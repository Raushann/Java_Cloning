package MarkerInterface;

public class StuImpl {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s=new Student(1);
		System.out.println(s.sid);
		
		Student s1=s.myclone();
		System.out.println(s1.sid);
		
		System.out.println(s==s1);
	}

}
