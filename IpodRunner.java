class IpodRunner{
	public static void main(String args[]){
		Ipod i=new Ipod();
		Ipod i1=new Ipod();
		Ipod i2=new Ipod();
		
		i.IpodName="Apple1";
		i.inch=4;
		i.brightness="500 cd/m2 max";
		i.contrast="800:1 ratio";
		i.fingerprint=true;
		
		i1.IpodName="Apple2";
		i1.inch=5;
		i1.brightness="400 cd/m2 max";
		i1.contrast="700:2 ratio";
		i1.fingerprint=false;
		
		i2.IpodName="Apple1";
		i2.inch=6;
		i2.brightness="500 cd/m2 max";
		i2.contrast="700:1 ratio";
		i2.fingerprint=true;
		
		i.music();
		System.out.println();
		i1.video();
		System.out.println();
		i2.music();
	}
}