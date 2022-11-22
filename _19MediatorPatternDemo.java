
public class _19MediatorPatternDemo 
{
   public static void main(String[] args) 
   {
      User robert = new User("Robert");
      User john = new User("John");
      User jane = new User("Jane");
      User jim = new User("Jim");
      
      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
      jane.sendMessage("Hieeee all");
      jim.sendMessage("Hmmm");
   }
}