// Create a Main class
public class Main {
  int amt;
  int validity;
  String datapack;

  // Create a class constructor for the Main class
  public Main(int x) {
    amt=x;
    validity=0;
    datapack="0";
  }
  
   public Main(int x,int y) {
    amt=x;
    validity=y; 
    datapack="0";
  }
  
  public Main(int x,int y,String z) {
    amt=x;
    validity=y; 
    datapack=z;
 }   
     public void display() {
        System.out.println("--- Recharge Details ---");
        System.out.println("Amount: Rs. " + amt);
        if (validity > 0) {
            System.out.println("Validity: " + validity + " Days");
        }
        System.out.println("Data Pack: " + datapack);
        System.out.println(); 
    }
    

    public static void main(String[] args) {
        Main plan1 = new Main(199);
        plan1.display();
        Main plan2 = new Main(399, 28);
        plan2.display();
        Main plan3 = new Main(749, 90, "2GB/day");
        plan3.display();
    }
}
