public class MySquare extends MyShape {

   public MySquare(){
     type = "MySquare";
   }

   @Override
   public void draw() {
      System.out.println("Inside MySquare::draw() method.");
   }
}