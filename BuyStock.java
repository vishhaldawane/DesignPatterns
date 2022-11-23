public class BuyStock implements Order { //First Command impl
   private Stock abcStock; // null

   public BuyStock(Stock abcStock){ //initialization
      this.abcStock = abcStock; // null is gone, and stock is set
   }

   public void execute() {
      abcStock.buy();//on that stock run the buy();
   }
}