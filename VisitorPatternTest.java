//package com.design.pattern.behaviour.visitor;
/*
 * In Visitor pattern, we use a visitor class which changes the executing 
 * algorithm of an element class. By this way, execution algorithm of 
 * element can vary as and when visitor varies.
 *  
 * This pattern comes under behavior pattern category. 
 * As per the pattern, element object has to accept the visitor object 
 * so that visitor object handles the operation on the element object.
 */
interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	}

class Keyboard implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
class Monitor implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
class Mouse implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
class Computer implements ComputerPart {
	
	   ComputerPart[] parts;

	   public Computer() {
		   
	      parts = new ComputerPart[] {
	    		  new Mouse(), 
	    		  new Keyboard(), 
	    		  new Monitor()
	    	};		
	   } 


	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(computerPartVisitor);
	      }
	      computerPartVisitor.visit(this);
	   }
	}
interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	   @Override
	   public void visit(Computer computer) {
	      System.out.println("Displaying Computer.");
	   }

	   @Override
	   public void visit(Mouse mouse) {
	      System.out.println("Displaying Mouse.");
	      // logic for the volage of mouse..during the visit...
	   }

	   @Override
	   public void visit(Keyboard keyboard) {
	      System.out.println("Displaying Keyboard.");
	   }

	   @Override
	   public void visit(Monitor monitor) {
	      System.out.println("Displaying Monitor.");
	   }
	}


public class VisitorPatternTest {
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}
}
