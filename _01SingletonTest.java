import java.util.Calendar;


//https://github.com/vishhaldawane/DesignPatterns

public class _01SingletonTest {
	public static void main(String[] args) 
	{
		System.out.println("Begin main...");
		
		Kitchen x = Kitchen.getKitchen();
		System.out.println("x "+x);
		
		Kitchen y = Kitchen.getKitchen();
		System.out.println("y "+y);
		
		Kitchen z = Kitchen.getKitchen();
		System.out.println("z "+z);
		
		System.out.println("End main...");
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		Calendar cal4 = Calendar.getInstance();
		Calendar cal5 = Calendar.getInstance();

		
		
		System.out.println("cal1 "+cal1.hashCode());
		System.out.println("cal2 "+cal2.hashCode());
		System.out.println("cal3 "+cal3.hashCode());
		System.out.println("cal4 "+cal4.hashCode());
		System.out.println("cal5 "+cal5.hashCode());

		
	}
}

class Kitchen
{
	private static Kitchen ref; // created only once

	private Kitchen() 
	{
		System.out.println("Kitchen Ctor()..");
	}	
	
	static Kitchen getKitchen()
	{
		System.out.println("getKitchen()...");
		
		if(ref==null)
		{
			System.out.println("creating Kitchen...");
			ref = new Kitchen();
		}
		else {
			System.out.println("Kitchen is already created...");
		}
		return ref;
	}
}

