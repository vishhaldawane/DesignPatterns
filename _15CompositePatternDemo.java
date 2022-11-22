public class _15CompositePatternDemo {
   public static void main(String[] args) {
   
      Employee15 CEO = new Employee15("John","CEO", 30000);

      Employee15 headSales = new Employee15("Robert","Head Sales", 20000);
      
      Employee15 salesExecutive1 = new Employee15("Richard","Sales", 10000);
      Employee15 salesExecutive2 = new Employee15("Rob","Sales", 10000);

      
      Employee15 headMarketing = new Employee15("Michel","Head Marketing", 20000);
     
      Employee15 clerk1 = new Employee15("Laura","Marketing", 10000);
      Employee15 clerk2 = new Employee15("Bob","Marketing", 10000);

     
      CEO.add(headSales);
      CEO.add(headMarketing);

      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);

      headMarketing.add(clerk1);
      headMarketing.add(clerk2);

      //print all employees of the organization
      System.out.println(CEO); 
      
      for (Employee15 headEmployee : CEO.getSubordinates()) {
         System.out.println(headEmployee);
         
         for (Employee15 employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }		
   }
}