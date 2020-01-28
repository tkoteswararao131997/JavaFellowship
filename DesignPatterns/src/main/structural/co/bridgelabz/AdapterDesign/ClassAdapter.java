package co.bridgelabz.AdapterDesign;

public class ClassAdapter extends Socket implements Adapter
{
	@Override
	public Volt get120Volt() 
	{
		return getVolt();
	}
	
	@Override
	public Volt get3Volt() 
	{
		Volt v=getVolt();
		return convertVolt(v,40);	
	}

	@Override
	public Volt get12Volt() 
	{
		Volt v=getVolt();
		return convertVolt(v,10);	
	}
	/**
	 * for calculating volts
	 * @param v
	 * @param i
	 * @return
	 */
	private Volt convertVolt(Volt v, int i) 
	{
		return new Volt (v.getVolts()/i);
	}

}
