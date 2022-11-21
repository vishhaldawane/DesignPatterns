public class _14DecoratorPatternDemo {
   public static void main(String[] args) {

      /*Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();*/
	  Shape shape = new Circle();
	  shape.draw(); 
	  System.out.println("-------");
	  Shape shapeDecor = new RedShapeDecorator(shape);
	  shapeDecor.draw();
	  
   }
}