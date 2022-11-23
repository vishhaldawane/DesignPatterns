public class _24InterpreterDemo {

	   //Rule: Robert and John are male
	   public static Expression getMaleExpression(){
	      Expression robert = new TerminalExpression("Robert");
	      Expression john = new TerminalExpression("John");
	      return new OrExpression(robert, john);		
	   }

	   //Rule: Julie is a married women
	   public static Expression getMarriedWomanExpression(){
	      Expression julie = new TerminalExpression("Julie");
	      Expression married = new TerminalExpression("Married");
	      return new AndExpression(julie, married);		
	   }

	   public static void main(String[] args) {
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();

	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	   }
	}












/*----------------------------*/

 interface Expression {
	   public boolean interpret(String context);
	}
 /*----------------------------*/

 class TerminalExpression implements Expression {
	
	   private String data; //male   te.interpret("john is a male ");

	   public TerminalExpression(String data){
	      this.data = data; 
	   }

	   @Override
	   public boolean interpret(String context) {
	   
	      if(context.contains(data)){
	         return true;
	      }
	      return false;
	   }
	}
 /*----------------------------*/

 class OrExpression implements Expression {
	 
	   private Expression expr1 = null;
	   private Expression expr2 = null;

	   public OrExpression(Expression expr1, Expression expr2) { 
	      this.expr1 = expr1;
	      this.expr2 = expr2;
	   }

	   @Override
	   public boolean interpret(String context) {		
	      return expr1.interpret(context) || expr2.interpret(context);
	   }
	}
 /*----------------------------*/

 class AndExpression implements Expression {
	 
	   private Expression expr1 = null;
	   private Expression expr2 = null;

	   public AndExpression(Expression expr1, Expression expr2) { 
	      this.expr1 = expr1;
	      this.expr2 = expr2;
	   }

	   @Override
	   public boolean interpret(String context) {		
	      return expr1.interpret(context) && expr2.interpret(context);
	   }
	}
 
 
 
 
 
 
 
 
 /*
  * 
  * 
  * 
  * 
  * 
  * 
  * 	select * from emp where esal > 5000 and loc='NY'
  * 
  * 
  * 	select * from emp where esal.greaterThan(5000).and.loc.equals('ny');
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  */
 