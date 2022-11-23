
public class Student //extends Person //POJO - plain old java object
{
	int rollNo;
	String name;
	//Address add;
	
	
	public Student(int rollNo, String name) {
		super();
		System.out.println("Student(int,String)");
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
