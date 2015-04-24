class Atribuicao
{
	public Inteiro[] atribuiVal(Inteiro[][] b, String a)
	{
		
		String valor;
		String var1;
		double val1=0;	
		var1=a.substring(0, a.indexOf("="));
		String g;
		char c;
		int d=0;
		d = a.indexOf("=")+1;
		c = a.charAt(d);
		if (Character.isDigit(c))
			{
				g=a.substring(a.indexOf("=")+1, a.length());
				val1=Integer.parseInt(g);
			}
		else
		{
			g = a.substring(a.indexOf("=")+1,a.length());
			for(int num=0;num<b.length;num++)
			{
				if(b[num].var.equals(g))
				{
					val1 = b[num].val;
				}																								
			}
		}
		for(int p=0;p<b.length;p++)
		{
			if((b[p].var.equals(var1)))
			{				
				b[p].val=val1;
			}
		}
		return b;
	}
}