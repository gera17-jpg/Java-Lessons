class inheretanceNoodle {
  
  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    Pho phoChay = new Pho();
    System.out.println(phoChay.shape);
    
  }
  
}

//in Pho.java
class Pho extends Noodle {
  Pho(){
    super(30.0,0.64,"flat","rice flour");
  }
 
}
