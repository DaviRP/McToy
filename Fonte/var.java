class var{

	private String name;
	private Double value;

	public var(String n){

		this.name=n;
		this.value=0;
	}

	public String getName(){

		return this.name;
	}
	public Double getValue(){

		return this.value;
	}
	public void setName(String n){
		this.name=n;
	}
	public void setValue(Double v){
		this.value=v;
	}	
}