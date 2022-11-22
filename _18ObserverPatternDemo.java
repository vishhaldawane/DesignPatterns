
public class _18ObserverPatternDemo {
	 public static void main(String[] args) {
		 
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15\n");	
	      subject.setState(15);
	      
	      System.out.println("-----------");
	      
	      System.out.println("Second state change: 10\n");	
	      subject.setState(10);
	   }

}
