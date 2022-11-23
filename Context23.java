public class Context23 {
   private State state;

   public Context23(){
      state = null;
   }

   public void setState(State state){//either StartState | StopState
      this.state = state;		
   }

   public State getState(){
      return state;
   }
}

//Context23 c = new Context23();
//StartState s = new StartState();
//c.setState(s);