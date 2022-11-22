public class FootBall extends Game {

   @Override
   void endPlay() {
      System.out.println("FootBall Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("FootBall Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("FootBall Game Started. Enjoy the game!");
      hitGoal();
      hitGoal();
      hitGoal();
   }
   
   void penalty() {
	   System.out.println("FoodBall Penalty....");
   }
   private void hitGoal()
   {
	   System.out.println("hitting the goal....");
   }
   @Override
   void toss() {
   	// TODO Auto-generated method stub
   	System.out.println("FootBall toss....");
   }

   @Override
   void declareWinner() {
   	// TODO Auto-generated method stub
   	System.out.println("Declaring FootBall winner....");
   }

}