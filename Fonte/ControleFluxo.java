class ControleFluxo
{
	public String seI(String [][] cod, int codC, Inteiro [] ints)
	{
		ControleFluxo se = new ControleFluxo();
		Funcoes teste = new Funcoes();
		Atribuicao atri = new Atribuicao();
		Operacoes operVar = new Operacoes();
		Imprime imprime = new Imprime();
		Laco laco = new Laco();
		int b=0, a=0, h=0, d=0, c=0, cd=0, num=0, testes=0, av=0;
		double cd1=0, cd2=0, cd11=0, cd22=0;
		String cond=cod[codC];
		String escopo;
		String g;
		String condicao;
		String controle="vazio";
		String op="vazio";
		String op1="vazio";
		boolean condicao1;
		b = codC;
		escopo = (cod[b].substring(cod[b].indexOf("-")+1, cod[b].length()));
		escopo = "finish-"+escopo;
		for(a=0;h!=1;b++)
		{
			if(cod[b].equals(escopo))
			{
				h=1;
			}
			a++;
		}
		String[] vet;
		vet = new String[a];
		b = codC;	
		for(c=0;c<a;c++)
		{
			vet[c] = cod[b];
			b++;
		}
		if(cond.contains(">="))
		{
			av=2;
			op=">=";
		}
		else if(cond.contains("<="))
		{
			av=2; 
			op="<=";
		}
		else if(cond.contains("="))
		{
			av=1;
			op="=";
		}
		else if(cond.contains(">"))
		{
			av=1;
			op=">";
		}
		else if(cond.contains("<"))
		{
			av=1;
			op="<";
		}
		else if(cond.contains("!"))
		{
			av=1;
			op="!";
		}
		d = vet[0].indexOf("(")+1;
		c = vet[0].charAt(d);
		if (Character.isDigit(c))
		{
			g=vet[0].substring(vet[0].indexOf("(")+1, vet[0].indexOf(op));
			cd1=Integer.parseInt(g);					
		}
		else
		{
			g = vet[0].substring(vet[0].indexOf("(")+1, vet[0].indexOf(op));
			for(int test=0;test<ints.length;test++)
			{
				if(ints[test].var.equals(g))
				{
					cd1= ints[test].val;
				}																								
			}
		}
		d = vet[0].indexOf(op)+av;
		c = vet[0].charAt(d);
		if (Character.isDigit(c))
		{
			g=vet[0].substring(vet[0].indexOf(op)+av, vet[0].indexOf(")"));
			cd2=Integer.parseInt(g);					
		}
		else
		{
			g = vet[0].substring(vet[0].indexOf(op)+av, vet[0].indexOf(")"));
			for(int test=0;test<ints.length;test++)
			{
				if(ints[test].var.equals(g))
				{
					cd2= ints[test].val;
				}																									
			}
		}
		condicao1=teste.condLaco(cd1, cd2, op);
		if(condicao1)
		{
			b=1;
			for(;b<a;b++)
			{	
				num = teste.encontra(vet[b]);
				switch(num)
				{
					case(3):
						op1="+";
						ints = operVar.somaI(ints, vet[b], op1);
					break;
					case(4):
						op1="-";
						ints = operVar.somaI(ints, vet[b], op1);
					break;
					case(5):
						op1="/";
						ints = operVar.somaI(ints, vet[b], op1);
					break;
					case(6):
						op1="*";
						ints = operVar.somaI(ints, vet[b], op1);
					break;
					case(7):
						op1="%";
						ints = operVar.somaI(ints, vet[b], op1);
					break;
					case(8):
						ints = atri.atribuiVal(ints, vet[b]);
					break;
					case(9):
						controle=laco.lacoI(vet, b, ints);
						testes=0;
						for(;testes!=1;b++)
						{
							if(vet[b].equals(controle))
							{
								testes=1;
								b--;
							}
						}
					break;
					case(10):
						imprime.printa(vet[b]);
					break;
					case(11):
						imprime.show(vet[b], ints);					
					break;
					case(12):
						controle=se.seI(vet, b, ints);
						testes=0;
						for(;testes!=1;b++)
						{
							if(vet[b].equals(controle))
							{
								testes=1;
								b--;
							}
						}
					break;
				}				
			}
		}				


		return escopo;
	}
}