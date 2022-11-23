public abstract class AbstractLogger { //ConsoleLogger cl  = ..; cl.setNextLogger(el);
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
	   System.out.println("S-----------------");
      if(this.level <= level){
         write(message);//invoked for all the loggers one by one
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
	   System.out.println("E-----------------");

   }

   abstract protected void write(String message);
	
}