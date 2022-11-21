public class MyRectangle extends MyShape {

   public MyRectangle(){
     type = "MyRectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside MyRectangle::draw() method.");
   }
}