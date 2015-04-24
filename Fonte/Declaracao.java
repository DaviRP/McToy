class Declaracao
{
	public Inteiro[] decVar(Inteiro [] ints, String a, int y)
	{
		ints[y].var = a.replace("i_","");
		ints[y].val = 0;
		return ints;
	}
	public Inteiro[] decAtr(Inteiro [] ints, String a, int y)
	{
		ints[y].var = a.substring(a.indexOf("_")+1, a.indexOf("="));
		int  d=0;
		double val1=0;
		char c;
		String g;
		d = a.indexOf("=")+1;
		c = a.charAt(d);
		if (Character.isDigit(c))
			{
			g=a.substring(a.indexOf("=")+1, a.length());
			val1=Integer.parseInt(g);	
			ints[y].val=val1;			
			}
		else
		{
			g = a.substring(a.indexOf("=")+1, a.length());
			for(int p=0;p<ints.length;p++)
			{	
				if(ints[p].var.equals(g))
				{
				val1=ints[p].val;
				ints[y].val=val1;
				}
			}
		}			
		return ints;																								
	}
}
