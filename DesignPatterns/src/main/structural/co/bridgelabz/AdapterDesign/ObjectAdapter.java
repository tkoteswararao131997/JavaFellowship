package co.bridgelabz.AdapterDesign;

public class ObjectAdapter implements Adapter
{
	Socket sock=new Socket();

	@Override
	public Volt get3Volt() {
		Volt v=sock.getVolt();
		return calculateVolt(v,40);
	}

	@Override
	public Volt get12Volt() {
		Volt v=sock.getVolt();
		return calculateVolt(v,10);
	}

	@Override
	public Volt get120Volt() {
		return sock.getVolt();
	}
	
	private Volt calculateVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
	
}
