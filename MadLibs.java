public class MadLibs {
  /*
    This program generates a mad libbed story.
Author: Gem
Date: 2/9/2024
  */
  	public static void main(String[] args){
        String name1="Florence";
        String adjective1="dijected";
        String adjective2="hectic";
        String noun1="idiot";
        String noun2="cereals";
        String verb1="hum";
        String noun3="Jaw";
        String noun4="neighbor";
        String adjective3="irritated";
        String name2="Raul";
        String place1="Iceland";
        String noun5="junk";
        int number=3030;
        String noun6="female";
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
