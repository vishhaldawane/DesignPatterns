
public class StudentController {
	
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setStudentRollNumber(int roll) { //controller's function
		System.out.println("setting the roll..");
		model.setRollNo(roll);
	}
	public int getStudentRollNumber() {
		return model.getRollNo();
	}

	
	public void setStudentName(String name) {
		System.out.println("setting the name..");
		model.setName(name);
	}
	public String getStudentName() {
		return model.getName();
	}
	public void updateView()
	{
		view.printStudentDetails(model);
	}
}
