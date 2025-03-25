class Jeep
{
static String brand="recon";
      static String colour="light blue";
	  static String milage="25kph";
	   // name =""; //Invalid statment 
	  public static void main(String a[]){
	  System.out.println("jeep brand is "+ brand);
	  System.out.println("jeep colour is "+ colour);
	  System.out.println("jeep milage is "+ milage);
	  //updateName();
	  //name=" ";
	  brand="Wrangler";
	  System.out.println("name after re-init");
	  System.out.println("Wrangler brand is "+brand);
	  }
	  public static void updateName(){
	 // void statment re-init the reference
	  brand="Wrangler";
	  }
}