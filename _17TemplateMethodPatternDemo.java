/*
class Sports
{
	static void fun(Game x)
	{
		x.play();
	}
}
*/

class GameCreator
{
	 static Game g ;
		
	 public static Game getGame() {
		 g = new Cricket();
		 return g;
	 }
}
public class _17TemplateMethodPatternDemo {
	 public static void main(String[] args) {
		 
		 //Game g = GameCreator.getGame();
		 //g.play();
		 
		 System.out.println("---------");
		 
	      Game game = new Cricket();
	      game.play(game);
	      System.out.println();
	      game = new FootBall();
	      game.play(game);		
	      
	     /* Cricket cgame = new Cricket();
	      cgame.endPlay();
	      cgame.startPlay();
	      cgame.initialize();
	      cgame.initialize();
	      cgame.initialize();
	      Sports.fun(cgame);
	      
	      System.out.println();
	      
	      FootBall fgame = new FootBall();
	      Sports.fun(fgame);
	      /*fgame.endPlay();
	      fgame.endPlay();
	      fgame.endPlay();
	      fgame.startPlay();
	      fgame.initialize();*/
	      
	   }

}
