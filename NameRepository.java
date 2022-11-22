
//THE GLASS
public class NameRepository implements MyContainer
{
	//CONTENT OF THE GLASS
	public String names[] = {"Aman" , "Ashutosh" ,"Prashant" , "Swapnil","Kundan","Utkarsh","Nikit","Murli","Harshal","Vishhal"};

	
	public MyIterator getMyIterator() {

		return new MyNameIterator();
	}
	
	//container implementing the iterator | STRAW IMPLEMENTATION
	private class MyNameIterator implements MyIterator
	{
		int index;

		public boolean hasNext() 
		{
			if(index < names.length)
			{
	            return true;
	        }
	        return false;
		}

		public Object next() 
		{
			 if(this.hasNext())
			 {
		            return names[index++];
		     }
		     return null;
		}
	}
}
