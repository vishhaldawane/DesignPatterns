
public class _13BridgePatternDemo {
	public static void main(String[] args) {
	      Shape13 redCircle = new Circle13(100,100, 10, new RedCircle());
	      Shape13 greenCircle = new Circle13(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }

}


interface A {
	void fun();
}
interface B {
	void foo();
}

interface C {
	void fee();
}

abstract class Y
{
	abstract void faa();
	
}
class  X extends Y implements A,B,C
{
	

	@Override
	public void fee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
	
	void far()  { }

	@Override
	void faa() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
interface R {
	void process();
}
class Pqr implements R
{
	C c; //hasA
	
	Pqr(C c) {
		this.c = c;
	}
	public void process() {
		c.fee();
	}
}

class Tester2
{
	public static void main(String[] args) {
		
		X x = new X();
		x.faa(); //Y
		x.far(); //X
		x.fee(); //C
		x.foo(); //B
		x.fun(); //A
		
		R  r = new Pqr(x);
		r.process();
		
	}
}