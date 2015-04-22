class variavel{

	private String nome;
	private Double valor;

	public variavel(String n){

		this.nome=n;
		this.valor=0;
	}

	public String getNome(){

		return this.nome;
	}
	public Double getValor(){

		return this.valor;
	}
	public void setNome(String n){
		this.nome=n;
	}
	public void setValor(Double v){
		this.valor=v;
	}	
}