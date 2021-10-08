class Helmetuser{
public static void main(String args[]){
Helmet Helmet=new Helmet();
Helmet.Brand="RoyalEnfield";
Helmet.colour="black";
Helmet.style="fullface";
Helmet.cost=60.00;
Helmet.materials=materialsused.carbonfiber;
 
Helmet Helmet1=new Helmet();
Helmet1.Brand="vega";
Helmet1.colour="red";
Helmet1.style="halfface";
Helmet1.cost=90.00;
Helmet1.materials=materialsused.plastic;

Helmet Helmet2=new Helmet();
Helmet2.Brand="Steelbird";
Helmet2.colour="white";
Helmet2.style="modular helmet";
Helmet2.cost=100.00;
Helmet2.materials=materialsused.aramid;

Helmet.Protection();
Helmet.precaution();
Helmet1.Protection();
Helmet1.precaution();
Helmet2.Protection();
Helmet2.precaution();
}
}



  
  
  
