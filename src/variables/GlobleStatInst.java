package variables;

public class GlobleStatInst {
	
	int a =12;
	static String name ="Ram";
	
	public static void main(String[] args) 
	{
		GlobleStatInst gs = new GlobleStatInst();
		gs.add();
		System.out.println(name);
	}
	
	public void add ()
	{
		int c =23;
		int d =34;
		System.out.println(d+this.a);
		System.out.println(c);
		
	}

}
