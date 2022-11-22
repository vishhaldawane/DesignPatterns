import java.util.HashMap;

public class ShapeFactory12
{
   private static final HashMap<String, Shape> circleMap = new HashMap();

   public static Shape getCircle(String color) 
   {
      Circle12 circle = (Circle12)circleMap.get(color);

      if(circle == null) {
         circle = new Circle12(color);
         
         circleMap.put(color, circle);
         System.out.println("\nCreating circle of color : " + color+"\n");
      }
      return circle;
   }
}