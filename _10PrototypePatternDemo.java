
public class _10PrototypePatternDemo {
	public static void main(String[] args) 
	{
	      ShapeCache.loadCache();

	      MyShape clonedShape = (MyShape) ShapeCache.getShape("1");
	      System.out.println("MyShape : " + clonedShape.getType());		

	      MyShape clonedShape2 = (MyShape) ShapeCache.getShape("2");
	      System.out.println("MyShape : " + clonedShape2.getType());		

	      MyShape clonedShape3 = (MyShape) ShapeCache.getShape("3");
	      System.out.println("MyShape : " + clonedShape3.getType());		
	   }

}
