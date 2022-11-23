public class _23StatePatternDemo {
   public static void main(String[] args) {
      Context23 context = new Context23();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}

/*
	call by value	
	
	call by address
	
	call by ref

	
	void swap1(int i,int j) //call by value
	{
	}
	void swap2(int *i,int *j) //call by add
	{
	}
	void swap3(int &i,int &j) // call by ref
	{
	}
	void swap(Account x, Account y) {x... }
	main()
	{
		int i=10; int j=20;
		swap3(i,j); //value
	
		Account p; Account q;
		
		swap(p,q);
		
	}



*/