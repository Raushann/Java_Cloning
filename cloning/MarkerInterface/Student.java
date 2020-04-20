package MarkerInterface;

public class Student implements StuCloneable{
	int sid;
	Student(int sid)
	{
		this.sid=sid;
	}
	public Student myclone() throws CloneNotSupportedException
	{
		if (this instanceof StuCloneable) {
			return new Student(sid);
		}
		else
			throw new CloneNotSupportedException("Implement StuCloneable");
	}

}
