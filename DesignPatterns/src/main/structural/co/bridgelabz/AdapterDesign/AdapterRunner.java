package co.bridgelabz.AdapterDesign;
/**
 * AdapterDesign:-one object witch behaving like a bridge between two unliked objects.
 * @author user
 *
 */
public class AdapterRunner {

	public static void main(String[] args) 
	{
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() 
	{
		Adapter oa=new ClassAdapter();
		Volt v3=getVolt(oa,3);
		Volt v12=getVolt(oa, 12);
		Volt v120=getVolt(oa, 120);
		System.out.println("v3 volts using Adapter "+v3.getVolts());
		System.out.println("v12 volts using Adapter "+v12.getVolts());
		System.out.println("v120 volts using Adapter "+v120.getVolts());
		
	}

	private static void testClassAdapter() 
	{
		Adapter ca=new ClassAdapter();
		Volt v3=getVolt(ca,3);
		Volt v12=getVolt(ca, 12);
		Volt v120=getVolt(ca, 120);
		System.out.println("v3 volts using Adapter "+v3.getVolts());
		System.out.println("v12 volts using Adapter "+v12.getVolts());
		System.out.println("v120 volts using Adapter "+v120.getVolts());
	}
	private static Volt getVolt(Adapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
	

}
