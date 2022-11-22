public class _12FlyweightPatternDemo 
{
   private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
   
   public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Circle12 circle = (Circle12) ShapeFactory12.getCircle(getRandomColor());
         circle.setX(getRandomX());
         circle.setY(getRandomY());
         circle.setRadius(100);
         circle.draw();
      }
   }
   private static String getRandomColor() {
      return colors[ (int)(Math.random()*colors.length)  ]; //0 to 4
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}