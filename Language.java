public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken +
                ". The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        Language tagalog = new Language("Tagalog", 1000000, "Philippines", "verb-object-subject or subject-verb-object");
        tagalog.getInfo(); // Call getInfo() to display language information
    }
}
