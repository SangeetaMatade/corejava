class Contractor
{
	private String name;
	private String function;
	private int noOffunction;
	private int duration;
	private boolean quality;
	
	
	void setName(String name){
		this.name=name;
	}
	void setFunction(String function){
		this.function=function;
	}
	void setNoOffunction(int noOffunction){
		this.noOffunction=noOffunction;
	}
	void setDuration(int duration){
		this.duration=duration;
	}
	void setQuality(boolean quality){
		this.quality=quality;
	}
	String getName(){
		return this.name;
	}
	String getFunction(){
		return this.function;
	}
	int getNoOffunction(){
		return this.noOffunction;
	}
	int getDuration(){
		return this.duration;
	}
	boolean getQuality(){
		return this.quality;
	}
	
}