import java.util.ArrayList;
import java.util.List;

public class Employee15 {
   private String name;
   private String dept;
   private int salary;
   
   private List<Employee15> subordinates;

   // constructor
   public Employee15(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee15>();
   }

   public void add(Employee15 e) {
      subordinates.add(e);
   }

   public void remove(Employee15 e) {
      subordinates.remove(e);
   }

   public List<Employee15> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
   }   
}