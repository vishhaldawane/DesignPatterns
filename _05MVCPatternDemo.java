
public class _05MVCPatternDemo {
	
	  private static Student retriveStudentFromDatabase()
	  {
		 //simulate jdbc select * from student where rollno=101
		  
		  //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		  //Connection conn  = DriverManager.getConnection("jdbc:oracle:thin:@ipaddress:port:XE","scott","tiger");
		  //Statement st = conn.createStatement();
		  //ResultSet rs = st.executeQuery("select * from student where rollno=101");
		  //Student temp = new Student();
		   // temp.setRollNo(rs.getInt(1));
		  // temp.setName(rs.getString(2));
		  //return temp;
		  
		Student temp = new Student(101, "Jim");
		return temp;
		
	  }
	  
	  public static void main(String[] args) 
	  {
		  
		
		  
		  Student model = retriveStudentFromDatabase(); //studDao.getStudent(101);
		  
		  StudentView view = new StudentView();
		  
		  StudentController controller = new StudentController(model, view);
		  
		  controller.updateView();
		  
		  controller.setStudentRollNumber(102);
		  controller.setStudentName("Jam");
		  
		  controller.updateView();
		
	  }
}
