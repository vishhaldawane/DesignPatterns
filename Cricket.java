public class Cricket extends Game {

   @Override
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
      hitSixer();
      hitSixer();
      hitSixer();
      hitSixer();
      hitSixer();
      hitSixer();
   }
   private void hitSixer()
   {
	   System.out.println("hitting the sixer....");
   }

@Override
void toss() {
	// TODO Auto-generated method stub
	System.out.println("Cricket toss....");
}

@Override
void declareWinner() {
	// TODO Auto-generated method stub
	System.out.println("Declaring Cricket winner....");
}
}