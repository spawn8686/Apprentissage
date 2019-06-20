package p0010;

public class P0010
{

	public static void main(String[] args)
	{
		Chien medor, rex;
		Chat minou, felix;
		medor = new Chien("Médor");
		rex = new Chien("Rex");
		minou = new Chat("Minou");
		felix = new Chat("Felix");
		
		medor.dormir();
		rex.dormir();
		minou.dormir();
		felix.dormir();
		
		medor.faireLeBeau();
		rex.faireLeBeau();
		minou.ronronner();
		felix.ronronner();
	}

}
