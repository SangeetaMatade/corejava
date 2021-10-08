class State{
	public State(String name){
	System.out.println("name of a state is  :"+name);
	}
	
	public State(int noOfvillages){
     System.out.println("number of villages :"+noOfvillages);
	}
	
	public State(Boolean bststate){
		System.out.println("best state :"+bststate);
	}
 public static void main(String args[]){
	 State obj=new State("KARNATAKA");
	 State obj1=new State(100);
	 State obj2=new State(true);
	 
 }
}
		
	 