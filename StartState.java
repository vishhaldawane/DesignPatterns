public class StartState implements State {

   public void doAction(Context23 context) {
      System.out.println("Player is in start state");
      context.setState(this);	
   }

   public String toString(){
      return "Start State";
   }
}