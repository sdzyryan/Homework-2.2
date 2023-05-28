public class Ravenclaw extends Hogwarts {

    private int intelligenceLevel;
    private int wisdomLevel;
    private int witLevel;
    private int creativityLevel;

    public Ravenclaw(String nameSurname, int magicPower, int transgresionDistance, int intelligenceLevel,
                     int wisdomLevel, int witLevel, int creativityLevel) {
        super(nameSurname, magicPower, transgresionDistance);
        this.intelligenceLevel = intelligenceLevel;
        this.wisdomLevel = wisdomLevel;
        this.witLevel = witLevel;
        this.creativityLevel = creativityLevel;
    }

    public void printInformation() {
        printGeneralInformation();
        System.out.println("Особые навыки студента Когтеврана: ум - " + getIntelligenceLevel() +
                "; мудрость - " + getWisdomLevel() +
                "; остроумие - " + getWitLevel() +
                "; творчество - " + getCreativityLevel() + ".");
        printSeparator();
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        this.intelligenceLevel = intelligenceLevel;
    }

    public int getWisdomLevel() {
        return wisdomLevel;
    }

    public void setWisdomLevel(int wisdomLevel) {
        this.wisdomLevel = wisdomLevel;
    }

    public int getWitLevel() {
        return witLevel;
    }

    public void setWitLevel(int witLevel) {
        this.witLevel = witLevel;
    }

    public int getCreativityLevel() {
        return creativityLevel;
    }

    public void setCreativityLevel(int creativityLevel) {
        this.creativityLevel = creativityLevel;
    }
}
