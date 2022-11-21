public class MyCircle extends MyShape {

   public MyCircle(){
     type = "MyCircle";
   }

   @Override
   public void draw() {
      System.out.println("Inside MyCircle::draw() method.");
   }
}