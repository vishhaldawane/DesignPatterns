
public class _22CommandPatternDemo 
{
	public static void main(String[] args) 
	{
	      Stock abcStock = new Stock();//ABC 10
	      
	      

	      //command - Order
	      BuyStock buyStockOrder = new BuyStock(abcStock); //command1
	      SellStock sellStockOrder = new SellStock(abcStock); //command2

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	   }

}
