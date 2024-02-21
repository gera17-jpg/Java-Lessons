public class Droid{
  int bateryLevel = 100;
  String name;

  public Droid(String droidName){
     name = droidName;
  }

  
  public void  performTask(String task){
    System.out.println(name +" "+ "is performing task:" + task); 
  }

  public void newBateryLevel(){
    bateryLevel = bateryLevel - 10;
    System.out.println("Task complete. Batery Level:" + bateryLevel);
  }

  public static void main(String[] args){
    Droid name = new Droid("Codey");
    System.out.println(name);
    name.performTask("cleaning");
    name.newBateryLevel();
    name.performTask("Cooking");
    name.newBateryLevel();

  }

  public String toString(){
    return "Hello, I’m droid"+ " "+ name +".";
  }

}
