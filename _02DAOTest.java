import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class _02DAOTest 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Jack");
		Student s2 = new Student(2,"Jane");
		Student s3 = new Student(3,"Jill");
		Student s4 = new Student(4,"Jim");
		Student s5 = new Student(5,"Jam");
		
				
		StudentDAO stuDAO = new StudentDAOImpl();
		stuDAO.createStudent(s1); //hiding the add(); / insert query is hidden
		stuDAO.createStudent(s2);
		stuDAO.createStudent(s3);
		stuDAO.createStudent(s4);
		stuDAO.createStudent(s5);
		
		System.out.println("------------getAllStudents()---");
		List<Student> list1 = stuDAO.getAllStudents();
		for (Student s : list1) {
			System.out.println("s "+s);
		}
		
		System.out.println("----readStudent(2)-----");
		Student x = stuDAO.readStudent(2);
		System.out.println("x "+x);
		
		System.out.println("--------updateStudent(Student x)-----");
		Student y = new Student(4,"Jimmy");
		stuDAO.updateStudent(y);
		
		System.out.println("------------getAllStudents()---");
		List<Student> list2 = stuDAO.getAllStudents();
		for (Student s : list2) {
			System.out.println("s "+s);
		}
		
		System.out.println("--------deleteStudent(Student x)-----");
		Student z = new Student(5,"Jam");
		stuDAO.deleteStudent(z);
		
		System.out.println("------------getAllStudents()---");
		List<Student> list3 = stuDAO.getAllStudents();
		for (Student s : list3) {
			System.out.println("s "+s);
		}
		
	}
}	


//DAO interface
interface StudentDAO //POJI - plain old java interface - based on POJO
{
	List<Student>    getAllStudents(); //RA
	
	void     createStudent(Student x); //C
	Student  readStudent(int r);	   //R
	boolean  updateStudent(Student x); //U
	boolean  deleteStudent(Student x); //D
}








//DAO interface implementation

class StudentDAOImpl /* extends BaseDAO */ implements StudentDAO
{
	
	List<Student> studentList = new ArrayList<Student>();
	
	
	public List<Student> getAllStudents() {
	
		//simulation of select * from student 
		// and push these records into studentList
		// and then return it
		return studentList;
	}

	
	public void createStudent(Student x) 
	{
		System.out.println("createStudent(Student x)....");
		studentList.add(x); // simulate the jdbc code here for the insert query
	}

	
	public Student readStudent(int r) {
		//select * from student where rollno=r
		System.out.println("Student readStudent(int)....");
	
		/*for (Student student : studentList) {
			if(student.getRollNo() == r)
		}*/
		
		boolean studentFound = false;
		Student temp = null;
		
		Iterator<Student> studentIter = studentList.iterator();
		
		while(studentIter.hasNext())
		{
			temp = studentIter.next();
			
			if(temp.getRollNo() == r) {
				studentFound=true;
				break;
			}
		}
		
		if(studentFound==false)
			return null;
		
		return temp;
	}

	
	public boolean updateStudent(Student x) {
		
		//update student set rollno=x.getRollNo(), name=x.getName() where rollno=x.getRollno();
		
		System.out.println("updateStudent(Student x)...");
		
		boolean studentFound = false;
		Student temp = null;
		
		Iterator<Student> studentIter = studentList.iterator();
		
		while(studentIter.hasNext())
		{
			temp = studentIter.next();
			
			if(temp.getRollNo() == x.getRollNo()) 
			{
				studentFound=true;
				temp.setName(x.getName());
				break;
			}
		}
		
		if(studentFound==false)
			return studentFound;
		
		return studentFound;
		
	}

	
	public boolean deleteStudent(Student x) {
		//delete student where rollno=x.getRollNo();
		System.out.println("deleteStudent(Student x)...");
		
		boolean studentFound = false;
		Student temp = null;
		
		Iterator<Student> studentIter = studentList.iterator();
		
		while(studentIter.hasNext())
		{
			temp = studentIter.next();
			
			if(temp.getRollNo() == x.getRollNo()) 
			{
				studentFound=true;
				studentIter.remove();
				break;
			}
		}
		
		if(studentFound==false)
			return studentFound;
		
		return studentFound;
	}
	
}